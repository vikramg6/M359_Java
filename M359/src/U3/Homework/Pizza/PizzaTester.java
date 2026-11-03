package U3.Homework.Pizza;
public class PizzaTester {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(18, 3, "Mushrooms, Onions, Pineapple");
        Pizza p2 = new Pizza(18, 3, "Corn, Chicken, Pepperoni");
        Pizza p3 = new Pizza(12, 1, "Ham");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
