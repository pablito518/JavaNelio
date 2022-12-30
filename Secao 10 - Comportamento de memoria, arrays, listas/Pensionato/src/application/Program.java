package application;

import entities.BoardingHouse;
import entities.Renter;

import java.text.MessageFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int rooms = sc.nextInt();
        BoardingHouse bh = BoardingHouse.getInstance();

        for (int i = 0; i < rooms; i++) {
            System.out.println("\nRent #" + (i+1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            Renter renter = new Renter(name, email, roomNumber);
            bh.rentRoom(renter, roomNumber);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < 10; i++) {
            if(bh.getBusyRooms(i) != null){
                System.out.println(MessageFormat.format(
                        "{0}: {1}, {2}" ,i,bh.getBusyRooms(i).getName(),bh.getBusyRooms(i).getEmail()));
            }
        }
    }
}
