package U3.Homework.RobotExample;
/**
 This class simulates a Robot moving around its environment
 The Robot can move left, right, up, and down. Currently, the Robot
 can move infinitely in any direction without bounds

 The robot also has a battery life, and each time it moves, the battery
 decreases 5%. Currently, charging the battery restores power to 100%

 @author sdenna
 @version 1
 Edited July 9, 2025
 */
public class Robot {
    private int batteryLevel;
    private String name;

    /**
     * @param name
     * @param batteryLevel
     */
    public Robot(String name, int batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;
    }

    /**
     *
     * @param name
     */
    public Robot(String name) {
        this.batteryLevel = 100;
        this.name = name;
    }

    /**
     * If Robot has > 5% battery remaining, the robot moves left, and battery is decreased by 5.
     * A message is displayed notifying them if they moved or if they must charge their battery.
     */

    public void moveLeft() {
        if (batteryLevel > 5) {
            System.out.println(name + " moved left.");
            batteryLevel -= 5;
        }
        else {
            System.out.println("Sorry, no battery left. You must charge " + name);
        }
    }

    /**
     * If Robot has > 5% battery remaining, the robot moves right, and battery is decreased by 5.
     * A message is displayed notifying them if they moved or if they must charge their battery.
     */
    public void moveRight() {
        if (batteryLevel > 5) {
            System.out.println(name + " moved right.");
            batteryLevel -= 5;
        }
        else {
            System.out.println("Sorry, no battery left. You must charge " + name);
        }
    }

    /**
     * If Robot has > 5% battery remaining, the robot moves up, and battery is decreased by 5.
     * A message is displayed notifying them if they moved or if they must charge their battery.
     */
    public void moveUp() {
        if (batteryLevel > 5) {
            System.out.println(name + " moved up.");
            batteryLevel -= 5;
        }
        else {
            System.out.println("Sorry, no battery left. You must charge " + name);
        }
    }

    /**
     * If Robot has > 5% battery remaining, the robot moves down, and battery is decreased by 5.
     * A message is displayed notifying them if they moved or if they must charge their battery.
     */
    public void moveDown() {
        if (batteryLevel > 5) {
            System.out.println(name + " moved down.");
            batteryLevel -= 5;
        }
        else {
            System.out.println("Sorry, no battery left. You must charge " + name);
        }
    }

    /**
     * Displays a message with current battery level
     */
    public void displayBatteryLevel() {
        System.out.println(name + " has " + batteryLevel + "% batter remaining");
    }

    /**
     * Charges battery to 100%
     */
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("\nBattery is fully charged\n");
    }

    /**
     * @return the current battery level
     */
    public int getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * @return the name of the Robot
     */
    public String getName() {
        return name;
    }
}

