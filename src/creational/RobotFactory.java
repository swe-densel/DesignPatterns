package creational;

import creational.factory.*;

//Factory - creates a defined object only during runtime
// - used when subclass can not be determined early on
public class RobotFactory {

    public Robot getRobot(String action){
        if (action == null){
            return null;
        }

        if (action.equalsIgnoreCase("door")){
            return new DoorBuilderRobot();
        } else if (action.equalsIgnoreCase("frame")){
            return new FrameBuilderRobot();
        } else if (action.equalsIgnoreCase("wiring")){
            return new WiringBuilderRobot();
        } else if (action.equalsIgnoreCase("tester")){
            return new TesterRobot();
        }

        return null;
    }
}
