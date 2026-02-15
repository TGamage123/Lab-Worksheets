package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
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
                    System.out.println("Enter coat color :");
                    cat.setCatColor(sc.nextLine());
                    pets.add(cat);
                    break;
                case "d":
                    Dog dog = new Dog(name);
                    System.out.println("Enter dog weight :");
                    dog.setWeight(sc.nextDouble());
                    sc.nextLine();
                    pets.add(dog);
                    break;
                case null, default:
                    System.out.println("Invalid Pet type");
                    continue;
            }
        }

        System.out.println("\nAll Cats :");
        for (Pet p: pets) {
            if (p instanceof Cat) {
                String type = "Cat";
                System.out.print("\nPet name : " + p.getName());
                System.out.print(",\t\tPet type : " + type);
                System.out.print(",\t\tCoat color : " + ((Cat) p).getCatColor());
            }
        }
        System.out.println("\n\nAll Dogs :");
        for (Pet p: pets) {
            if (p instanceof Dog) {
                String type = "Dog";
                System.out.print("\nPet name : " + p.getName());
                System.out.print(",\t\tPet type : " + type);
                System.out.print(",\t\tDog weight : " + ((Dog) p).getWeight());
            }
        }
    }
}