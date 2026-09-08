package U1.homework;

public class Username {
    public static void main(String[] args) {
        String email = "shannon.denna@gmail.com";
        int dot = email.indexOf(".");
        int at = email.indexOf("@");
        String firstName = email.substring(0, dot);
        String lastName = email.substring(dot + 1, at);
        System.out.println(firstName);
        System.out.println(lastName);

        //username 2
        System.out.println(email.charAt(0) + "_" + lastName);
        //username 3
        int randomLetterIndex = (int)(Math.random() * (dot - 1));
        int randomLetterIndexL = (int)(Math.random() * (lastName.length() - 3));
        System.out.println(email.charAt(randomLetterIndex) + "_" + lastName.substring(randomLetterIndexL, randomLetterIndexL + 3));
    }
}
