package marsRover;

import java.util.Arrays;

public class Rover {

    private static Position landingPosition, position;

    Rover(int latitude, int longitude, Orientation orientation) {
        landRover(latitude, longitude, orientation);
    }

    private void landRover(int latitude, int longitude, Orientation orientation) {
        landingPosition = new Position(latitude, longitude, orientation);
        position = new Position();
        position = landingPosition;
    }

    public void insertActions(String commandList) {
        String[] commands = commandList.split("");
        Arrays.stream(commands).forEach(command -> position.move(command));
    }

    public Position getPosition() {
        return position;
    }

    public Position getLangingPosition() {
        return landingPosition;
    }
}
