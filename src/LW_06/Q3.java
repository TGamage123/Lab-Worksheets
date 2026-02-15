package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Pet name. Enter 'STOP' to end : ");
            String name = sc.nextLine();

            if (name.equals("STOP")) break;

            System.out.println("Enter pet type ('c' for cat 'd' for dog) :");
            String type = sc.nextLine();

            switch (type){
                case "c":
                    Cat cat = new Cat();
                    cat.setName(name);
                    pets.add(cat);
                    break;
                case "d":
                    Dog dog = new Dog(name);
                    pets.add(dog);
                    break;
                default:
                    System.out.println("Invalid Pet type");
                    continue;
            }
        }

        System.out.println("All Cats :");
        for (Pet p: pets) {
            String type = "";
            if (p instanceof Cat) {
                type = "Cat";
                System.out.println("Pet name : " + p.getName() + ",\t\tPet type : " + type);
            }
        }
        System.out.println("All Dogs :");
        for (Pet p: pets) {
            String type = "";
            if (p instanceof Dog) {
                type = "Do" +
                        "";
                System.out.println("Pet name : " + p.getName() + ",\t\tPet type : " + type);
            }
        }
    }
}