/*
 * PhoneGap is available under *either* the terms of the modified BSD license *or* the
 * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
 *
 * Copyright (c) 2005-2010, Nitobi Software Inc.
 * Copyright (c) 2011, IBM Corporation
 */

package com.phonegap.plugins.nativesettings;

import org.json.JSONArray;

import android.content.Intent;
import android.content.Context;

import android.provider.Settings;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

public class NativeSettings extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        PluginResult.Status status = PluginResult.Status.OK;
        String result = "";

 
        if (action.equals("open")) {
            this.cordova.getActivity().startActivity(new Intent(com.android.settings.wifi.WifiSettings));
        }
        else {
             status = PluginResult.Status.INVALID_ACTION;
        }
        
        callbackContext.sendPluginResult(new PluginResult(status, result));

        return true;

    }
}

