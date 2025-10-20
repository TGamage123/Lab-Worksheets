package LW_04;

import java.util.Random;
import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("Guess the number between 1 and 100!");

        do {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > number) {
                System.out.println("Too high! Try again.");
            } else if (guess < number) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + number);
            }
        } while (guess != number);

        scanner.close();
    }
}
