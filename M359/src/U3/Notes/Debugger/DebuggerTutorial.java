package U3.Notes.Debugger;

public class DebuggerTutorial {

    public static void main(String[] args) {
        System.out.println("=== Starting Debugger Tutorial ===");

        String word = "banana";
        System.out.println("Original word: " + word);

        int vowels = countVowels(word);
        System.out.println("Total vowels: " + vowels);

        String reversed = reverseWord(word);
        System.out.println("Reversed word: " + reversed);

        boolean same = isPalindrome(word);
        System.out.println("Is the word a palindrome? " + same);

        String newWord = replaceLetter(word, "a", "o");
        System.out.println("New word after replacement: " + newWord);

        System.out.println("=== Program Complete ===");
    }

    public static int countVowels(String text) {
        int count = 0;
        System.out.println("Entering countVowels...");
        for (int i = 0; i < text.length(); i++) {
            String letter = text.substring(i, i + 1);
            if ("aeiou".indexOf(letter) >= 0) {
                count++;
            }
            System.out.println("Checked: " + letter + " | Current count: " + count);
        }
        System.out.println("Exiting countVowels with count = " + count);
        return count;
    }

    public static String reverseWord(String text) {
        String reversed = "";
        System.out.println("Entering reverseWord...");
        for (int i = text.length() - 1; i >= 0; i--) {
            String letter = text.substring(i, i + 1);
            reversed += letter;
            System.out.println("Reversed so far: " + reversed);
        }
        System.out.println("Exiting reverseWord...");
        return reversed;
    }

    public static boolean isPalindrome(String text) {
        System.out.println("Entering isPalindrome...");
        String reversed = reverseWord(text);
        System.out.println("Comparing " + text + " and " + reversed);
        if (text.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static String replaceLetter(String text, String oldLetter, String newLetter) {
        System.out.println("Entering replaceLetter...");
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            String letter = text.substring(i, i + 1);
            if (letter.equals(oldLetter)) {
                result += newLetter;
            } else {
                result += letter;
            }
            System.out.println("Building: " + result);
        }
        System.out.println("Exiting replaceLetter...");
        return result;
    }
}