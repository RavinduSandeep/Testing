package com.company;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int carSlots;
    private String biosVersion;

    public MotherBoard(String model, String manufacturer, int ramSlots, int carSlots, String biosVersion) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.carSlots = carSlots;
        this.biosVersion = biosVersion;
    }

    public void lordProgramme(String windowsVersion){
        System.out.println("Operating System : "+ windowsVersion);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCarSlots() {
        return carSlots;
    }

    public String getBiosVersion() {
        return biosVersion;
    }
}
