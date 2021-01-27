package com.ivanskyi.bicycle.parts;

public class Frame {
    FrameBrands frameBrands;
    FrameSize frameSize;

    public Frame(FrameBrands frameBrands, FrameSize frameSize) {
        this.frameBrands = frameBrands;
        this.frameSize = frameSize;
    }

    public FrameBrands getFrameBrands() {
        return frameBrands;
    }

    public FrameSize getFrameSize() {
        return frameSize;
    }
}
