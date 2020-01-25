#armeabi-v7a arm64-v8a x86 x86_64
APP_ABI := arm64-v8a x86 x86_64
APP_PLATFORM := android-22
APP_CFLAGS := -O2 -std=c11 -Wall
APP_CPPFLAGS += -frtti

APP_STL := c++_shared

NDK_TOOLCHAIN_VERSION=4.9
