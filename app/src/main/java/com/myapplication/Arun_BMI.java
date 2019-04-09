package com.myapplication;

public class Arun_BMI {
   private double height,weight;

    public Arun_BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double calcBMI()
    {

        double BMI = weight/(height*height/100);
        return BMI;
    }
}
