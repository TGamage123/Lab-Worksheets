package LW_05_Q2;

public abstract class Person {
    //Private variable
    private String name;

    //Constructor
    public Person(String name) {
        this.name = name;
    }

    //Getter method
    public String getName() {
        return name;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    //Abstract method
    public abstract void displayInfo();
}
