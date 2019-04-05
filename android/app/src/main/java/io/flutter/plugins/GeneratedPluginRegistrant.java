package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.ryanheise.audioservice.AudioServicePlugin;
import bz.rxla.audioplayer.AudioplayerPlugin;
import com.eyedeadevelopers.fluttertts.FlutterTtsPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    AudioServicePlugin.registerWith(registry.registrarFor("com.ryanheise.audioservice.AudioServicePlugin"));
    AudioplayerPlugin.registerWith(registry.registrarFor("bz.rxla.audioplayer.AudioplayerPlugin"));
    FlutterTtsPlugin.registerWith(registry.registrarFor("com.eyedeadevelopers.fluttertts.FlutterTtsPlugin"));
    PathProviderPlugin.registerWith(registry.registrarFor("io.flutter.plugins.pathprovider.PathProviderPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
