package com.metanit;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввeдите длину массива:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Ввeдите  массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

