package U1.notes;
import java.util.Scanner;

public class MethodPractice {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("First method call for sendMessage");
        //sendMessage("I'll be late");
        //sendMessage("Mom", "I'll be late");

        System.out.println(add(8, 2));
        System.out.println(add(8.0,8.0));

    }
    //our method need to be after the main{} but before the last }
    public static void sendMessage(String msg) {
        System.out.println(msg);
    }
    public static void sendMessage(String recipient, String msg) {
        System.out.println("Send message to: " + recipient + " msg: " + msg);

    }
    public static void sendMessage(String recipient, String msg, String date) {
        System.out.println("Send message to: " + recipient + " msg: " + msg + ", date: " + date);

    }

    public static int add(int a, int b) {
        return a + b;

    }
    public static double add(double a, double b) {
        return a + b;

    }
}
