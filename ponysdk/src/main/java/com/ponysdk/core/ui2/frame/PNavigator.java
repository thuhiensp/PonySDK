/*
 * Copyright 2019 SmartTrade Technologies
 *     Pony SDK
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ponysdk.core.ui2.frame;
import com.ponysdk.core.ui2.PObject2;
import com.ponysdk.core.ui2.PLeafTypeNoArgs;
import com.ponysdk.core.ui2.bluetooth.PBluetooth;
import com.ponysdk.core.ui2.budget.PBudgetService;
import com.ponysdk.core.ui2.clipboard.PClipboard;
import com.ponysdk.core.ui2.credentialmanager.PCredentialsContainer;
import com.ponysdk.core.ui2.geolocation.PGeolocation;
import com.ponysdk.core.ui2.media_capabilities.PMediaCapabilities;
import com.ponysdk.core.ui2.mediasession.PMediaSession;
import com.ponysdk.core.ui2.mediastream.PMediaDevices;
import com.ponysdk.core.ui2.netinfo.PNetworkInformation;
import com.ponysdk.core.ui2.nfc.PNFC;
import com.ponysdk.core.ui2.permissions.PPermissions;
import com.ponysdk.core.ui2.plugins.PMimeTypeArray;
import com.ponysdk.core.ui2.plugins.PPluginArray;
import com.ponysdk.core.ui2.presentation.PPresentation;
import com.ponysdk.core.ui2.quota.PDeprecatedStorageQuota;
import com.ponysdk.core.ui2.quota.PStorageManager;
import com.ponysdk.core.ui2.serviceworkers.PServiceWorkerContainer;
import com.ponysdk.core.ui2.webusb.PUSB;

public class PNavigator extends PObject2 {
     private String vendorSub;
     private String productSub;
     private String vendor;
     private PBluetooth bluetooth;
     private PBudgetService budget;
     private PCredentialsContainer credentials;
     private String doNotTrack;
     private Double maxTouchPoints;
     private PClipboard clipboard;
     private PGeolocation geolocation;
     private PMediaSession mediaSession;
     private PMediaDevices mediaDevices;
     private PMediaCapabilities mediaCapabilities;
     private PNetworkInformation connection;
     private PNFC nfc;
     private PPermissions permissions;
     private PPluginArray plugins;
     private PMimeTypeArray mimeTypes;
     private PPresentation presentation;
     private PDeprecatedStorageQuota webkitTemporaryStorage;
     private PDeprecatedStorageQuota webkitPersistentStorage;
     private PStorageManager storage;
     private PServiceWorkerContainer serviceWorker;
     private PUSB usb;
     private Double hardwareConcurrency;
     private Boolean cookieEnabled;
     private String appCodeName;
     private String appName;
     private String appVersion;
     private String platform;
     private String product;
     private String userAgent;
     private String language;
     private String[] languages;
     private Boolean onLine;

    public PNavigator() {
      applyInit(widgetNoArgs());
    }


    public String getVendorSub(){
      return vendorSub;
    }
    public String getProductSub(){
      return productSub;
    }
    public String getVendor(){
      return vendor;
    }
    public PBluetooth getBluetooth(){
      return bluetooth;
    }
    public PBudgetService getBudget(){
      return budget;
    }
    public PCredentialsContainer getCredentials(){
      return credentials;
    }
    public String getDoNotTrack(){
      return doNotTrack;
    }
    public Double getMaxTouchPoints(){
      return maxTouchPoints;
    }
    public PClipboard getClipboard(){
      return clipboard;
    }
    public PGeolocation getGeolocation(){
      return geolocation;
    }
    public PMediaSession getMediaSession(){
      return mediaSession;
    }
    public PMediaDevices getMediaDevices(){
      return mediaDevices;
    }
    public PMediaCapabilities getMediaCapabilities(){
      return mediaCapabilities;
    }
    public PNetworkInformation getConnection(){
      return connection;
    }
    public PNFC getNfc(){
      return nfc;
    }
    public PPermissions getPermissions(){
      return permissions;
    }
    public PPluginArray getPlugins(){
      return plugins;
    }
    public PMimeTypeArray getMimeTypes(){
      return mimeTypes;
    }
    public PPresentation getPresentation(){
      return presentation;
    }
    public PDeprecatedStorageQuota getWebkitTemporaryStorage(){
      return webkitTemporaryStorage;
    }
    public PDeprecatedStorageQuota getWebkitPersistentStorage(){
      return webkitPersistentStorage;
    }
    public PStorageManager getStorage(){
      return storage;
    }
    public PServiceWorkerContainer getServiceWorker(){
      return serviceWorker;
    }
    public PUSB getUsb(){
      return usb;
    }
    public Double getHardwareConcurrency(){
      return hardwareConcurrency;
    }
    public Boolean getCookieEnabled(){
      return cookieEnabled;
    }
    public String getAppCodeName(){
      return appCodeName;
    }
    public String getAppName(){
      return appName;
    }
    public String getAppVersion(){
      return appVersion;
    }
    public String getPlatform(){
      return platform;
    }
    public String getProduct(){
      return product;
    }
    public String getUserAgent(){
      return userAgent;
    }
    public String getLanguage(){
      return language;
    }
    public String[] getLanguages(){
      return languages;
    }
    public Boolean getOnLine(){
      return onLine;
    }

    private PLeafTypeNoArgs widgetNoArgs() {
      return PLeafTypeNoArgs.NAVIGATOR;
    }


}