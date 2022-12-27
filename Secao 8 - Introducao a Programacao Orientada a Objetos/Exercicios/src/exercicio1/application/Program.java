package exercicio1.application;

import exercicio1.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle ret = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        ret.width = sc.nextDouble();
        ret.height = sc.nextDouble();

        System.out.println(ret);
    }
}
