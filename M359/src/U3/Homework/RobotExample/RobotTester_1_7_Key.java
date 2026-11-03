package U3.Homework.RobotExample;

/**
 The purpose of this code is to create a Robot object and then
 call methods on the Robot using the API documentation
 */

public class RobotTester_1_7_Key {
    /*
    Recall a main method is required to run any code in Java!
    */
        public static void main(String[] args) {
            // Create a Robot with your name and 20% battery
            // create a variable to represent the number of moves your robot has made
            Robot dennaBot = new Robot("The Dennantor", 20);
            int numMoves = 0;

            // Make your robot attempt 5 moves in any direction
            // update the counter accordingly
            dennaBot.moveRight();
            numMoves++;
            dennaBot.moveLeft();
            numMoves++;
            dennaBot.moveDown();
            numMoves++;
            dennaBot.moveUp();
            numMoves++;
            dennaBot.moveRight();
            numMoves++;

            // Recharge the battery for your robot
            dennaBot.chargeBattery();

            // Move 3 more times
            dennaBot.moveLeft();
            numMoves++;
            dennaBot.moveUp();
            numMoves++;
            dennaBot.moveRight();
            numMoves++;

            // Display a summary method for the robot
            // Ex: The Dennanator has moved 7 times and currently has 85% battery remaining
            System.out.println("\nThe " + dennaBot.getName() + " has moved " + numMoves + " times "
                    + "and currently has " + dennaBot.getBatteryLevel() +"% remaining");
        }
    }

