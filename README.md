# MAV-MixedReality-FPV
 VFS MAV competition Mixed Reality FPV flight application

## HOW TO OPEN/EDIT/RUN
This program is and Android application made in the Android Studio environment. To edit and run this application,
follow this guide:
1. Download & install *Java* and *Java SDK*: https://www.oracle.com/java/
2. Download & install *Android Studio*: https://developer.android.com/studio
3. Download or check-out the Android project.
4. Open Android Studio, navigate to the application folder, and open it.
5. In Android Studio, open the **Android Virtual Device Manager** window, and click on the **Create Virtual Device...** button in the lower left corner.
6. Select a device (Category -> Phone -> Pixel 3) and select/download an Android API level (Q | 29 | x86 | Android 10.0). NOTE: Android API does not work on computers with an AMD CPU.
7. An Android device can also be connected to the computer if developer mode is enabled: https://developer.android.com/studio/debug/dev-options
8. Make sure your desired device is selected on the top panel, and hit the green arrow to build and run the app.

## REQUIRED HARDWARE TO RUN
**BASE STATION HARDWARE**
- Android Phone with Android Oreo or later.
- USB 5.8 GHz FPV receiver.
- VR Headset Adapter for Smartphones (Google Cardboard).
**MAV HARDWARE**
- FPV Drone Camera with Wide Angle Lens (120°-180° width view) turned to its side and angles down at a 45° angle.
- 5.8 GHz Transmitter (if not built into the camera).
- Li-Po battery (if power is not provided by the MAV).
- BONUS: A micro air vehicle (quad, helicopter, plane, etc.).

## REFERENCES & LIBRARIES
- Android USB Camera: https://github.com/jiangdongguo/AndroidUSBCamera
- External USB Cameras: https://source.android.com/devices/camera/external-usb-cameras
- 360° Media: https://developers.google.com/vr/discover/360-degree-media

 ![Beaver-hawk logo](/BEAVERHAWK.png)

## VERTICAL FLIGHT SOCIETY MICRO AIR VEHICLE COMPETITION: TECHNOLOGY REVIEW
Daniel Adams (AdamsD2)
November 8th, 2019

### ABOUT
This application was designed to be used as a first person view (FPV) for a micro air vehicle (MAV) designed by Oregon State University seniors to be entered into the Vertical Flight Society MAV Competition. This application will require the use of a 5.8 GHz FPV receiver and a FPV camera to fully test.

![Diagram of MAV connection: ](/MAVConnect.PNG)
**Figure 1:** A diagram of how the base station will communicate with the MAV
