public class Position {
    private static final int WORLD_LIMIT = 5;
    private static final int WORLD_START = 1;
    private int longitude;
    private int latitude;
    Orientation orientation;

    Position() {
    }

    Position(int latitude, int longitude, Orientation orientation) {
        this.longitude = latitude;
        this.latitude = longitude;
        this.orientation = orientation;
    }

    public void moveForward() {
        switch (orientation) {
            case N:
                latitude++;
                break;
            case E:
                longitude++;
                break;
            case S:
                latitude--;
                break;
            case W:
                longitude--;
                break;
            default:
                break;
        }
        worldDimensionsCHeck();
    }

    private void worldDimensionsCHeck() {
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
    }

    public void rotateRight() {

        switch (orientation) {
            case N:
                this.orientation = Orientation.E;
                break;
            case E:
                this.orientation = Orientation.S;
                break;
            case S:
                this.orientation = Orientation.W;
                break;
            case W:
                this.orientation = Orientation.N;
                break;
            default:
                break;
        }
    }

    public void rotateLeft() {

        switch (orientation) {
            case N:
                orientation = Orientation.W;
                break;
            case E:
                orientation = Orientation.N;
                break;
            case S:
                orientation = Orientation.E;
                break;
            case W:
                orientation = Orientation.S;
                break;
            default:
                break;
        }
    }

    public int getLatitude() {
        return longitude;
    }

    public int getLongitude() {
        return latitude;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setLatitude(int latitude) {
        this.longitude = latitude;
    }

    public void setLongitude(int longitude) {
        this.latitude = longitude;
    }

    @Override
    public String toString() {
        return String.valueOf(longitude) + ", " + String.valueOf(latitude) + ", " + orientation.getValue();
    }
}
