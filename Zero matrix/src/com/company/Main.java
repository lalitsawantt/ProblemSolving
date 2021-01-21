package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//Given a matrix MxN, if any element is 0 then the whole row and column are set to 0
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int rows, column;
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        column = sc.nextInt();
        System.out.println("Enter the matrix elements");
        int matrix[][] = new int[rows][column];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int rowHasZero=-1, columnHasZero=-1;
//        check if the first row or column has zeroes
        for(int i=0; i<column;i++){
            if(matrix[0][i] == 0){
                rowHasZero = i;
            }
        }
        for(int i=0; i<rows; i++){
            if(matrix[i][0] == 0){
                columnHasZero = i;
            }
        }
//        check if the rest of the matrix has zeroes in any position
//        if yes, then make the corresponding first element in that row
//        and column = 0
//        then parse the first row and column and nullify those which have zeroes
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < column; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
//        call nullifyRow and nullify column for every element that is zero in the first row and column
        for(int i = 0; i < rows; i++){
            if(matrix[i][0]==0){

                nullifyRow(matrix,i);
            }
        }
        for(int i = 0; i < column; i++){
            if(matrix[0][i] == 0){
                nullifyCol(matrix,i);

            }
        }

        if(rowHasZero!=-1){
            nullifyRow(matrix, 0);
            nullifyCol(matrix,rowHasZero);
        }
        if(columnHasZero!=-1){
            nullifyRow(matrix, columnHasZero);
            nullifyCol(matrix,0);
        }

        for(int i=0; i < rows; i++){
            for(int j=0; j < column; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    static void nullifyRow(int[][] arr, int row){
        for(int i = 0; i < arr.length; i++){
            arr[row][i] = 0;
        }
    }

    static void nullifyCol(int[][] arr, int col){
        for(int i = 0; i < arr[0].length; i++){
            arr[i][col] = 0;
        }
    }
}
