# whatsapp_stickers

A Flutter plugin for adding stickers to WhatsApp.

## Notes

Currently iOS is the only supported platform. Android will be added soon.

## Usage

To use this plugin, add `whatsapp_stickers` as a [dependency in your pubspec.yaml file](https://flutter.io/platform-plugins/).

## Example

Put your stickers in any folder, for example, `assets`. Do not forget to [add this folder to pubspec.yaml](https://flutter.dev/docs/development/ui/assets-and-images).

```dart
var stickerPack = WhatsappStickers(
    "cuppyFlutterWhatsAppStickers",
    "Cuppy Flutter WhatsApp Stickers",
    "John Doe",
    "assets/tray_Cuppy.png",
    "",
    "",
    "");

stickerPack
  ..addSticker("assets/01_Cuppy_smile.webp", ["☕","🙂"])
  ..addSticker("assets/02_Cuppy_lol.webp", ["😄","😀"])
  ..addSticker("assets/03_Cuppy_rofl.webp", ["😆","😂"])
  ..addSticker("assets/04_Cuppy_sad.webp", ["😃", "😍"])
  ..addSticker("assets/05_Cuppy_cry.webp", ["😭","💧"])
  ..addSticker("assets/06_Cuppy_love.webp", ["😍","♥"])
  ..addSticker("assets/07_Cuppy_hate.webp", ["💔","👎"])
  ..addSticker("assets/08_Cuppy_lovewithmug.webp", ["😍","💑"])
  ..addSticker("assets/09_Cuppy_lovewithcookie.webp", ["😘","🍪"])
  ..addSticker("assets/10_Cuppy_hmm.webp", ["🤔","😐"])
  ..addSticker("assets/11_Cuppy_upset.webp", ["😱","😵"])
  ..addSticker("assets/12_Cuppy_angry.webp", ["😡","😠"])
  ..addSticker("assets/13_Cuppy_curious.webp", ["❓","🤔"])
  ..addSticker("assets/14_Cuppy_weird.webp", ["🌈","😜"])
  ..addSticker("assets/15_Cuppy_bluescreen.webp", ["💻","😩"])
  ..addSticker("assets/16_Cuppy_angry.webp", ["😡","😤"])
  ..addSticker("assets/17_Cuppy_tired.webp", ["😩","😨"])
  ..addSticker("assets/18_Cuppy_workhard.webp", ["😔", "😨"])
  ..addSticker("assets/19_Cuppy_shine.webp", ["🎉","✨"])
  ..addSticker("assets/20_Cuppy_disgusting.webp", ["🤮","👎"])
  ..addSticker("assets/21_Cuppy_hi.webp", ["🖐","🙋"])
  ..addSticker("assets/22_Cuppy_bye.webp", ["🖐","👋"]);

try {
  await stickerPack.sendToWhatsApp();
} on WhatsappStickersException catch (e) {
  print(e.cause);
}

```

