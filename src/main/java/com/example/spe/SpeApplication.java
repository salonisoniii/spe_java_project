package com.example.spe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeApplication.class, args);
        Scanner scanner = new Scanner(System.in);
//
        System.out.println("Welcome to the Basic Calculator!");
        double num1 = getNumber(scanner, "Enter the first number: ");
        double num2 = getNumber(scanner, "Enter the second number: ");
        char operator = getOperator(scanner);

        double result = calculate(num1, num2, operator);
        if (Double.isNaN(result)) {
            System.out.println("Error! Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    public static double getNumber(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static char getOperator(Scanner scanner) {
        System.out.print("Enter the operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static double calculate(double num1, double num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Error! Invalid operator.");
                result = Double.NaN;
        }
        return result;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Double.NaN;
        }
    }

}
