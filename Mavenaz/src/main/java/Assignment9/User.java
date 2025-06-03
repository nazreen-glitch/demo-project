package Assignment9;

import java.util.Scanner;

class Bank {
    private int pin;

    public void setPin(int pin) {
        this.pin = pin;
    }

   
    public boolean validatePin() {
        return (pin == 1001 || pin == 1234 || pin == 1212);
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
}

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter your 4-digit PIN: ");
        int inputPin = sc.nextInt();

        bank.setPin(inputPin);

        if (bank.validatePin()) {
            System.out.println("PIN Verified.");
            bank.withdraw();
        } else {
            System.out.println("Invalid PIN. Access Denied.");
        }

        sc.close();
    }
}

