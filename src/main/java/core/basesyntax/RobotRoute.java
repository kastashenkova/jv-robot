package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        findRightX(robot, toX);
        findRightY(robot, toY);
    }

    private void findRightX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                findRightDirection(robot, Direction.LEFT);
            } else {
                findRightDirection(robot, Direction.RIGHT);
            }
            robot.stepForward();
        }
    }

    private void findRightY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                findRightDirection(robot, Direction.UP);
            } else {
                findRightDirection(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    private void findRightDirection(Robot robot, Direction correct) {
        while (robot.getDirection() != correct) {
            robot.turnLeft();
        }
    }
}
