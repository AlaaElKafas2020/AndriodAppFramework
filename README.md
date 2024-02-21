**QA Engineer Coding Challenge By AlaaElkaffass**

**Tools & Technologies :**

Java

Appium

Cucumber

Maven

aventstack

OkHttp

Wireshark

IntelliJ


**Firstly** I extracted apk from below github project :
https://github.com/IhwanID/belajar-android-jetpack-pro as you can see here 
![](C:\Users\user\Desktop\MovieApp\src\test\resources\App installed on Alaa Device.png)

find it in ".\MovieApp\AppResources" folder 

**secondly** I created Capabilities for this app on Appium Inspector

to get app package and activity for created emulator , 
run below command :

_adb shell dumpsys window windows | grep -E 'mCurrentFocus|mFocusedApp'_

**Thirdly** I created Emultor on Andriod Studio

**Fourthly** I created Maven Project and Add Pom dependencies and use Appium Inspector 

![](C:\Users\user\Desktop\MovieApp\src\test\resources\Get element on aooium inspector.png)

**fifthly** I Generated Access token from "https://developer.themoviedb.org/reference/intro/authentication"