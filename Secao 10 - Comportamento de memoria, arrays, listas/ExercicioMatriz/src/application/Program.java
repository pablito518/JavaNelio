package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();


        int mat[][] = new int[rows][cols];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();
        int n = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < cols; j++) {
                if(mat[i][j] == n){
                    System.out.println("Position: " + i + "," + j);
                    if(i > 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if(j > 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(j+1 < mat.length){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(i+1 < rows){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
