package LW_01;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter outer radius (ro): ");
        double ro = scanner.nextDouble();
        System.out.println("Enter inner radius (ro): ");
        double ri = scanner.nextDouble();

        Circle outerCircle = new Circle(ro);
        Circle innerCircle = new Circle(ri);

        double outerArea = outerCircle.computeArea();
        double innerArea = innerCircle.computeArea();

        double shadedArea = outerArea - innerArea;

        System.out.printf("Area of outer circle: %.2f\n", outerArea);
        System.out.printf("Area of inner circle: %.2f\n", innerArea);
        System.out.printf("Area of circular region: %.2f\n", shadedArea);
    }
}
