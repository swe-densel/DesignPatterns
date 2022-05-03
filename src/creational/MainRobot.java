package creational;

import creational.factory.Robot;

public class MainRobot {
    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();

        Robot robot = robotFactory.getRobot("frame");
        robot.doTask();
    }
}
