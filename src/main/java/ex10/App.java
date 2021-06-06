/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Oliver Moreno
 */
package ex10;

import java.util.Scanner;
/*
Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items.
Then calculate the tax using a tax rate of 5.5%.
Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output

Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints
Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.

Challenges
Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        // item 1
        System.out.print("Enter the price of item 1: ");
        String item1Price = in.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String item1Quantity = in.nextLine();
        // item 2
        System.out.print("Enter the price of item 2: ");
        String item2Price = in.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String item2Quantity = in.nextLine();
        // item 3
        System.out.print("Enter the price of item 3: ");
        String item3Price = in.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String item3Quantity = in.nextLine();

        // converting strings to doubles
        //prices
        double item1P = Double.parseDouble(item1Price);
        double item2P = Double.parseDouble(item2Price);
        double item3P = Double.parseDouble(item3Price);
        // quantities
        double item1Q = Double.parseDouble(item1Quantity);
        double item2Q = Double.parseDouble(item2Quantity);
        double item3Q = Double.parseDouble(item3Quantity);

        // calculations
        double subtotal = ((item1P*item1Q) + (item2P*item2Q) + (item3P*item3Q));
        double tax = 0.055 * subtotal;
        double total = subtotal + tax;

        // output
        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n", subtotal, tax, total);
    }
}
