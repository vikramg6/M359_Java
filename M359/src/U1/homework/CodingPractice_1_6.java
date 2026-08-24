package U1.homework;
import java.util.Scanner;

public class CodingPractice_1_6 {
    public static void main(String[] args) {
        //practice problem 1
        Scanner input = new Scanner(System.in);

        System.out.print("What is first number?");
        int num1 = input.nextInt();
        System.out.print("What is second number?");
        int num2 = input.nextInt();
        System.out.print("What is third number?");
        int num3 = input.nextInt();
        double average = ((double)num1 + num2 + num3)/3;
        System.out.println("Your numbers are " + num1 + ", " + num2 + ", " + num3 + ", and your average is " + average);

        //practice problem 2

        System.out.print("Enter a positive decimal value:");
        double num1_2 = input.nextDouble();
        double rounded = (int)(num1_2 + 0.5);
        System.out.println(num1_2 + " rounded to the nearest int is " + rounded);

        //practice problem 3

        System.out.print("Enter the seconds: ");
        int seconds1 = input.nextInt();
        int hours = seconds1/3600;
        int min = (seconds1%3600)/60;
        int seconds2 = seconds1 - (hours*3600) - (min * 60);
        System.out.println(seconds1 + " seconds is " + hours + " hours, " + min + " minutes, and " + seconds2 + " seconds");

        //practice problem 4

        System.out.print("Enter the cents: ");
        int change = input.nextInt();
        int quarters = (change/ 25);
        int dimes =  ((change % 25)/10);
        int nickels = (((change % 25)%10)/5);
        int pennies = (((change % 25)%10)%5);
        System.out.println("The coins for " + change +  " will be " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickles, and " + pennies + " pennies");

        //practice problem 5
        System.out.print("Enter the miles: ");
        int miles = input.nextInt();
        System.out.print("Enter the minutes: ");
        int minutes = input.nextInt();
        int seconds =  minutes*60;
        int secondsPerMile = seconds/miles;
        int displayM = secondsPerMile/60;
        int displayS = secondsPerMile%60;
        System.out.println(displayM + " min " + displayS + " sec / mile");
        





    }
}
