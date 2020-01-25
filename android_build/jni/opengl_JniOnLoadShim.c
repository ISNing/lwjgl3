/* Shim for MineJLauncher OpenGL initialization. */

#include <jni.h>
#include <dlfcn.h>

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
	void* minejJni = dlopen("libminej_jni.so", RTLD_GLOBAL | RTLD_LAZY);
	void (*minej_openGLOnLoad)() = dlsym(minejJni, "minej_openGLOnLoad");
	minej_openGLOnLoad();
	return JNI_VERSION_1_2;
}
