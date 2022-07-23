package marsRover;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void vehicle_knows_its_landing_zone() {
        final String LANDING_POSITION = "5, 5, N";
        Rover marsRover = new Rover(5, 5, Orientation.N);
        String finalPosition = marsRover.getLangingPosition().toString();

        assertEquals(LANDING_POSITION, finalPosition);
    }

    @Test
    public void rover_receives_a_command_to_get_its_position() {
        final String PROTO_LANDING_POSITION = "5, 5, N";
        final String POSITION_AFTER_COMMAND = "5, 5, N";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(5, 5, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
        assertEquals(landingPosition, finalPosition);
    }

    @Test
    public void rover_receives_command_M_and_moves_forward() {
        final String PROTO_LANDING_POSITION = "1, 2, N";
        final String POSITION_AFTER_COMMAND = "1, 5, N";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 2, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("MMM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
    }

    @Test
    public void rover_receives_command_L_and_rotatesLeft() {
        final String PROTO_LANDING_POSITION = "2, 1, N";
        final String POSITION_AFTER_COMMAND = "1, 1, W";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(2, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("LM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
    }

    @Test
    public void rover_receives_command_L_and_rotatesLeft_multiple_times() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "2, 1, E";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("LLLM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
    }

    @Test
    public void rover_receives_command_R_and_rotates_right() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "2, 1, E";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("RM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
    }

    @Test
    public void rover_receives_command_R_and_rotates_right_multiple_times() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "2, 1, E";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("RRRRRRRRRM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
    }

    @Test
    public void rover_knows_world_dimensions_when_moves_north() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "1, 1, N";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("MMMMM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
    }

    @Test
    public void rover_knows_world_dimensions_when_moves_east() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "1, 1, E";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("RMMMMM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
    }

    @Test
    public void rover_knows_world_dimensions_when_moves_south() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "1, 1, S";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("LLMMMMM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
    }

    @Test
    public void rover_knows_world_dimensions_when_moves_west() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "1, 1, W";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("LMMMMM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);
    }

    @Test
    public void rover_knows_world_dimensions_when_world_is_crossed_several_times() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "1, 1, N";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("MMMMMMMMMMMMMMMMMMMMMMMMM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);

    }

    @Test
    public void rover_knows_world_dimensions_when_several_commands_are_inserted() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "2, 5, E";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("MMMRMMMLMMMLLMMMMMRRMMMLLLMMM");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);

    }

    @Test
    public void wrong_command() {
        final String PROTO_LANDING_POSITION = "1, 1, N";
        final String POSITION_AFTER_COMMAND = "1, 1, N";
        String landingPosition;
        String finalPosition;

        Rover marsRover = new Rover(1, 1, Orientation.N);
        landingPosition = marsRover.getLangingPosition().toString();
        marsRover.insertActions("ABCDEFG");
        finalPosition = marsRover.getPosition().toString();

        assertEquals(PROTO_LANDING_POSITION, landingPosition);
        assertEquals(POSITION_AFTER_COMMAND, finalPosition);

    }
}
