/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <dlfcn.h>

EXTERN_C_ENTER

// PATCH
static void* glesHandle;

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlopen(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint mode) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    UNUSED_PARAMS(__env, clazz)
    // PATCH:Boardwalk:hardcode the load flags.
    // Also open the libGLESv1 library if we on't have it yet
    if(!glesHandle) {
        glesHandle = dlopen("libGLESv1_CM.so", RTLD_GLOBAL | RTLD_LAZY);
    }
    return (jlong)(intptr_t)dlopen(filename, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlerror(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dlerror();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlsym(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong nameAddress) {
    void *handle = (void *)(intptr_t)handleAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    // PATCH:Boardwalk: if not in glshim, then use GLES handle
    jlong retval = (jlong)(intptr_t)dlsym(handle, name);
    fprintf(stderr, "Lookup for %s returned %p\n", name, (void*)retval);
    if (!retval && name[0] == 'g' && name[1] == 'l') {
        retval = (jlong)(intptr_t)dlsym(glesHandle, name);
        if (retval) {
            fprintf(stderr, "Found %s in gles\n", name);
        }
    }
    return retval;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlclose(JNIEnv *__env, jclass clazz, jlong handleAddress) {
    void *handle = (void *)(intptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dlclose(handle);
}

EXTERN_C_EXIT
