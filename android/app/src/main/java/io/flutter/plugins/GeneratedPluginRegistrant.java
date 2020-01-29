package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import dev.applicazza.flutter.plugins.whatsapp_stickers.WhatsappStickersPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    WhatsappStickersPlugin.registerWith(registry.registrarFor("dev.applicazza.flutter.plugins.whatsapp_stickers.WhatsappStickersPlugin"));
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
