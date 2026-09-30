package U2;

public class textCompression {
    public static void main(String[] args) {
        String text = "abbbcdaa";
        String result = "";
        int counter = 1;
        int i = 0;
         for (i = 0; i < text.length(); i++) {
            if (i + 1 < text.length() && text.substring(i, i+1).equals(text.substring(i+1, i +2))) {
                counter++;
            }
            else {
                result += text.substring(i, i+1) + counter;
                counter = 1;
            }
        }
        System.out.println(result);
    }
}
