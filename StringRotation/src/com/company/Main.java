package com.company;
import java.util.*;

public class Main {
//given a string and another rotated string, check whether the second one is a rotation of the first
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String original = sc.nextLine();
        System.out.println("Enter the rotated string");
        String rotated = sc.nextLine();
        String check = rotated + rotated;
        if(isSubstring(original, check)){
            System.out.println("The second string IS a rotation of the first");
        }else{
            System.out.println("The second string is NOT a rotation of the first");
        }
    }

    static boolean isSubstring(String src, String dest){
//        search the source string in the destination string
        return dest.contains(src);
    }
}
