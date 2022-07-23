package marsRover;

public class Position {
    private int latitude, longitude;
    private Orientation orientation;

    Position(){ 
    }

    Position(int longitude, int latitude, Orientation orientation) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.orientation = orientation;
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

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return String.valueOf(longitude) + ", " + String.valueOf(latitude) + ", " + orientation.getValue();
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
}
