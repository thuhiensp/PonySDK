
package com.ponysdk.core.ui.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.ponysdk.core.server.application.UIContext;
import com.ponysdk.core.ui2.PWindow2;

public class PWindowManager2 {

    private static final int INITIAL_WINDOW_MAP_CAPACITY = 8;

    private static final String ROOT = "WindowManager";

    private final Map<Integer, PWindow2> preregisteredWindows = new HashMap<>(INITIAL_WINDOW_MAP_CAPACITY);
    private final Map<Integer, PWindow2> registeredWindows = new HashMap<>(INITIAL_WINDOW_MAP_CAPACITY);

    private PWindowManager2() {
    }

    public static PWindowManager2 get() {
        final UIContext uiContext = UIContext.get();
        PWindowManager2 windowManager = uiContext.getAttribute(ROOT);
        if (windowManager == null) {
            windowManager = new PWindowManager2();
            uiContext.setAttribute(ROOT, windowManager);
        }
        return windowManager;
    }

    public static void registerWindow(final PWindow2 window) {
        get().registerWindow0(window);
    }

    static void unregisterWindow(final PWindow2 window) {
        get().unregisterWindow0(window);
    }

    public static void closeAll() {
        get().closeAll0();
    }

    public static final Collection<PWindow2> getWindows() {
        return get().registeredWindows.values();
    }

    public static final PWindow2 getWindow(final int windowID) {
        return get().registeredWindows.get(windowID);
    }

    private void registerWindow0(final PWindow2 window) {
        preregisteredWindows.remove(window.getID());
        registeredWindows.put(window.getID(), window);
    }

    private void unregisterWindow0(final PWindow2 window) {
        preregisteredWindows.remove(window.getID());
        registeredWindows.remove(window.getID());
    }

    private void closeAll0() {
        registeredWindows.forEach((id, window) -> window.close());
        registeredWindows.clear();
        preregisteredWindows.clear();
    }

}
