public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public void placeShips() {
        m_ships[0] = new Carrier(new Location(1, 1), 
                                 new Location(1, 2), 
                                 new Location(1, 3), 
                                 new Location(1, 4), 
                                 new Location(1, 5));
        m_ships[1] = new Cruiser(new Location(2, 1), 
                                 new Location(2, 2), 
                                 new Location(2, 3));
        m_ships[2] = new Destroyer(new Location(3, 1), 
                                   new Location(3, 2));
        m_ships[3] = new Submarine(new Location(4, 1), 
                                 new Location(4, 2), 
                                 new Location(4, 3));
        m_ships[4] = new Battleship (new Location(5, 1), 
                                     new Location(5, 2), 
                                     new Location(5, 3), 
                                     new Location(5, 4));
    }
    }
