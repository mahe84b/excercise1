package com.training_session4;

class Triangle extends CalculateArea {

    private int base = 5;
    private int height = 4;


    public float calculateAreaOfAnyShape() {
        return (base*height)/2;
    }

    public void calculateAndDisplayArea() {
        System.out.println("Triangle is : "+this.calculateAreaOfAnyShape());
    }
}
