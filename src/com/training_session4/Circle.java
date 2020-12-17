package com.training_session4;

class Circle extends CalculateArea {

    private static float PI = 3.14f;

    private float radius = 3;

    public float calculateAreaOfAnyShape() {
        return PI*(radius*radius);
    }

    public void calculateAndDisplayArea() {
        System.out.println("Circle is : "+this.calculateAreaOfAnyShape());
    }
}
