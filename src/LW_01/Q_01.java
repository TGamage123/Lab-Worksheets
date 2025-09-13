package LW_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd-length word: ");
        String word = scanner.next();
        int length = word.length();
        if (length % 2 == 0){
            System.out.println("Error: Word must have odd length.");
        } else {
            System.out.println("Middle character: " + word.substring(length / 2, (length / 2) + 1));
        }
    }
}
