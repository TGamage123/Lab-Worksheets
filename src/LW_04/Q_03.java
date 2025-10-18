package LW_04;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a power of 10: ");
        int power = scanner.nextInt();
        System.out.print("10^" + power + " is ");
        switch (power){
            case 6:
                System.out.print("1 Million");
                break;
            case 9:
                System.out.print("1 Billion");
                break;
            case 12:
                System.out.print("1 Trillion");
                break;
            case 15:
                System.out.print("1 Quadrillion");
                break;
            case 18:
                System.out.print("1 Quintillion");
                break;
            case 21:
                System.out.print("1 Sextillion");
                break;
            case 30:
                System.out.print("1 Nonillion");
                break;
            case 100:
                System.out.print("1 Googol");
                break;
            default:
                System.out.print("Unknown.");
        }
    }
}
