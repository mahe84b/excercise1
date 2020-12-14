package com.training_session3;

import java.util.Arrays;

/*
Ex1)
Given an array A of 1 dim, find a new array formed by adding each element of the given array with the largest element in the new array to its left.

Examples:
Input: arr[] = {5, 1, 6, -3, 2}
Output: {5, 6, 12, 9, 14}

Ex2
Write a function to find the duplicate values of an array of integer values.
Exp:
Input: int[] a = {1, 2, 5, 5, 6, 6, 7, 2};
Output: Element [2] is duplicated, Element [5] is duplicated, Element [6] is duplicated

Ex3
Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e.
fill A with first p smallest elements and fill B with remaining
elements.   Go to the editor
Example:
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]

 */

public class Main {

    public static void main(String[] args) {

        System.out.println("\n ***** Ex1) : Given an array A of 1 dim, find a new array formed by adding each element of the given array with the largest element in the new array to its left.. *****");

        PracticeExcercice1 practice_excercice1 = new PracticeExcercice1();

        System.out.println("SummingElementstoLeft: " + Arrays.toString(practice_excercice1.SummingElementsToLeft()));

        System.out.println("\n Ex2: Write a function to find the duplicate values of an array of integer values.");

        PracticeExcercice2 practice_excercice2 = new PracticeExcercice2();

        System.out.println("FindingDuplicatesInArray: " + practice_excercice2.FindingDuplicatesInArray());

        System.out.println("\n Ex3:Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e.fill A with first p smallest elements and fill B with remaining");

        PracticeExcercice3 practice_excercice3 = new PracticeExcercice3();

        System.out.println("SortAccrossTwoArrays: ");

        practice_excercice3.SortAccrossTwoArrays();
    }
}
