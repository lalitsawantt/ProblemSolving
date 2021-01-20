package com.company;

import java.util.*;
import java.math.*;
public class Main {

//    Given two strings, check if they are just one edit away. The edit can be of three types
//    Insertion, Deletion, Update
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String one = sc.nextLine();
        System.out.println("Enter the second string");
        String two = sc.nextLine();
        if(Main.isOneAway(one,two)){
            System.out.println("The strings are <= one edit away");
        }else{
            System.out.println("The string are NOT one edit away");
        }
    }

    public static boolean isOneAway(String one, String two){

        if(Math.abs(one.length()-two.length()) > 1) return false;

        int lenShort = one.length() > two.length() ? two.length() : one.length();
        int lenLong = one.length() > two.length() ? one.length() : two.length();
//      Longer and shorter string variables are taken just for convenience
        String shorter = one.length() > two.length() ? two : one;
        String longer = one.length() > two.length() ? one : two;
        int i = 0, j = 0;
        boolean flag = false;
        while(i < lenLong && j < lenShort){
            if(longer.charAt(i) != shorter.charAt(j)){
                if(!flag){
                    flag = true;
                    i++;
                    if (lenLong == lenShort) {
                        j++;
                    }
                }else{
                    return false;
                }
            }else{
                i++;
                j++;
            }
        }
        return true;
    }
}
