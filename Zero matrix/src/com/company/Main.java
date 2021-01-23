package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//Given a matrix MxN, if any element is 0 then the whole row and column are set to 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        System.out.println("Enter the number of rows ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns ");
        columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];
        int rowHasZero = -1, colHasZero = -1;
        System.out.println("Enter the matrix elements");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
        setZeroes(matrix);
        System.out.println("output matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    static void setZeroes(int [][] matrix){
        boolean rowHasZero = false;
        boolean colHasZero = false;

        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                rowHasZero = true;
                break;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                colHasZero = true;
                break;
            }
        }

//        check for zeroes in the rest of the matrix
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                nullifyRow(matrix,i);
            }
        }
        for(int j = 1; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                nullifyCol(matrix,j);
            }
        }
        if(rowHasZero) nullifyRow(matrix, 0);
        if(colHasZero) nullifyCol(matrix, 0);
    }
    static void nullifyRow(int[][] arr, int row){
        for(int i = 0; i < arr[0].length; i++){
            arr[row][i] = 0;
        }
    }

    static void nullifyCol(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
        }
    }
}
