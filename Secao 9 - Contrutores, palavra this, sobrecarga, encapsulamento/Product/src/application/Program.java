package application;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);


        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products do be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products do be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
