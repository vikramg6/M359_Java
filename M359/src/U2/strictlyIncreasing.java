package U2;

public class strictlyIncreasing {
    public static void main(String[] args) {
        Boolean result = strictlyIncreasing(15579);
        System.out.println(result);
    }
    public static boolean strictlyIncreasing(int num){
        int currentDigit = num % 10;
        num /= 10;
        while(num > 0){
            int nextDigit = num % 10;
            if (nextDigit >= currentDigit){
                return false;
            }
            currentDigit = nextDigit;
            num /= 10;
        }
        return true;
    }
}

