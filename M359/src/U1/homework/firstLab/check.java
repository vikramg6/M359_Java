package U1.homework.firstLab;

public class check {
    public static void main(String[] args) {
        check("ASEGGS");
    }
    public static void check(String word){
        String firstLetter = word.substring(0, 1);
        String lastLetter = word.substring(word.length() - 1);
        boolean letterEquality = firstLetter.equals(lastLetter);
        System.out.println("The first letter: " + firstLetter);
        System.out.println("The last letter: " + lastLetter);
        System.out.println(firstLetter + " equals " + lastLetter + " is " + letterEquality);

    }

}
