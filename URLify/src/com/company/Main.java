package com.company;

import java.util.Scanner;

public class Main {
// Given a string, turn it into a URL by adding %20 instead of every space in the string
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int len = str.length();
        char string[] = str.toCharArray();
        String url = Main.makeURL(string, len);
        System.out.println(url);
    }

    public static String makeURL(char arr[], int length){
//
        int spaces = 0;
        for(int i = 0; i < length; i++){
            if(arr[i]==' '){
                spaces++;
            }
        }
        int newLen = length + 3*spaces;
        int j = 0;
        char changeToURL[] = new char[newLen];
        for(int i = 0; i < length; i++){
            if(arr[i] != ' '){
//                not a space, copy the character
                changeToURL[j] = arr[i];
                j++;
            }else{
                changeToURL[j] = '%';
                changeToURL[j+1] = '2';
                changeToURL[j+2] = '0';
                j = j + 3;
            }
        }
        changeToURL[j] = '\0';
        String url = new String(changeToURL);
        return url;
    }
}
