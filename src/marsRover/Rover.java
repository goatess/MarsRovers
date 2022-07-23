package marsRover;

import java.util.Arrays;

public class Rover {

    private static Position landingPosition, position;

    Rover(int latitude, int longitude, Orientation orientation) {
        landRover(latitude, longitude, orientation);
    }

    Rover(String command) {
        extractCoordinates(command);
        String[] coord = extractCoordinates(command);
        int latitude = Integer.valueOf(coord[0]);
        int longitude = Integer.valueOf(coord[1]);
        Orientation orientation = extractOrientation(command);
        landRover(latitude, longitude, orientation);
    }

    private void landRover(int latitude, int longitude, Orientation orientation) {
        landingPosition = new Position(latitude, longitude, orientation);
        position = new Position();
        position = landingPosition;
    }

    public String[] extractCoordinates(String command) {
        String onlyNum = command.replaceAll("\\D+", "");
        String[] coord = onlyNum.split("");
        return coord;
    }

    public Orientation extractOrientation(String command) {
        command = command.replaceAll("\\W", "");
        command = command.replaceAll("\\d", "");
        Orientation orientation = Orientation.valueOf(command);
        return orientation;
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
