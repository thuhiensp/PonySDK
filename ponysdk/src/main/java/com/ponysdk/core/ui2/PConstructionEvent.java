
package com.ponysdk.core.ui2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.json.JsonValue.ValueType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ponysdk.core.server.application.UIContext;
import com.ponysdk.core.ui2.app_banner.PBeforeInstallPromptEvent;
import com.ponysdk.core.ui2.background_fetch.PBackgroundFetchClickEvent;
import com.ponysdk.core.ui2.background_fetch.PBackgroundFetchEvent;
import com.ponysdk.core.ui2.background_fetch.PBackgroundFetchFailEvent;
import com.ponysdk.core.ui2.background_fetch.PBackgroundFetchSettledFetch;
import com.ponysdk.core.ui2.background_fetch.PBackgroundFetchedEvent;
import com.ponysdk.core.ui2.background_sync.PSyncEvent;
import com.ponysdk.core.ui2.css.PFontFace;
import com.ponysdk.core.ui2.css.PFontFaceSetLoadEvent;
import com.ponysdk.core.ui2.css.PMediaQueryListEvent;
import com.ponysdk.core.ui2.device_orientation.PDeviceMotionEvent;
import com.ponysdk.core.ui2.device_orientation.PDeviceOrientationEvent;
import com.ponysdk.core.ui2.dom.PMessagePort;
import com.ponysdk.core.ui2.encryptedmedia.PMediaEncryptedEvent;
import com.ponysdk.core.ui2.encryptedmedia.PMediaKeyMessageEvent;
import com.ponysdk.core.ui2.events.PAnimationEvent;
import com.ponysdk.core.ui2.events.PAnimationPlaybackEvent;
import com.ponysdk.core.ui2.events.PApplicationCacheErrorEvent;
import com.ponysdk.core.ui2.events.PBeforeUnloadEvent;
import com.ponysdk.core.ui2.events.PClipboardEvent;
import com.ponysdk.core.ui2.events.PCompositionEvent;
import com.ponysdk.core.ui2.events.PCustomEvent;
import com.ponysdk.core.ui2.events.PDragEvent;
import com.ponysdk.core.ui2.events.PErrorEvent;
import com.ponysdk.core.ui2.events.PEvent;
import com.ponysdk.core.ui2.events.PEventTarget;
import com.ponysdk.core.ui2.events.PFocusEvent;
import com.ponysdk.core.ui2.events.PHashChangeEvent;
import com.ponysdk.core.ui2.events.PInputEvent;
import com.ponysdk.core.ui2.events.PKeyboardEvent;
import com.ponysdk.core.ui2.events.PMessageEvent;
import com.ponysdk.core.ui2.events.PMouseEvent;
import com.ponysdk.core.ui2.events.PMutationEvent;
import com.ponysdk.core.ui2.events.PPageTransitionEvent;
import com.ponysdk.core.ui2.events.PPointerEvent;
import com.ponysdk.core.ui2.events.PPopStateEvent;
import com.ponysdk.core.ui2.events.PProgressEvent;
import com.ponysdk.core.ui2.events.PPromiseRejectionEvent;
import com.ponysdk.core.ui2.events.PResourceProgressEvent;
import com.ponysdk.core.ui2.events.PSecurityPolicyViolationEvent;
import com.ponysdk.core.ui2.events.PTextEvent;
import com.ponysdk.core.ui2.events.PTouchEvent;
import com.ponysdk.core.ui2.events.PTransitionEvent;
import com.ponysdk.core.ui2.events.PUIEvent;
import com.ponysdk.core.ui2.events.PWheelEvent;
import com.ponysdk.core.ui2.gamepad.PGamepadEvent;
import com.ponysdk.core.ui2.html.track.PTrackEvent;
import com.ponysdk.core.ui2.indexeddb.PIDBVersionChangeEvent;
import com.ponysdk.core.ui2.mediarecorder.PBlobEvent;
import com.ponysdk.core.ui2.mediastream.PMediaStreamEvent;
import com.ponysdk.core.ui2.mediastream.PMediaStreamTrackEvent;
import com.ponysdk.core.ui2.notifications.PNotificationEvent;
import com.ponysdk.core.ui2.peerconnection.PRTCDTMFToneChangeEvent;
import com.ponysdk.core.ui2.peerconnection.PRTCDataChannelEvent;
import com.ponysdk.core.ui2.peerconnection.PRTCPeerConnectionIceEvent;
import com.ponysdk.core.ui2.presentation.PPresentationConnectionAvailableEvent;
import com.ponysdk.core.ui2.presentation.PPresentationConnectionCloseEvent;
import com.ponysdk.core.ui2.push_messaging.PPushEvent;
import com.ponysdk.core.ui2.sensor.PSensorErrorEvent;
import com.ponysdk.core.ui2.serviceworkers.PExtendableEvent;
import com.ponysdk.core.ui2.serviceworkers.PExtendableMessageEvent;
import com.ponysdk.core.ui2.serviceworkers.PFetchEvent;
import com.ponysdk.core.ui2.serviceworkers.PForeignFetchEvent;
import com.ponysdk.core.ui2.serviceworkers.PInstallEvent;
import com.ponysdk.core.ui2.speech.PSpeechRecognitionError;
import com.ponysdk.core.ui2.speech.PSpeechRecognitionEvent;
import com.ponysdk.core.ui2.speech.PSpeechSynthesisEvent;
import com.ponysdk.core.ui2.storage.PStorageEvent;
import com.ponysdk.core.ui2.vr.PVRDisplayEvent;
import com.ponysdk.core.ui2.webaudio.PAudioProcessingEvent;
import com.ponysdk.core.ui2.webaudio.POfflineAudioCompletionEvent;
import com.ponysdk.core.ui2.webgl.PWebGLContextEvent;
import com.ponysdk.core.ui2.webmidi.PMIDIConnectionEvent;
import com.ponysdk.core.ui2.webmidi.PMIDIMessageEvent;
import com.ponysdk.core.ui2.websockets.PCloseEvent;
import com.ponysdk.core.ui2.webusb.PUSBConnectionEvent;

public class PConstructionEvent {

    private static final Logger log = LoggerFactory.getLogger(PConstructionEvent.class);

    public PEvent constructorEvent(final String eventName, final JsonObject eventInfo) {
        final Map<PEventAttributesName, Object> mapByAtrsName = constructionMap(eventInfo);

        switch (eventName) {
            case "AnimationEvent": {
                return new PAnimationEvent(mapByAtrsName);
            }
            case "AnimationPlaybackEvent": {
                return new PAnimationPlaybackEvent(mapByAtrsName);
            }
            case "ApplicationCacheErrorEvent": {
                return new PApplicationCacheErrorEvent(mapByAtrsName);
            }
            case "AudioProcessingEvent": {
                return new PAudioProcessingEvent(mapByAtrsName);
            }
            case "BackgroundFetchClickEvent": {
                return new PBackgroundFetchClickEvent(mapByAtrsName);
            }
            case "BackgroundFetchEvent": {
                return new PBackgroundFetchEvent(mapByAtrsName);
            }
            case "BackgroundFetchFailEvent": {
                return new PBackgroundFetchFailEvent(mapByAtrsName);
            }
            case "BackgroundFetchedEvent": {
                return new PBackgroundFetchedEvent(mapByAtrsName);
            }
            case "BeforeInstallPromptEvent": {
                return new PBeforeInstallPromptEvent(mapByAtrsName);
            }
            case "BeforeUnloadEvent": {
                return new PBeforeUnloadEvent(mapByAtrsName);
            }
            case "BlobEvent": {
                return new PBlobEvent(mapByAtrsName);
            }
            case "ClipboardEvent": {
                return new PClipboardEvent(mapByAtrsName);
            }
            case "CloseEvent": {
                return new PCloseEvent(mapByAtrsName);
            }
            case "CompositionEvent": {
                return new PCompositionEvent(mapByAtrsName);
            }
            case "CustomEvent": {
                return new PCustomEvent(mapByAtrsName);
            }
            case "DeviceMotionEvent": {
                return new PDeviceMotionEvent(mapByAtrsName);
            }
            case "DeviceOrientationEvent": {
                return new PDeviceOrientationEvent(mapByAtrsName);
            }
            case "DragEvent": {
                return new PDragEvent(mapByAtrsName);
            }
            case "ErrorEvent": {
                return new PErrorEvent(mapByAtrsName);
            }
            case "Event": {
                return new PEvent(mapByAtrsName);
            }
            case "ExtendableEvent": {
                return new PExtendableEvent(mapByAtrsName);
            }
            case "ExtendableMessageEvent": {
                return new PExtendableMessageEvent(mapByAtrsName);
            }
            case "FetchEvent": {
                return new PFetchEvent(mapByAtrsName);
            }
            case "FocusEvent": {
                return new PFocusEvent(mapByAtrsName);
            }
            case "FontFaceSetLoadEvent": {
                return new PFontFaceSetLoadEvent(mapByAtrsName);
            }
            case "ForeignFetchEvent": {
                return new PForeignFetchEvent(mapByAtrsName);
            }
            case "GamepadEvent": {
                return new PGamepadEvent(mapByAtrsName);
            }
            case "HashChangeEvent": {
                return new PHashChangeEvent(mapByAtrsName);
            }
            case "IDBVersionChangeEvent": {
                return new PIDBVersionChangeEvent(mapByAtrsName);
            }
            case "InputEvent": {
                return new PInputEvent(mapByAtrsName);
            }
            case "InstallEvent": {
                return new PInstallEvent(mapByAtrsName);
            }
            case "KeyboardEvent": {
                return new PKeyboardEvent(mapByAtrsName);
            }
            case "MIDIConnectionEvent": {
                return new PMIDIConnectionEvent(mapByAtrsName);
            }
            case "MIDIMessageEvent": {
                return new PMIDIMessageEvent(mapByAtrsName);
            }
            case "MediaEncryptedEvent": {
                return new PMediaEncryptedEvent(mapByAtrsName);
            }
            case "MediaKeyMessageEvent": {
                return new PMediaKeyMessageEvent(mapByAtrsName);
            }
            case "MediaQueryListEvent": {
                return new PMediaQueryListEvent(mapByAtrsName);
            }
            case "MediaStreamEvent": {
                return new PMediaStreamEvent(mapByAtrsName);
            }
            case "MediaStreamTrackEvent": {
                return new PMediaStreamTrackEvent(mapByAtrsName);
            }
            case "MessageEvent": {
                return new PMessageEvent(mapByAtrsName);
            }
            case "MouseEvent": {
                return new PMouseEvent(mapByAtrsName);
            }
            case "MutationEvent": {
                return new PMutationEvent(mapByAtrsName);
            }
            case "NotificationEvent": {
                return new PNotificationEvent(mapByAtrsName);
            }
            case "OfflineAudioCompletionEvent": {
                return new POfflineAudioCompletionEvent(mapByAtrsName);
            }
            case "PageTransitionEvent": {
                return new PPageTransitionEvent(mapByAtrsName);
            }
            case "PointerEvent": {
                return new PPointerEvent(mapByAtrsName);
            }
            case "PopStateEvent": {
                return new PPopStateEvent(mapByAtrsName);
            }
            case "PresentationConnectionAvailableEvent": {
                return new PPresentationConnectionAvailableEvent(mapByAtrsName);
            }
            case "PresentationConnectionCloseEvent": {
                return new PPresentationConnectionCloseEvent(mapByAtrsName);
            }
            case "ProgressEvent": {
                return new PProgressEvent(mapByAtrsName);
            }
            case "PromiseRejectionEvent": {
                return new PPromiseRejectionEvent(mapByAtrsName);
            }
            case "PushEvent": {
                return new PPushEvent(mapByAtrsName);
            }
            case "RTCDTMFToneChangeEvent": {
                return new PRTCDTMFToneChangeEvent(mapByAtrsName);
            }
            case "RTCDataChannelEvent": {
                return new PRTCDataChannelEvent(mapByAtrsName);
            }
            case "RTCPeerConnectionIceEvent": {
                return new PRTCPeerConnectionIceEvent(mapByAtrsName);
            }
            case "ResourceProgressEvent": {
                return new PResourceProgressEvent(mapByAtrsName);
            }
            case "SecurityPolicyViolationEvent": {
                return new PSecurityPolicyViolationEvent(mapByAtrsName);
            }
            case "SensorErrorEvent": {
                return new PSensorErrorEvent(mapByAtrsName);
            }
            case "SpeechRecognitionError": {
                return new PSpeechRecognitionError(mapByAtrsName);
            }
            case "SpeechRecognitionEvent": {
                return new PSpeechRecognitionEvent(mapByAtrsName);
            }
            case "SpeechSynthesisEvent": {
                return new PSpeechSynthesisEvent(mapByAtrsName);
            }
            case "StorageEvent": {
                return new PStorageEvent(mapByAtrsName);
            }
            case "SyncEvent": {
                return new PSyncEvent(mapByAtrsName);
            }
            case "TextEvent": {
                return new PTextEvent(mapByAtrsName);
            }
            case "TouchEvent": {
                return new PTouchEvent(mapByAtrsName);
            }
            case "TrackEvent": {
                return new PTrackEvent(mapByAtrsName);
            }
            case "TransitionEvent": {
                return new PTransitionEvent(mapByAtrsName);
            }
            case "UIEvent": {
                return new PUIEvent(mapByAtrsName);
            }
            case "USBConnectionEvent": {
                return new PUSBConnectionEvent(mapByAtrsName);
            }
            case "VRDisplayEvent": {
                return new PVRDisplayEvent(mapByAtrsName);
            }
            case "WebGLContextEvent": {
                return new PWebGLContextEvent(mapByAtrsName);
            }
            case "WheelEvent": {
                return new PWheelEvent(mapByAtrsName);
            }
        }
        log.info("it has not information of event");
        return null;
    }

    private Map<PEventAttributesName, Object> constructionMap(final JsonObject eventInfo) {
        final Map<PEventAttributesName, Object> map = new HashMap<>();
        final Set<String> keySet = eventInfo.keySet();
        for (final String key : keySet) {
            final int number = Integer.parseInt(key);
            final PEventAttributesName nameOfAtrs = PEventAttributesName.fromRawValue(number);
            map.put(nameOfAtrs, getValue(eventInfo, key, nameOfAtrs));
        }
        return map;
    }

    private Object getValue(final JsonObject eventInfo, final String key, final PEventAttributesName nameOfAtrs) {
        switch (nameOfAtrs) {
            case ORIGINAL_POLICY:
            case ATTR_CHANGE:
            case PRESSURE:
            case SCREENY:
            case ELAPSED_TIME:
            case PSEUDO_ELEMENT:
            case REASON:
            case CANCELABLE:
            case DELTAY:
            case NEW_VALUE:
            case MATCHES:
            case SUBORIGIN:
            case Y:
            case ALPHA:
            case CANCEL_BUBBLE:
            case CLIENT_ID:
            case IS_COMPOSING:
            case TYPE:
            case MESSAGE:
            case STATUS:
            case BUTTON:
            case WHICH:
            case LAYERY:
            case OLD_VERSION:
            case COLNO:
            case WHEEL_DELTA:
            case CHAR_INDEX:
            case TONE:
            case RESULT_INDEX:
            case SOURCE_FILE:
            case WIDTH:
            case VIOLATED_DIRECTIVE:
            case OLD_VALUE:
            case CODE:
            case LAST_CHANCE:
            case ERROR:
            case REPLY:
            case CHAR_CODE:
            case CTRL_KEY:
            case KEY_CODE:
            case IS_RELOAD:
            case OLDURL:
            case INPUT_TYPE:
            case FILENAME:
            case SHIFT_KEY:
            case NEWURL:
            case IS_PRIMARY:
            case LINE_NUMBER:
            case TILTX:
            case TWIST:
            case BETA:
            case POINTER_ID:
            case RETURN_VALUE:
            case INIT_DATA_TYPE:
            case REPEAT:
            case TIME_STAMP:
            case BLOCKEDURI:
            case MEDIA:
            case OFFSETY:
            case MOVEMENTY:
            case CURRENT_TIME:
            case WAS_CLEAN:
            case ATTR_NAME:
            case CLIENTY:
            case GAMMA:
            case URL:
            case PROPERTY_NAME:
            case DEFAULT_PREVENTED:
            case PAGEY:
            case COLUMN_NUMBER:
            case META_KEY:
            case WHEEL_DELTAX:
            case STATUS_MESSAGE:
            case ORIGIN:
            case TAG:
            case STATE:
            case NEW_VERSION:
            case REGION:
            case PERSISTED:
            case HEIGHT:
            case LOADED:
            case TIMECODE:
            case POINTER_TYPE:
            case INTERVAL:
            case LAYERX:
            case DELTA_MODE:
            case DETAIL:
            case EVENT_PHASE:
            case TOTAL:
            case LINENO:
            case DATA_LOSS_MESSAGE:
            case LOCATION:
            case REFERRER:
            case IS_TRUSTED:
            case BUBBLES:
            case CLIENTX:
            case DELTAZ:
            case SCREENX:
            case WHEEL_DELTAY:
            case KEY:
            case COMPOSED:
            case PAGEX:
            case ABSOLUTE:
            case MOVEMENTX:
            case PREV_VALUE:
            case EFFECTIVE_DIRECTIVE:
            case NAME:
            case BUTTONS:
            case LAST_EVENT_ID:
            case SAMPLE:
            case PLAYBACK_TIME:
            case DELTAX:
            case X:
            case LENGTH_COMPUTABLE:
            case ACTION:
            case TANGENTIAL_PRESSURE:
            case ANIMATION_NAME:
            case ALT_KEY:
            case OFFSETX:
            case STATUS_CODE:
            case TILTY:
            case DOCUMENTURI:
            case TIMELINE_TIME:
                return getNativeType(eventInfo, key);
            case STREAM:
            case UTTERANCE:
            case CHANGED_TOUCHES:
            case SOURCE_CAPABILITIES:
            case TARGET_TOUCHES:
            case TOUCHES:
            case INTERPRETATION:
            case VIEW:
            case INIT_DATA:
            case INPUT_BUFFER:
            case ROTATION_RATE:
            case CANDIDATE:
            case NOTIFICATION:
            case DATA_TRANSFER:
            case CHANNEL:
            case DEVICE:
            case FROM_ELEMENT:
            case SOURCE:
            case REQUEST:
            case CLIPBOARD_DATA:
            case TO_ELEMENT:
            case OUTPUT_BUFFER:
            case CONNECTION:
            case EMMA:
            case SRC_ELEMENT:
            case ACCELERATION_INCLUDING_GRAVITY:
            case RELATED_TARGET:
            case PORT:
            case RENDERED_BUFFER:
            case GAMEPAD:
            case DATA:
            case TRACK:
            case RELATED_NODE:
            case RESULTS:
            case CURRENT_TARGET:
            case DISPLAY:
            case STORAGE_AREA:
            case TARGET:
            case ACCELERATION:
                return getPObject2(eventInfo, key);
            case FONTFACES:
                return getFontFaceArray(eventInfo, key);
            case PLATFORMS:
                return getStringArray(eventInfo, key);
            case PATH:
                return getEventTargetArray(eventInfo, key);
            case FETCHES:
                return getBackgroundFetchSettledFetchArray(eventInfo, key);
            case PORTS:
                return getMessagePortArray(eventInfo, key);
            default:
                log.info("we don't treat these case");
                return null;
        }
    }

    private Object getNativeType(final JsonObject eventInfo, final String key) {
        log.info("your arrive here in getNativeType " + eventInfo.get(key));
        return eventInfo.get(key);
    }

    private PObject2 getPObject2(final JsonObject eventInfo, final String idOfAttr) {
        final JsonValue jsonValue = eventInfo.get(idOfAttr);
        if (jsonValue.getValueType() == ValueType.NUMBER) {
            final int idOfObject = eventInfo.getJsonNumber(idOfAttr).intValue();
            final PObject2 res = UIContext.get().getListAllObject().get(idOfObject);
            return res;
        }
        return null;
    }

    private PFontFace[] getFontFaceArray(final JsonObject eventInfo, final String idOfAttr) {
        final JsonValue jsonValue = eventInfo.get(idOfAttr);
        if (jsonValue.getValueType() == ValueType.ARRAY) {
            final JsonArray idOfAttrArray = eventInfo.getJsonArray(idOfAttr);
            final int size = idOfAttrArray.size();
            final PFontFace[] res = new PFontFace[size];
            for (int index = 0; index < size; index++) {
                final JsonValue elementRaw = idOfAttrArray.get(index);
                PFontFace element = null;
                if (elementRaw.getValueType() == ValueType.NUMBER) {
                    final int idOfObject = ((JsonNumber) elementRaw).intValue();
                    element = (PFontFace) UIContext.get().getListAllObject().get(idOfObject);
                }
                res[index] = element;
            }
            return res;
        }
        return null;
    }

    private String[] getStringArray(final JsonObject eventInfo, final String idOfAttr) {
        final JsonValue jsonValue = eventInfo.get(idOfAttr);
        if (jsonValue.getValueType() == ValueType.ARRAY) {
            final JsonArray idOfAttrArray = eventInfo.getJsonArray(idOfAttr);
            final int size = idOfAttrArray.size();
            final String[] res = new String[size];
            for (int index = 0; index < size; index++) {
                final String element = idOfAttrArray.getString(index);
                res[index] = element;
            }
            return res;
        }
        return null;
    }

    private PEventTarget[] getEventTargetArray(final JsonObject eventInfo, final String idOfAttr) {
        final JsonValue jsonValue = eventInfo.get(idOfAttr);
        if (jsonValue.getValueType() == ValueType.ARRAY) {
            final JsonArray idOfAttrArray = eventInfo.getJsonArray(idOfAttr);
            final int size = idOfAttrArray.size();
            final PEventTarget[] res = new PEventTarget[size];
            for (int index = 0; index < size; index++) {
                final JsonValue elementRaw = idOfAttrArray.get(index);
                PEventTarget element = null;
                if (elementRaw.getValueType() == ValueType.NUMBER) {
                    final int idOfObject = ((JsonNumber) elementRaw).intValue();
                    element = (PEventTarget) UIContext.get().getListAllObject().get(idOfObject);
                }
                res[index] = element;
            }
            return res;
        }
        return null;
    }

    private PBackgroundFetchSettledFetch[] getBackgroundFetchSettledFetchArray(final JsonObject eventInfo, final String idOfAttr) {
        final JsonValue jsonValue = eventInfo.get(idOfAttr);
        if (jsonValue.getValueType() == ValueType.ARRAY) {
            final JsonArray idOfAttrArray = eventInfo.getJsonArray(idOfAttr);
            final int size = idOfAttrArray.size();
            final PBackgroundFetchSettledFetch[] res = new PBackgroundFetchSettledFetch[size];
            for (int index = 0; index < size; index++) {
                final JsonValue elementRaw = idOfAttrArray.get(index);
                PBackgroundFetchSettledFetch element = null;
                if (elementRaw.getValueType() == ValueType.NUMBER) {
                    final int idOfObject = ((JsonNumber) elementRaw).intValue();
                    element = (PBackgroundFetchSettledFetch) UIContext.get().getListAllObject().get(idOfObject);
                }
                res[index] = element;
            }
            return res;
        }
        return null;
    }

    private PMessagePort[] getMessagePortArray(final JsonObject eventInfo, final String idOfAttr) {
        final JsonValue jsonValue = eventInfo.get(idOfAttr);
        if (jsonValue.getValueType() == ValueType.ARRAY) {
            final JsonArray idOfAttrArray = eventInfo.getJsonArray(idOfAttr);
            final int size = idOfAttrArray.size();
            final PMessagePort[] res = new PMessagePort[size];
            for (int index = 0; index < size; index++) {
                final JsonValue elementRaw = idOfAttrArray.get(index);
                PMessagePort element = null;
                if (elementRaw.getValueType() == ValueType.NUMBER) {
                    final int idOfObject = ((JsonNumber) elementRaw).intValue();
                    element = (PMessagePort) UIContext.get().getListAllObject().get(idOfObject);
                }
                res[index] = element;
            }
            return res;
        }
        return null;
    }
}