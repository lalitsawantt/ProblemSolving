package com.company;

import java.util.*;

public class Main {
//given a string, implement a method to perform basic string compression where the counts of each
//    character occur after the character
//    i.e,  aaabbcccccd
//          a3b2c5d1
//    return the original string if the length of the compressed string is >= the length of the original string
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = sc.next();
        String compressed = compressedString(string);
        System.out.println("The compressed string is : ");
        System.out.println(compressed);
    }

    static String compressedString(String str){
        int compressedLen = compressed(str);
        if(compressedLen >= str.length()){
            return str;
        }
        int countconsecutive = 0;
        StringBuilder sb = new StringBuilder(compressedLen);
        for(int i = 0; i < str.length(); i++){
            countconsecutive++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(countconsecutive);
                countconsecutive = 0;
            }
        }
        return sb.toString();
    }

    static int compressed(String str) {
        int compressedLength = 0, countConsecutive = 0;

        for(int i = 0; i < str.length(); i++){
            countConsecutive++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressedLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive=0;
            }

        }
        return compressedLength;
    }
}
