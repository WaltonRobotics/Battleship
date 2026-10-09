import java.util.HashSet;

public abstract class Ship{
    private int m_length;
    private String m_name;
    private HashSet<Location> m_locations;
    private HashSet<Location> m_hitLocations;

    public Ship(int length, String name) {
        m_length = length;
        m_name = name;
    }

    public String getName() {
        return m_name;
    }

    public int getLength() {
        return m_length;
    }

    public void addLocation(Location location) {
        m_locations.add(location);
    }

    public HashSet<Location> getLocations() {
        return m_locations;
    }

    public void addHit(Location location) {
        if (m_locations.contains(location)) {
            m_hitLocations.add(location);
        }
    }

    public boolean isSunk() {
        return m_locations.size() == m_hitLocations.size();
    }
}