package com.metanit;
import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;


public class  Array  {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 15, 86, 5, 8, 69, 27, 14, 6, 58};
        for (int i=0;i<arr.length; i++) {
            if (i % 2 == 0){
                System.out.print(arr[i]+" ");}
        }
    }
}
