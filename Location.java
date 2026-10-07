public class Location {
    private int m_row;
    private int m_col;

    Location(int row, int col) {
        m_row = row;
        m_col = col;
    }

    int getRow() {
        return m_row;
    }

    int getCol() {
        return m_col;
    }
}
