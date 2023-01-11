package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc01 = new Account(number, holder, initialBalance, withdrawLimit);


            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            acc01.withdraw(sc.nextDouble());
            System.out.print("New balance: ");
            System.out.println(String.format("%.2f", acc01.getBalance()));
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
