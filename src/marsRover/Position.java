package marsRover;

public class Position {
    private static final int WORLD_LIMIT = 5;
    private static final int WORLD_START = 1;
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static final String MOVE = "M";
    private int latitude, longitude;
    private Orientation orientation;

    int[][] tileMap = new int[WORLD_LIMIT][WORLD_LIMIT];

    Position(){ 
    }

    Position(int longitude, int latitude, Orientation orientation) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.orientation = orientation;
    }

    private void checkWorldDimensions(int latitude, int longitude) {
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

        this.latitude = latitude;
        this.longitude = longitude;
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

        checkWorldDimensions(latitude, longitude);
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setLatitude(int longitude) {
        this.longitude = longitude;
    }

    public void setLongitude(int latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return String.valueOf(longitude) + ", " + String.valueOf(latitude) + ", " + orientation.getValue();
    }
}
