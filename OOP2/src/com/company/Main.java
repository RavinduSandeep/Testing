package com.company;

public class Main {

    public static void main(String[] args) {
        Dimension dimensions = new Dimension(20,20,5);
        Case theCase = new Case("221B","Dell",240,dimensions);

        Resolution resolution = new Resolution(1080,1920);
        Monitor themonitor = new Monitor("24inch ProMP", "MSI",24,resolution);

        MotherBoard themotherBoard = new MotherBoard("AU1201","Asus",4,5,"v2.0");

        PC thePC = new PC(theCase,themonitor,themotherBoard);

        thePC.getMonitor().drawPixelAt(1500,1200, "red");
        thePC.getMotherBoard().lordProgramme("windows 10");
        thePC.getTheCase().pressPowerButton();

    }
}
