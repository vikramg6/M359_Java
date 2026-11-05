package U3.Notes.Cereal;

public class CerealTester {
    public static void main(String[] args) {
        Cereal nothing = new Cereal("Kelloggs", "Apple Jack");
        System.out.println(nothing);
        nothing.setHasMilk(false);
        nothing.setBoxSize(17.5);
        System.out.println(nothing.getBrand());
    }
}
