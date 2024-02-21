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

![App installed on Alaa Device](https://github.com/AlaaElKafas2020/AndriodAppFramework/assets/95582566/ed23f473-cb93-4a2c-9ac3-dea937496068)


find it in ".\MovieApp\AppResources" folder 

**secondly** I created Capabilities for this app on Appium Inspector

to get app package and activity for created emulator , 
run below command :

_adb shell dumpsys window windows | grep -E 'mCurrentFocus|mFocusedApp'_

**Thirdly** I created Emultor on Andriod Studio

**Fourthly** I created Maven Project and Add Pom dependencies and use Appium Inspector 

![Get element on aooium inspector](https://github.com/AlaaElKafas2020/AndriodAppFramework/assets/95582566/5fc193ef-2061-4c81-8472-bebdf1bbfd65)


**fifthly** I Generated Access token from "https://developer.themoviedb.org/reference/intro/authentication"
