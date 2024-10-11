/*
* click https://github.com/Siyabonga-LNP-35/Calculator.git github link 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author siyab
 */
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        // Accepting two numbers from the user via input dialogs
        String num1Str = JOptionPane.showInputDialog("Enter first number:");
        double num1 = Double.parseDouble(num1Str);

        String num2Str = JOptionPane.showInputDialog("Enter second number:");
        double num2 = Double.parseDouble(num2Str);

        // Initializing the option variable
        int option = -1;

        // While loop to keep asking until the user enters 0
        while (option != 0) {
            // Displaying menu options using JOptionPane
            String menu = "Choose an option from the menu:\n"
                    + "1. Addition\n"
                    + "2. Subtraction\n"
                    + "3. Division\n"
                    + "4. Multiplication\n"
                    + "Enter 0 to exit.";

            String optionStr = JOptionPane.showInputDialog(menu);
            option = Integer.parseInt(optionStr);

            // Performing the operation based on the option
            switch (option) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 + num2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 - num2));
                    break;
                case 3:
                    if (num2 != 0) {
                        JOptionPane.showMessageDialog(null, "Result: " + (num1 / num2));
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Cannot divide by zero.");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 * num2));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Calculation not recognized.");
            }
        }
    }
}
