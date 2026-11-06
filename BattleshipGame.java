public class BattleshipGame {
    private Player m_p1;
    private Player m_p2;
    private boolean m_p1Turn; //if true it is p1 turn 
    
    public BattleshipGame (Player p1, Player p2){
        m_p1 = p1;
        m_p2 = p2;
        m_p1Turn = true;
    }

    public Player getPlayer1() {
        return m_p1;
    }

    public Player getPlayer2() {
        return m_p2;
    }

    public boolean getP1Turn() {
        return m_p1Turn;
    }

    public void changeTurn() {
        m_p1Turn = !m_p1Turn;
    }
    
}
