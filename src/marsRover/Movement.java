package marsRover;

public class Movement extends Position {
    private static final int WORLD_LIMIT = 5;
    private static final int WORLD_START = 1;
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static final String MOVE = "M";
    private int latitude, longitude;
    private Orientation orientation;
    private Position position;

    public Movement(String command, Position position) {
        this.position = new Position();
        this.position = position;
        latitude = position.getLatitude();
        longitude = position.getLongitude();
        orientation = position.getOrientation();
        move(command);
    }

    public void move(String command) {

        if (orientation.equals(Orientation.N)) {
            if (command.equals(MOVE))
                latitude++;
            if (command.equals(LEFT))
                orientation = Orientation.W;
            else if (command.equals(RIGHT))
                orientation = Orientation.E;

        } else if (orientation.equals(Orientation.E)) {
            if (command.equals(MOVE))
                longitude++;
            if (command.equals(LEFT))
                orientation = Orientation.N;
            else if (command.equals(RIGHT))
                orientation = Orientation.S;

        } else if (orientation.equals(Orientation.S)) {
            if (command.equals(MOVE))
                latitude--;
            if (command.equals(LEFT))
                orientation = Orientation.E;
            else if (command.equals(RIGHT))
                orientation = Orientation.W;

        } else if (orientation.equals(Orientation.W)) {
            if (command.equals(MOVE))
                longitude--;
            if (command.equals(LEFT))
                orientation = Orientation.S;
            else if (command.equals(RIGHT))
                orientation = Orientation.N;
        }

        checkWorldDimensions();
    }

    private void checkWorldDimensions() {
        while (latitude > WORLD_LIMIT) {
            latitude -= WORLD_LIMIT;
        }
        while (latitude < WORLD_START) {
            latitude = WORLD_LIMIT - latitude;
        }
        while (longitude > WORLD_LIMIT) {
            longitude -= WORLD_LIMIT;
        }
        while (longitude < WORLD_START) {
            longitude = WORLD_LIMIT - longitude;
        }
        position.setLatitude(latitude);
        position.setLongitude(longitude);
        position.setOrientation(orientation);
    }

}
