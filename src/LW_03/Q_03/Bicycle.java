package LW_03.Q_03;

public class Bicycle {
    private Owner owner;

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
