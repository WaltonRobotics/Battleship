import java.util.Random;

public class ComputerPlayer extends Player
{
    public ComputerPlayer(String name)
    {

    }

    /**
     * Randomly chooses a Location that has not been
     *   attacked (Location loc is ignored).  Marks
     *   the attacked Location on the guess board
     *   with a positive number if the enemy Player
     *   controls a ship at the Location attacked;
     *   otherwise, if the enemy Player does not
     *   control a ship at the attacked Location,
     *   guess board is marked with a negative number.
     *
     * If the enemy Player controls a ship at the attacked
     *   Location, the ship must add the Location to its
     *   hits taken.  Then, if the ship has been sunk, it
     *   is removed from the enemy Player's list of ships.
     *
     * Return true if the attack resulted in a ship sinking;
     *   false otherwise.
     *
     * @param enemy The Player to attack.
     * @param loc The Location to attack.
     * @return
     */
    @Override
    public boolean attack(Player enemy, Location loc)
    {

    }

    /**
     * Construct an instance of
     *
     *   AircraftCarrier,
     *   Destroyer,
     *   Submarine,
     *   Cruiser, and
     *   PatrolBoat
     *
     * and add them to this Player's list of ships.
     */
    @Override
    public void populateShips()
    {

    }
}
