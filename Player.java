public abstract class Player {
    private String m_name;
    private int m_guessBoard[][];
    private Ship m_ships[];

    public Player(String name) {
        m_name = name;
        m_guessBoard = new int[10][10];
        m_ships = new Ship[5];
        m_ships[0] = new Battleship();
        m_ships[1] = new Carrier();
        m_ships[2] = new Cruiser();
        m_ships[3] = new Destroyer();
        m_ships[4] = new Submarine();
    }

    public String getName() {
        return m_name;
    }

    public int[][] getBoard() {
        return m_guessBoard;
    }

    public Ship[] getShips() {
        return m_ships;
    }

    public boolean isGameOver() {
        boolean isGameOver = false;
        int sunkShips = 0;
        for(int i = 0; i < m_ships.length; i++) {
            if(m_ships[i] != null && m_ships[i].isSunk()) {
                sunkShips++;
            }
        }
        if (sunkShips == 5){
            return true;
        }
        return false;
    }

    public abstract Location getAttackLocations();

    public void attackedByShip(Player attacker) {
        Location loc = attacker.getAttackLocations();
        for(int i = 0; i < m_ships.length; i++) {
            if(m_ships[i].getLocations().contains(loc)) {
                m_ships[i].addHit(loc);
                attacker.getBoard()[loc.getRow()][loc.getColumn()] = 1;
                return;
            }
            else {
                attacker.getBoard()[loc.getRow()][loc.getColumn()] = -1; 
            }
        }
    }
}
