#!/bin/bash
#armeabi-v7a,arm64-v8a

set -e
if [ ! -f "./dyncall-1.1.tar.gz" ];then
	wget https://dyncall.org/r1.1/dyncall-1.1.tar.gz
fi

if [ ! -d "./dyncall-1.1" ];then
        tar -xzvf dyncall-1.1.tar.gz
fi

cd dyncall-1.1

if [ ! -d "./android_${1}_build" ];then
	mkdir android_${1}_build
else
	rm -r android_${1}_build
	mkdir android_${1}_build
fi

cd android_${1}_build

${ANDROID_SDK_HOME}/cmake/${ANDROID_SDK_CMAKE_VERSION}/bin/cmake .. \
	-DCMAKE_TOOLCHAIN_FILE=${NDK_HOME}/build/cmake/android.toolchain.cmake \
	-DANDROID_ABI=${1} \
	-DANDROID_NATIVE_API_LEVEL=29 \
	-DBUILD_SHARED_LIBS=ON \
&& make

if [ $? -eq 0 ]; then
	if [ ! -d "../../jni/${1}" ];then
        	mkdir ../../jni/${1}
		cp ./dyncall/*.a ../../jni/${1}
		cp ./dyncallback/*.a ../../jni/${1}
		cp ./dynload/*.a ../../jni/${1}
	else
	        rm -r ../../jni/${1}
	        mkdir ../../jni/${1}
		cp ./dyncall/*.a ../../jni/${1}
	        cp ./dyncallback/*.a ../../jni/${1}
        	cp ./dynload/*.a ../../jni/${1}
	fi
fi
