package com.training_session4;

/*
Ex
illustrate open closed principle using abstract class
*/


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String radius = "2";

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("hello");

        System.out.println(list.get(0));

        System.out.println("\n ***** Ex1: illustrate open closed principle using abstract class *****");

        CalculateArea circleArea = new Circle();

        circleArea.display();

        circleArea.calculateAndDisplayArea();

        CalculateArea triangleArea = new Triangle();

        triangleArea.calculateAndDisplayArea();

        System.out.println(5 > 6);
    }
}
