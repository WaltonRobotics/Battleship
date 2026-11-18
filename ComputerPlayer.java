public class ComputerPlayer extends Player {
    int m_attackLocation;
    public ComputerPlayer(String name) {
        super(name);
        m_attackLocation = -1;
    }

    @Override
    public Location getAttackLocations() {
        m_attackLocation++;
        return new Location(m_attackLocation / 10, m_attackLocation % 10);
    }
}