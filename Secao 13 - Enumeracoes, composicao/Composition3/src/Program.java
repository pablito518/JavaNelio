import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        Client client = new Client(clientName, email, LocalDate.parse(birthDate, fmt));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine(); //limpeza de buffer
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = Double.parseDouble(sc.nextLine());
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice,product);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println(order);
    }
}