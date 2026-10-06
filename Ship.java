public class Ship{
    private int m_length;
    private String m_name;

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
}