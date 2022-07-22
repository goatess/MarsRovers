
public class Rover {
    private static Position landingPosition;
    private Position position;

    Rover(int latitude, int longitude, Orientation orientation) {
        landingPosition = new Position(latitude, longitude, orientation);
        position = new Position();
        position = landingPosition;
    }

    public void insertCommand(String commandList) {
        String[] commands = commandList.split("");
        for (String command : commands) {
            switch (command) {
                case "M":
                    position.moveForward();
                    break;
                case "L":
                    position.rotateLeft();
                    break;
                case "R":
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
