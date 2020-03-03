package com.company;

import java.util.Scanner;

public class Array_assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Exercise 1
//        int num[] = new int[10];
//        for (int i = 0; i < num.length; i++) {
//            System.out.println("Enter " + i + " value : ");
//            num[i] = sc.nextInt(); // input the value of the input
//        }
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i] + " ");
//        }
//    }
        // Exercise 2
//        int num2[] = new int[10];
//        int inside_num2;
//        for (int i = 0; i < num2.length; i++) {
//            System.out.println("Enter " + i + " value : ");
//            num2[i] = sc.nextInt();
//        }
//        System.out.println("Give a number");
//        inside_num2 = sc.nextInt();
//        for (int i = 0; i < num2.length; i++) {
//            if (num2[i] == inside_num2) {
//                System.out.print("\n" +inside_num2+ "is present in array " +i);
//            } else {
//                System.out.println("\nThere is no " + inside_num2 + " in array " +i);
//            }
//        }
        // Exercise 3
//        int num3[] = new int[20];
//        int positive_nums = 0;
//        int negative_nums = 0;
//        int odd_nums = 0;
//        int even_nums = 0;
//        int zero_nums = 0;
//        for (int i = 0; i < num3.length; i++) {
//            System.out.println("Enter the " + i + " value : ");
//            num3[i] = sc.nextInt();
//
//            if (num3[i] > 0) {
//                positive_nums++;
//            } else if (num3[i] < 0) {
//                negative_nums++;
//            } else {
//                zero_nums++;
//            }
//            if (num3[i] % 2 == 1) {
//                odd_nums++;
//            } else {
//                even_nums++;
//            }
//        }
//            System.out.println("Number of positive nums: " + positive_nums + "\nNumber of negative nums: " + negative_nums + "\nNumber of odd nums: " + odd_nums + "\nNumber of even nums: " + even_nums + "\nNumber of zero nums: " + zero_nums);
//    }
        // Exercise 4
        // Exercise 5
//        int num5[] = new int[5];
//        for(int i = 0; i<num5.length; i++){
//            System.out.println("Enter the " +i+ " value : ");
//            num5[i] = sc.nextInt();
//        }
//        int largest = num5[0];
//        int smallest = num5[0];
//        for(int i = 0; i<num5.length; i++){
//            if(num5[i]>largest){
//                largest = num5[i];
//            }
//            if(num5[i]<smallest){
//                smallest = num5[i];
//            }
//        }
//        System.out.println("Largest: " +largest+ "\nSmallest: " +smallest);
        // Exercise 6
//        int num6[] = {1,2,3,3,2,1};
//        boolean read = true;
//        int j = num6.length -1;
//        for(int i=0; i<num6.length/2; i++){
//            if(num6[i]!=num6[j]){
//                read = false;
//                break;
//            }
//            else
//                j--;
//        }
//        System.out.println(read);
//        }
        // Exercise 7
        // Exercise 8
//        int a[] = {4,8,6,3,2};
//        int b[] = new int[a.length+1];
//        int highest = a[0];
//        int second_highest = a[0];
//        int j = 0;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>highest){
//                highest = a[i];
//                j = i;
//            }
//        }
//        for(int i = 0;i<a.length;i++){
//            if(a[i]<highest && a[i]>second_highest){
//                second_highest = a[i];
//            }
//        }
//
//        for(int i = 0;i<j;i++){
//            b[i] = a[i];
//        }
//        b[j] = second_highest;
//        b[j+1] = highest-second_highest;
//        for(int i = j+2;i<b.length;i++){
//            b[i] = a[i-1];
//        }
//        for(int i = 0;i<b.length;i++) {
//            System.out.println(b[i]);
//        }

        // Exercise 9

    }
}