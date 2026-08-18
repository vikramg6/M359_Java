
package U1.homework;


//***************************************************************
//File: Paint.java
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************


import java.util.Scanner;


    public class Paint {
        public static void main(String[] args) {
            final int COVERAGE = 350; //paint covers 350 sq ft/gal
            int door = 20;
            int window = 15;

            // declare variables for the following values:
            // integers length, width, and height
            // double totalSqFt
            // double paintNeeded


            //declare and initialize Scanner object
            Scanner input = new Scanner(System.in);


            //Prompt for and read in the length of the room
            System.out.print("What is the length of the room?");
            int length = input.nextInt();
            //Prompt for and read in the width of the room
            System.out.print("What is the length of the room?");
            int width = input.nextInt();
            //Prompt for and read in the height of the room
            System.out.print("What is the length of the room?");
            int height = input.nextInt();
            System.out.print("How many windows?");
            int windows = input.nextInt();
            System.out.print("How many doors?");
            int doors = input.nextInt();

            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            double totalSqFt = (length * height) * 2 + (width * height) * 2;
            //Compute the amount of paint needed
            double doorSqFt = door*doors;
            double windowSqFt = window*windows;
            double paintNeeded = (totalSqFt - windowSqFt - doorSqFt)/COVERAGE;
            //Print the length, width, and height of the room and the
            System.out.println("The room has length: 15, width: 22, and height: 9");
            //number of gallons of paint needed.
            int roundedNum = (int) Math.ceil(paintNeeded);
            System.out.println("You will need " + roundedNum + " gallons of paint");
        }
    }
