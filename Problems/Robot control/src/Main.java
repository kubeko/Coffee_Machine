enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

//Don't change code below

class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        // The required direction of movement of the robot along the X axis
        Direction requestX = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
        // The required direction of movement of the robot along the Y axis
        Direction requestY = toY > robot.getY() ? Direction.UP : Direction.DOWN;

        while (toX != robot.getX() || toY != robot.getY()) {
            if (robot.getDirection().equals(requestX)) {
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            } else if (robot.getDirection().equals(requestY)) {
                while (toY != robot.getY()) {
                    robot.stepForward();
                }
            }
            if (toY != robot.getY()) {
                preciseRobotRotationToYAxis(robot, requestY);

            }
            if (toX != robot.getX()) {
                preciseRobotRotationToXAxis(robot, requestX);
            }
        }
    }
    // Precise rotation of the robot UP or DOWN from the current X-axis orientation.
    public static void preciseRobotRotationToYAxis(Robot robot, Direction requestY) {
        switch (robot.getDirection()) {
            case RIGHT:
                if (Direction.UP == requestY) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (Direction.UP == requestY) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            default:
                // if toX == robot.getY
                robot.turnRight();
                robot.turnRight();
                break;
        }
    }

    public static void preciseRobotRotationToXAxis(Robot robot, Direction requestX) {
        switch (robot.getDirection()) {
            case UP:
                if (Direction.RIGHT == requestX) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (Direction.RIGHT == requestX) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            default: // if toY == robot.getY()
                robot.turnRight();
                robot.turnRight();
                break;
        }
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}