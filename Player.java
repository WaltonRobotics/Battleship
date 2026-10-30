public abstract class Player {
    private String m_name;
    private int m_guessBoard[][];
    private Ship m_ships[];

    public Player(String name) {
        m_name = name;
        m_guessBoard = new int[10][10];
        m_ships = new Ship[5];
    }

    public String getName() {
        return m_name;
    }

    public int[][] getBoard() {
        return m_guessBoard;
    }
}