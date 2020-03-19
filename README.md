# whatsapp_stickers

A Flutter plugin for adding stickers to WhatsApp.

## Notes

Currently iOS is the only supported platform. Android will be added soon.

## Usage

To use this plugin, add `whatsapp_stickers` as a [dependency in your pubspec.yaml file](https://flutter.io/platform-plugins/).

## Example

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
    ..addSticker(stickers);

  try {
    await stickerPack.sendToWhatsApp();
  } on WhatsappStickersException catch (e) {
    print(e.cause);
  }

}

```

