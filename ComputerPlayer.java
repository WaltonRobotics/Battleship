public class ComputerPlayer extends Player {
    int m_attackLocation;
    int m_multiplier;
    boolean m_switch;
    public ComputerPlayer(String name) {
        super(name);
        m_attackLocation = -1;
        m_multiplier = 1;
        m_switch = false;
    }

    @Override
    public Location getAttackLocations(int altAttackLocations) {
        if(altAttackLocations == 1) {
            setAttackLocation(m_attackLocation + 1);
            return new Location(m_attackLocation / 10, m_attackLocation % 10);
        }
        if(altAttackLocations == 2) {
            if(m_switch == false) {
                setAttackLocation(100);
                m_switch = true;
            }
            setAttackLocation(m_attackLocation - 1);
        }
      //  if(altAttackLocations == 3) {
      //      if(m_attackLocation == -1) {
      //          m_attackLocation = 10 * m_multiplier;
      //          m_multiplier ++;
      //      } else {
      //          m_attackLocation --;
      //      }
      //  }
    return new Location(m_attackLocation / 10, m_attackLocation % 10);
    }

    public void setAttackLocation(int attackLocation) {
        m_attackLocation = attackLocation;
    }
    
    @Override
    public void placeShips(int altPlacement) {
        switch (altPlacement) {

            case 1:
            m_ships[0] = new Carrier(new Location(2, 9), 
                                    new Location(3, 9), 
                                    new Location(4, 9), 
                                    new Location(5, 9), 
                                    new Location(6, 9));
            m_ships[1] = new Cruiser(new Location(3, 3), 
                                    new Location(4, 3), 
                                    new Location(5, 3));
            m_ships[2] = new Destroyer(new Location(6, 0), 
                                       new Location(7, 0));
            m_ships[3] = new Submarine(new Location(0, 2), 
                                       new Location(0, 3), 
                                       new Location(0, 4));
            m_ships[4] = new Battleship (new Location(1, 7), 
                                         new Location(2, 7), 
                                         new Location(3, 7), 
                                         new Location(4, 7));
            break;
            case 2:
            m_ships[0] = new Carrier(new Location(9, 2), 
                                    new Location(9, 3), 
                                    new Location(9, 4), 
                                    new Location(9, 5), 
                                    new Location(9, 6));
            m_ships[1] = new Cruiser(new Location(3, 3), 
                                     new Location(3, 4), 
                                     new Location(3, 5));
            m_ships[2] = new Destroyer(new Location(0, 6), 
                                       new Location(0, 7));
            m_ships[3] = new Submarine(new Location(2, 0), 
                                       new Location(3, 0), 
                                       new Location(4, 0));
            m_ships[4] = new Battleship (new Location(7, 1), 
                                         new Location(7, 2), 
                                         new Location(7, 3), 
                                         new Location(7, 4));
            break;                            
            case 3:
            m_ships[0] = new Carrier(new Location(7, 3), 
                                     new Location(7, 4), 
                                     new Location(7, 5), 
                                     new Location(7, 6), 
                                     new Location(7, 7));
            m_ships[1] = new Cruiser(new Location(9, 5), 
                                     new Location(9, 6), 
                                     new Location(9, 7));
            m_ships[2] = new Destroyer(new Location(0, 8), 
                                       new Location(1, 8));
            m_ships[3] = new Submarine(new Location(0, 1), 
                                       new Location(1, 1), 
                                       new Location(2, 1));
            m_ships[4] = new Battleship (new Location(2, 5), 
                                         new Location(3, 5), 
                                         new Location(4, 5), 
                                         new Location(5, 5));
            break;
            case 4:
            m_ships[0] = new Carrier(new Location(3, 7), 
                                     new Location(4, 7), 
                                     new Location(5, 7), 
                                     new Location(6, 7), 
                                     new Location(7, 7));
            m_ships[1] = new Cruiser(new Location(5, 9), 
                                     new Location(6, 9), 
                                     new Location(7, 9));
            m_ships[2] = new Destroyer(new Location(8, 0), 
                                       new Location(8, 1));
            m_ships[3] = new Submarine(new Location(1, 0), 
                                       new Location(1, 1), 
                                       new Location(1, 2));
            m_ships[4] = new Battleship (new Location(5, 2), 
                                         new Location(5, 3), 
                                         new Location(5, 4), 
                                         new Location(5, 5));
            break;
            }
    }
}