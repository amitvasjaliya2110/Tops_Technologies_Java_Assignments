package core.java.arraysAndStrings;

import java.util.Scanner;

public class Matrix2DArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = 2, c = 2;
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] add = new int[r][c];
        int[][] sub = new int[r][c];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                add[i][j] = a[i][j] + b[i][j];
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Matrix Addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(add[i][j] + " ");
            System.out.println();
        }

        System.out.println("Matrix Subtraction:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(sub[i][j] + " ");
            System.out.println();
        }
    }
}

