package com.company;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    private void chew(){
        System.out.println("Dog.chew() called.");
    }

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail= tail;
        this.teeth= teeth;
        this.coat= coat;

    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called.");
        move(10);

    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }

    public void run(){
        System.out.println("Dog.run() called.");
        move(25);
    }
}
