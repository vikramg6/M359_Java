package U1.notes;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println("First method call for sendMessage");
        sendMessage("I'll be late");
        sendMessage("Mom", "I'll be late");
        sendMessage("Mom", "I'll be late", "Aug 24");
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
}
