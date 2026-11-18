public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override 
    public Location getAttackLocations() {
        return new Location(0, 0);
    }

    @Override
    public void placeShips() {
        m_ships[0] = new Carrier(new Location(6, 1), 
                                 new Location(6, 2), 
                                 new Location(6, 3), 
                                 new Location(6, 4), 
                                 new Location(6, 5));
        m_ships[1] = new Cruiser(new Location(7, 1), 
                                 new Location(7, 2), 
                                 new Location(7, 3));
        m_ships[2] = new Destroyer(new Location(7, 7), 
                                   new Location(7, 8));
        m_ships[3] = new Submarine(new Location(8, 1), 
                                   new Location(8, 2), 
                                   new Location(8, 3));
        m_ships[4] = new Battleship (new Location(9, 1), 
                                     new Location(9, 2), 
                                     new Location(9, 3), 
                                     new Location(9, 4));
    }
}
