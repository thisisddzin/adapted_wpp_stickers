# whatsapp_stickers

A Flutter plugin for adding stickers to IOS WhatsApp, images from internet.

## Usage

To use this plugin, add `whatsapp_stickers` as a [dependency in your pubspec.yaml file](https://flutter.io/platform-plugins/).

## Example

### All images have to be passed to this class as a base64

### How send sticker package to wpp

```dart
static addStickersToWpp(
  String identifier, String name, String trayImageFile, List<Map>stickers,
  {
    String name, 
    List<dynamic> stickers, 
    String trayImageFile, 
    String identifier
  }
) async {
  var stickerPack = WhatsappStickers(
    identifier,
    name,
    "GoFun Stickers",
    trayImageFile,
    publisherWebsite, // Publisher Website
    "", // Privacy Policy Website
    "" // License Agreement Website
  );

  stickerPack
    ..addSticker(stickers); // each sticker have to be a base64

  try {
    await stickerPack.sendToWhatsApp();
  } on WhatsappStickersException catch (e) {
    print(e.cause);
  }

}

```

