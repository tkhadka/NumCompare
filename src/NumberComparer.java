/*
Pseudocode:
- Initialize Scanner for input.
- Prompt the user for the first number.
- Check if the next input is an integer:
  - If yes, store the first number.
  - If no, display an error message and exit.
- Prompt the user for the second number.
- Check if the next input is an integer:
  - If yes, store the second number.
  - If no, display an error message and exit.
- Compare the two numbers:
  - If they are equal, display a message saying they are equal.
  - If not, display which one is less..
*/

import java.util.Scanner;

public class NumberComparer {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        if (!numberScanner.hasNextInt()) {
            System.out.println("This is not a number. Please try again.");
            return;
        }
        int firstNumber = numberScanner.nextInt();

        System.out.print("Enter the second number: ");
        if (!numberScanner.hasNextInt()) {
            System.out.println("This is not a number. Please try again.");
            return;
        }
        int secondNumber = numberScanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Both numbers are equal.");
        } else if (firstNumber < secondNumber) {
            System.out.println("The first number is less: " + firstNumber);
        } else {
            System.out.println("The second number is less: " + secondNumber);
        }

    }
}
