package com.company;
import java.util.*;

public class Main {
//Assuming the string is in ascii format
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter the string to check for duplicate characters");
        str = scanner.nextLine();
        int array[] = new int[128];
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ')
            array[str.charAt(i)]++;
//            will not count a space as a character
        }

        boolean flag = false;

        for(int i = 0; i < 128; i++){
            if(array[i] > 1){
                System.out.println("character " + (char)i + " appears more than once");
                flag=!flag;
                break;
            }
        }
        if(!flag){
            System.out.println("All characters are unique");
        }
    }
}
