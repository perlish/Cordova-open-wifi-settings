#Warning
Plugin is still in development. Now can only open gps settings on android. 
##Next release: 
* port to iOS
* selection page to open (wifi/newtork..)
* callbacks
  
#NativeSettings plugin for Android Cordova.

The plugin allow you to open settings view from Android Cordova application. Based on https://github.com/raulduran/VideoPlayer.
This command fires an Intent to have your devices to show the settings.

#Adding the Plugin to your project

cordova plugin add https://github.com/jswirus/Cordova-open-native-settings.git

#Removing the Plugin to your project

cordova plugin rm com.phonegap.plugins.natiesettings

#Using the plugin

cordova.plugins.natiesettings.open(success_callback,failure_callback);
