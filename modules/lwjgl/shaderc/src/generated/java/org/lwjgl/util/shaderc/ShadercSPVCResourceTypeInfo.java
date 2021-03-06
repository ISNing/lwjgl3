/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct shaderc_spvc_resource_type_info {
 *     uint32_t location;
 *     shaderc_spvc_texture_format_type type;
 * }</code></pre>
 */
@NativeType("struct shaderc_spvc_resource_type_info")
public class ShadercSPVCResourceTypeInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATION,
        TYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATION = layout.offsetof(0);
        TYPE = layout.offsetof(1);
    }

    /**
     * Creates a {@code ShadercSPVCResourceTypeInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ShadercSPVCResourceTypeInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code location} field. */
    @NativeType("uint32_t")
    public int location() { return nlocation(address()); }
    /** Returns the value of the {@code type} field. */
    @NativeType("shaderc_spvc_texture_format_type")
    public int type() { return ntype(address()); }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCResourceTypeInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ShadercSPVCResourceTypeInfo malloc() {
        return wrap(ShadercSPVCResourceTypeInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCResourceTypeInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ShadercSPVCResourceTypeInfo calloc() {
        return wrap(ShadercSPVCResourceTypeInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCResourceTypeInfo} instance allocated with {@link BufferUtils}. */
    public static ShadercSPVCResourceTypeInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ShadercSPVCResourceTypeInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code ShadercSPVCResourceTypeInfo} instance for the specified memory address. */
    public static ShadercSPVCResourceTypeInfo create(long address) {
        return wrap(ShadercSPVCResourceTypeInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCResourceTypeInfo createSafe(long address) {
        return address == NULL ? null : wrap(ShadercSPVCResourceTypeInfo.class, address);
    }

    /**
     * Returns a new {@link ShadercSPVCResourceTypeInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCResourceTypeInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCResourceTypeInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCResourceTypeInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCResourceTypeInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCResourceTypeInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ShadercSPVCResourceTypeInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCResourceTypeInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCResourceTypeInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCResourceTypeInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static ShadercSPVCResourceTypeInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ShadercSPVCResourceTypeInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ShadercSPVCResourceTypeInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ShadercSPVCResourceTypeInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCResourceTypeInfo mallocStack(MemoryStack stack) {
        return wrap(ShadercSPVCResourceTypeInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ShadercSPVCResourceTypeInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCResourceTypeInfo callocStack(MemoryStack stack) {
        return wrap(ShadercSPVCResourceTypeInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ShadercSPVCResourceTypeInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCResourceTypeInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCResourceTypeInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCResourceTypeInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCResourceTypeInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCResourceTypeInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCResourceTypeInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCResourceTypeInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCResourceTypeInfo.LOCATION); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCResourceTypeInfo.TYPE); }

    // -----------------------------------

    /** An array of {@link ShadercSPVCResourceTypeInfo} structs. */
    public static class Buffer extends StructBuffer<ShadercSPVCResourceTypeInfo, Buffer> implements NativeResource {

        private static final ShadercSPVCResourceTypeInfo ELEMENT_FACTORY = ShadercSPVCResourceTypeInfo.create(-1L);

        /**
         * Creates a new {@code ShadercSPVCResourceTypeInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ShadercSPVCResourceTypeInfo#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected ShadercSPVCResourceTypeInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code location} field. */
        @NativeType("uint32_t")
        public int location() { return ShadercSPVCResourceTypeInfo.nlocation(address()); }
        /** Returns the value of the {@code type} field. */
        @NativeType("shaderc_spvc_texture_format_type")
        public int type() { return ShadercSPVCResourceTypeInfo.ntype(address()); }

    }

}