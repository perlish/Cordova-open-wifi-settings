#NativeSettings plugin for Android Cordova 3.0 

The plugin allow you to open settings view from Android Cordova application. 

This command fires an Intent to have your devices to show the settings.

#Adding the Plugin to your project

cordova plugin add https://github.com/jswirus/Cordova-open-native-settings.git

#Removing the Plugin to your project

cordova plugin rm com.phonegap.plugins.natiesettings

#Using the plugin

cordova.plugins.natiesettings.open(sucess_callback,failure_callback);
