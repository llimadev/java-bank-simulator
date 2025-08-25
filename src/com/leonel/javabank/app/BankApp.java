package com.leonel.javabank.app;

import com.leonel.javabank.model.User;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        // Create scanner to read user input
        Scanner input = new Scanner(System.in);

        User user = new User();
        // Set default username for demonstration
        user.setName("Leonel Lima");

        // Prompt user for CPF number and store input
        System.out.print("Type your CPF number: ");
        user.setCpf(input.nextLine());

        // Display user information
        System.out.println("Hello, " + user.getName());
        System.out.println("Your CPF number is: " + user.getCpf());
    }
}