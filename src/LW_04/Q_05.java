package LW_04;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Menu items:");
            System.out.println("1. Entree Menu");
            System.out.println("2. Side Dish Menu");
            System.out.println("3. Drink Menu");
            System.out.println("Select your choice: ");
            number = scanner.nextInt();
            if (number < 1 || number > 3) {
                System.out.println("\nInvalid Number. \nEnter a correct number.");
            }
        }while (number<1 || number>3);

        switch (number){
            case 1:
                System.out.println("Entree Menu:");
                System.out.printf("%-20s %s%n" ,"Tofu Burger", "$3.49");
                System.out.printf("%-20s %s%n" ,"Cajun Chicken"," $4.59");
                System.out.printf("%-20s %s%n" ,"Buffalo Wings" ,"$3.99");
                System.out.printf("%-20s %s%n" ,"Rainbow Fillet ", "$2.99");
                break;
            case 2:
                System.out.println("Dish Menu:");
                System.out.printf("%-20s %s%n" ,"Rice Cracker", "$0.79");
                System.out.printf("%-20s %s%n" ,"No-Salt Fries" ,"$0.69");
                System.out.printf("%-20s %s%n" ,"Zucchini", "$1.09");
                System.out.printf("%-20s %s%n" ,"Brown Rice" ,"$0.59");
                break;
            case 3:
                System.out.println("Drink Menu:");
                System.out.printf("%-20s %s%n" ,"Cafe Mocha", "$1.99");
                System.out.printf("%-20s %s%n" ,"Cafe Latte", "$1.90");
                System.out.printf("%-20s %s%n" ,"Espresso", "$2.49");
                System.out.printf("%-20s %s%n" ,"Oolong Tea" ,"$0.99");
        }
    }
}
