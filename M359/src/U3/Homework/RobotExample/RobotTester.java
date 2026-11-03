package U3.Homework.RobotExample;

/**
The purpose of this code is to create a Robot object and then
 call methods on the Robot using the API documentation
 */
public class RobotTester {
    /*
    Recall a main method is required to run any code in Java!
     */

    public static void main(String[] args) {
        // Create a Robot with your name and 20% battery
        Robot king = new Robot("King", 20);
        // create a variable to represent the number of moves your robot has made
        int steps = 0;
        // Make your robot attempt 5 moves in any direction
        king.moveLeft();
        steps++;
        king.moveLeft();
        steps++;
        king.moveLeft();
        steps++;
        king.moveLeft();
        steps++;
        king.moveLeft();
        steps++;
        // update the counter accordingly
        // Recharge the battery for your robot
        king.chargeBattery();
        // Move 3 more times
        king.moveLeft();
        steps++;
        king.moveLeft();
        steps++;
        king.moveLeft();
        steps++;
        // Display a summary method for the robot
        System.out.println("\nThe " + king.getName() + " has moved " + steps + " times "
                + "and currently has " + king.getBatteryLevel() +"% remaining");
        // Ex: The Dennanator has moved 7 times and currently has 85% battery remaining
       
    }
}
