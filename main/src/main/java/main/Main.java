package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter 1 for donut or 2 for cube:");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Donut.main(args);
            } else if (choice == 2) {
                Cube.main(args);
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
