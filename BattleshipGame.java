public class BattleshipGame {
    private Player m_p1;
    private Player m_p2;
    
    public BattleshipGame (Player p1, Player p2){
        m_p1 = p1;
        m_p2 = p2;
    }

    public Player getPlayer1() {
        return m_p1;
    }

    public Player getPlayer2() {
        return m_p2;
    }
    
}
