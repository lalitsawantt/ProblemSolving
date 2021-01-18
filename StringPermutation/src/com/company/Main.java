package com.company;
import java.util.*;

public class Main {

// Given two strings, check if one string is the permutation of the other

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str1,str2;
        System.out.println("Enter the first string");
        str1 = sc.nextLine();
        System.out.println("Enter the second string");
        str2 = sc.nextLine();

//      Storing the count of each character in an array
//      Subtracting count by 1 whenever the character is found in the second string
//      and then check for equality with 0

//      Assuming only lower case a-z. In case of uppercase, increase the size of the array
        if(str1.length() == str2.length()) {
            int count[] = new int[26];
            boolean flag = true;
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) != ' ')
                count[str1.charAt(i) - 'a']++;
            }
            for(int i = 0; i < str2.length(); i++) {
                if(str2.charAt(i) != ' ')
                if (count[str2.charAt(i) - 'a'] > 0) {
                    count[str2.charAt(i)-'a']--;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("The strings are permutations of each other");
            }else {
                System.out.println("The strings are NOT permutations of each other");
            }
        }else{
            System.out.println("String lengths do not match. NOT a permutation");
        }
    }
}
