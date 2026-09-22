import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Player
{
    private String name;
    private List<Ship> ships;
    private int[][] guessBoard;

    public Player(String name)
    {

    }

    public String getName()
    {

    }

    /**
     * Returns how many ships are currently in this
     *   Player's ships List.
     *
     * @return
     */
    public int getNumberOfShips()
    {

    }

    /**
     * Returns the ship that occupies the specified
     *   Location loc.  Returns null if this Player
     *   does not control a ship at Location loc.
     *
     * @param loc
     * @return
     */
    public Ship getShip(Location loc)
    {

    }

    public void addShip(Ship ship)
    {

    }

    public void removeShip(Ship ship)
    {

    }

    /**
     * Returns true if this Player controls a ship
     *   at the specified Location loc; false
     *   otherwise.
     *
     * @param loc
     * @return
     */
    public boolean hasShipAtLocation(Location loc)
    {

    }

    public int[][] getGuessBoard()
    {

    }

    /**
     * Returns true if obj is an instanceof Player and
     *   instance variables are equivalent.
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj)
    {

    }

    /**
     * Attack the specified Player at the specified Location.
     *
     * Return true if the attack resulted in a ship sinking;
     *   false otherwise.
     *
     * @param enemy
     * @param loc
     * @return
     */
    public abstract boolean attack(Player enemy, Location loc);

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
    public abstract void populateShips();
}
