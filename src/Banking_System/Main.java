package Banking_System;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Online Banking System\n1. Create Account\n2. Check Balance\n3. Exit\nEnter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Account Type (Savings/Current):");
                    String type = sc.next();
                    System.out.println("Enter Name:");
                    String name = sc.next();
                    System.out.println("Enter Initial Balance:");
                    double balance = sc.nextDouble();
                    System.out.println("Enter Interest Rate/Overdraft Limit:");
                    double extra = sc.nextDouble();
                    Bank.createAccount(type, name, balance, extra);
                    break;
                case 2:
                    System.out.println("Enter Account Number:");
                    int accNum = sc.nextInt();
                    Bank.checkBalance(accNum);
                    break;
                case 3:
                    System.out.println("Thank you for using our Banking System!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}
