package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private int powerSupply;
    private Dimension dimension ;

    public Case(String model, String manufacturer, int powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimensions() {
        return dimension;
    }
}
