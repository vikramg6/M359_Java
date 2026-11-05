package U3.Notes.Cereal;

public class Cereal {
    private String name; //Frosted Flakes
    private String brand; //Kellogg
    private boolean hasMilk;
    private double boxSize;
    public String toString(){
        return brand + " " + name + " size: " + boxSize + " milk? " + hasMilk;
    }
    public Cereal(String brand, String name) {
        this.brand = brand;
        this.name = name;
        boxSize = 14.5;
        hasMilk = true;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public double getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(double boxSize) {
        this.boxSize = boxSize;
    }
}
