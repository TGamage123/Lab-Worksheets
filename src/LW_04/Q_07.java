package LW_04;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;


        do {
            System.out.println("Enter number: ");
            number = scanner.nextInt();

            int count = 0 ;

            if (number < 0)
                System.out.println("Program ended.");
            else if (number == 0) {
                count = 1;
                System.out.println("Number of digits in " + number + " is: " + count);
            }else {
                int temp  = number;
                while (temp != 0) {
                    temp = temp/ 10;
                    count++;
                }
                System.out.println("Number of digits in " + number + " is: " + count);
            }
            }while (number>=0) ;

    }
}
