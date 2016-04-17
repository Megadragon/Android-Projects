# Musthave Freeware

For summary of application, see [Project Idea](https://github.com/Megadragon/Android-Projects/blob/master/MusthaveFreeware/IDEA.md) (in Russian).

## Compiling & Building

For successful compiling the sources and building the APK you need **Android Studio 2.0**. It can be downloaded from the [official site](http://developer.android.com/sdk/index.html "Download Android Studio and SDK Tools"). The installation may take a few minutes, but as result you will have a very powerful IDE.

After successful installation, you may upload the **Musthave Freeware** project into **Android Studio** in this way:
  1. Download all the files from _MusthaveFreeware_ directory of this repository on your hard drive, keeping the folder tree.
  2. Run **Android Studio**, click _File → Close Project_ if any other project is opened, and check _Open an existing Android Studio project_.
  3. In popup windows _Open File or Project_ select the folder of **Musthave Freeware** project and click _OK_.
  4. Now you can do _Make Project_ and _Build APK_ from the _Build_ menu.

## Installing & Run

For successful installing to and running **Musthave Freeware** application on your device, you must pass all the following steps:
  1. Enable **USB Debugging** mode on your mobile device by checking _Settings → Developer options → USB debugging_. For enabling _Developer options_ menu item, proceed to _Settings → About phone_ and click several times in row on _Build number_ menu item (depends from version of **OS Android**).
  2. Connect your mobile device under **OS Android 4.0.3** (API Level 15) or higher to your PC with installed **Android Studio**.
  3. Setup the ADB driver for your mobile device on your PC. **OS Windows 7** selects and setups the most appropriate driver automatically.
  4. Select _Run → Run_ menu item in your **Android Studio** or press _Shift + F10_ to (re)build, install and run **Musthave Freeware** application on your mobile device.

## Known bugs
* The _Download from Google Play_ buttons cause the **Error while retrieving information DF-DIC-02** while opening kind of URI _market://details?id=package_name_.
