import java.util.ArrayList;
import java.util.List;

public abstract class Ship
{
    private int length;
    private List<Location> locations;
    private List<Location> hitsTaken;

    public Ship(int length)
    {

    }

    public void addLocation(Location... loc)
    {

    }

    public List<Location> getLocations()
    {

    }

    /**
     * Add Location loc to hitsTaken.
     *
     * @param loc
     */
    public void takeHit(Location loc)
    {

    }

    /**
     * Returns true if the number of hits taken is
     *   equal to the length of this ship.
     *
     * @return
     */
    public boolean isSunk()
    {

    }
}
