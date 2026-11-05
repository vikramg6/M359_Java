package U3.Notes.Worksheet;

public class CoffeeOrder {
    private String name, size;
    private int extraShots;

    public CoffeeOrder(String name, String size, int extraShots) {
        this.name = name;
        this.size = size;
        this.extraShots = extraShots;
    }

    public CoffeeOrder(String name, String size) {
        this.name = name;
        this.size = size;
        extraShots = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExtraShots() {
        return extraShots;
    }

    public void setExtraShots(int extraShots) {
        this.extraShots = extraShots;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public double calculateCost(){
        double sizeCost, shotsCost;
        if(size.equals("small")){
            sizeCost = 1000.00;
        }
        if(size.equals("medium")){
            sizeCost = 10000.00;
        }
        else{
            sizeCost = 10000.00;
        }
        shotsCost = 100 * extraShots;
        return sizeCost + shotsCost;
    }
}
