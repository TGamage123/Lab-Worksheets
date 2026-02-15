
package LW_06;

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        ArrayList<Dog> dogs = new ArrayList<>();

        for (Pet p: pets){
            if (p instanceof Dog) dogs.add((Dog) p);
        }

        double max = 0, min = 0, sum = 0;
        int n = 0;

        for (Dog d: dogs) {
            max = d.getWeight();
            min = d.getWeight();
            sum += d.getWeight();
            if (max < d.getWeight()) max = d.getWeight();
            if (min > d.getWeight()) min = d.getWeight();
            n++;
        }

        double avg = sum / n;

        System.out.println("Average : " + avg);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);

    }
}
