package LW_03.Q_01;

public class Temperature {
    private double celsius;
    private double fahrenheit;

    //no arg constructor
    public Temperature() {
    }

    //getters
    public double getCelsius(){
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    //setters
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void toFahrenheit() {
        fahrenheit = (celsius * 9 / 5 + 32);
    }

    public double toCelsius() {
        celsius = ((fahrenheit - 32) * 5 / 9);
        return 0;
    }

}
