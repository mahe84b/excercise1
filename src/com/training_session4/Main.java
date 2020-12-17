package com.training_session4;

/*
Ex
illustrate open closed principle using abstract class
*/

public class Main {

    public static String radius = "2";

    public static void main(String[] args) {

        System.out.println("\n ***** Ex1: illustrate open closed principle using abstract class *****");

        CalculateArea circleArea = new Circle();

        circleArea.display();

        circleArea.calculateAndDisplayArea();

        CalculateArea triangleArea = new Triangle();

        triangleArea.calculateAndDisplayArea();
    }
}
