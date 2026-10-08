public class Location {
    private int m_row;
    private int m_column;

    public Location(int row, int column) {
        m_row = row;
        m_column = column;
    }

    public int getRow() {
        return m_row;
    }

    public int getColumn() {
        return m_column;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        Location location = (Location) obj;

        if (this.getRow() == location.getRow() && this.getColumn() == location.getColumn()) {
            return true;
        }
        
        return false;
    }
}