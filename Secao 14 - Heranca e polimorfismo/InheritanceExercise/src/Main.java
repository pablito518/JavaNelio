import entitites.ImportedProduct;
import entitites.Product;
import entitites.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            double productPrice = sc.nextDouble();
            if (productType == 'i' || productType == 'I') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product imported = new ImportedProduct(productName, productPrice, customsFee);
                products.add(imported);
            } else if (productType == 'u' || productType == 'U') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate ManufactureDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product used = new UsedProduct(productName, productPrice, ManufactureDate);
                products.add(used);
            } else {
                Product product = new Product(productName, productPrice);
                products.add(product);
            }
        }
            System.out.println("Price TAGS:");
            for (Product product : products) {
                System.out.println(product.priceTag());
            }

    }

}
