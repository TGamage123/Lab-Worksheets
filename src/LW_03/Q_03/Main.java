package LW_03.Q_03;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("John", "0111234567");
        Bicycle bicycle = new Bicycle(owner);
        System.out.println(bicycle.getOwner().getOwnerName());
        System.out.println(bicycle.getOwner().getPhoneNo());
    }
}
