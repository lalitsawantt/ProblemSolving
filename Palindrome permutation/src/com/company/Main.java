package com.company;

import java.util.*;

public class Main {
// Given a string, write a function to check if it is a permutation of a palindrome.

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
//      Assuming the string contains only lower case characters.
//      For including all characters, increase the space of the array
        int counter[] = new int[26];
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int len = str.length();
        for(int i = 0; i < len; i++){
            if(str.charAt(i)!=' '){
                counter[str.charAt(i)-'a']++;
            }
        }
        int oddCount = 0;
        boolean flag = true;
        for(int i = 0; i < 26; i++){
            if(counter[i]%2!=0){
                if(oddCount > 1){
                    flag = false;
                    break;
                }
                oddCount++;
            }
        }
        if(flag){
            System.out.println("The string IS a permutation of a palindrome");
        }else{
            System.out.println("The string IS NOT a permutation of a palindrome");
        }
    }
}
