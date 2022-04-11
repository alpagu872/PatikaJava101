package com.company;

public class Car {
    //Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    //Constructor alanı
    Car(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
    }
    Car(){
        System.out.println("Boş Constructor Metot");
    }


    //Davranışlar
    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            this.speed += increment;
        }

    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println(this.model + " Hızınız: " + this.speed);
    }

    void printInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed);
    }
}
