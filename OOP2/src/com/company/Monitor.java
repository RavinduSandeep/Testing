package com.company;

public class Monitor {
    private String model;
    private String Brand;
    private int size;
    private Resolution resolution;

    public Monitor(String model, String brand, int size, Resolution resolution) {
        this.model = model;
        Brand = brand;
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "+x+","+y+" in color "+ color.toUpperCase());
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return Brand;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
