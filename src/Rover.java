
public class Rover {
    private static final String MOVE = "M";
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static Position landingPosition, position;

    Rover(int latitude, int longitude, Orientation orientation) {
        landingPosition = new Position(latitude, longitude, orientation);
        position = new Position();
        position = landingPosition;
    }

    public void insertCommand(String commandList) {
        String[] commands = commandList.split("");
        for (String command : commands) {
            switch (command) {
                case MOVE:
                    position.moveForward();
                    break;
                case LEFT:
                    position.rotateLeft();
                    break;
                case RIGHT:
                    position.rotateRight();
                    break;
                default:
                    break;
            }
        }
    }

    public Position getPosition() {
        return position;
    }

    public Position getLangingPosition() {
        return landingPosition;
    }
}
