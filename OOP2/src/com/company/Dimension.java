package com.company;

public class Dimension {
    private int width;
    private int height;
    private int depth;

    public Dimension(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = height;
    }

    public int getLength() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
