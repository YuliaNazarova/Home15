package com.metanit;
import java.util.Scanner;
public class Kazdoevtoroe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите число а:");
        int a = in.nextInt();
        System.out.print("введите число b:");
        int b = in.nextInt();
        for (int i=a;i<=b;i++){
            if (i % 2==0)
                System.out.print(" "+i);
        }
    }
}

