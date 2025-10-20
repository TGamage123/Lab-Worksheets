package LW_04;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word to be replaced: ");
        String oldWord = scanner.nextLine();

        System.out.println("Enter the replacement word: ");
        String newWord = scanner.nextLine();

        String updatedSentence = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);

        System.out.println("\nOriginal sentence: " + sentence);
        System.out.println("Updated sentence: " + updatedSentence);

        scanner.close();
    }
}
