package LW_03.Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        Temperature temperature = new Temperature();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter c to enter the temperature in Celsius or f to enter it in Fahrenheit: ");
        String temp = scanner.next();

        if (temp.equals("c")) {
            System.out.println("Enter the temperature in Celsius: ");
            celsius = scanner.nextDouble();
            temperature.setCelsius(celsius);
            temperature.toFahrenheit();
            System.out.println("Fahrenheit: "+temperature.getFahrenheit());
        } else if (temp.equals("f")){
            System.out.println("Enter the temperature in Fahrenheit: ");
            fahrenheit = scanner.nextDouble();
            temperature.setFahrenheit(fahrenheit);
            temperature.toCelsius();
            System.out.println("Celsius: "+temperature.getCelsius());
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
