package U3.Homework.Pizza;

public class Pizza {
    private int diameter, toppings;
    private String toppingName;

    public Pizza(int diameter, int toppings, String toppingName) {
        this.diameter = diameter;
        this.toppings = toppings;
        this.toppingName = toppingName;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }
    public String toString(){
            return "Your " + diameter + "\" pizza has " + toppings + " toppings: " + toppingName;
    }
    public boolean equals(Pizza other){
        return this.diameter == other.diameter && this.toppings == other.toppings;
    }
}
