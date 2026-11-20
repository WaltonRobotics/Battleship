import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BattleshipDriver extends Canvas implements MouseListener
{
    public static final int WIDTH = 1024, HEIGHT = WIDTH / 12 * 9;
    private int x, y, squareSize, len;
    private BufferedImage logo, end;
    BattleshipGame m_game;

    public BattleshipDriver()
    {
        m_game = new BattleshipGame(new HumanPlayer("Player 1"), new ComputerPlayer("Player 2"));
        x = 90;
        y = 200;
        squareSize = 36;
        len = squareSize * 10 - 1;

        // get the players names
        String player1Name = m_game.getPlayer1().getName();
        String player2Name = m_game.getPlayer2().getName();

        // Get Battleship Logo
        try {
            logo = ImageIO.read(new File("img/Logo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get End Screen
        try {
            end = ImageIO.read(new File("img/End.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        addMouseListener(this);

        new Window(WIDTH, HEIGHT, "Battleship", this);

        String title = player1Name + " -vs- " + player2Name;
        new Window(WIDTH, HEIGHT, title, this);

        try {
            Thread.sleep(100);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        render();
        //Player 1 place ships
        m_game.getPlayer1().placeShips();
        //Player 2 places ships
        m_game.getPlayer2().placeShips();

    }

    private void render()
    {
        Graphics g = getGraphics();

        // Background
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        if(!m_game.isGameOver())
        {
            // Boards
            renderGrid(g, x, y, squareSize);
            renderGuesses(g, x, y, squareSize, m_game.getPlayer1());
            renderGrid(g, 570, y, squareSize);
            renderGuesses(g, 570, y, squareSize, m_game.getPlayer2());

            // Names
            g.setColor(Color.WHITE);
            g.drawString(m_game.getPlayer1().getName(), x, y + 25 + len);
            g.drawString(m_game.getPlayer2().getName(), 570, y + 25 + len);
        }
        else
        {
            // End Screen
            g.drawImage(end, 0, 0, this);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", 1, squareSize));
            String winner = "";
            g.drawString(winner, WIDTH / 2 - (winner.length() * squareSize / 4), HEIGHT / 4);
            g.drawString("Wins!", WIDTH / 2 - ("Wins!".length() * squareSize / 4), HEIGHT / 4 + squareSize);
        }

        // Battleship Logo
        g.drawImage(logo, WIDTH / 2 - 246, 10, this);

        g.dispose();
    }

    private void renderGrid(Graphics g, int x, int y, int s)
    {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", 1, s / 2));

        // Row Lines
        for(int i = 0; i < 11; i++)
            g.drawLine(x, y+i*s, x+len, y+i*s);

        // Column Lines
        for(int i = 0; i < 11; i++)
            g.drawLine(x+i*s, y, x+i*s, y+len);

        // Row Markers
        for(int i = 0; i < 10; i++)	//marks row coordinates on side
            g.drawString(i + "", x-(int)(s*0.43), y+(int)(s*0.67)+s*i);

        // Column Markers
        for(int i = 0; i < 10; i++) 	//marks column coordinates on top
            g.drawString(i + "", x+(int)(s*0.4)+s*i, y-(int)(s*0.2));
    }

    public void renderGuesses(Graphics g, int x, int y, int s, Player player)
    {
        int[][] guessBoard = player.getBoard();
        for(int r = 0; r < guessBoard.length; r++)
            for(int c = 0; c < guessBoard[r].length; c++)
                if(guessBoard[r][c] > 0)    // hit
                {
                    g.setColor(Color.RED);
                    g.fillOval(c*s+x+(int)(s*0.35), r*s+y+(int)(s*0.35), (int)(s*0.33), (int)(s*0.33));
                }
                else if(guessBoard[r][c] < 0)   // miss
                {
                    g.setColor(Color.WHITE);
                    g.fillOval(c*s+x+(int)(s*0.35), r*s+y+(int)(s*0.35), (int)(s*0.33), (int)(s*0.33));
                }
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        int r = e.getY();
        int c = e.getX();

        int len = squareSize * 10 - 1;
        if(r > y && r < y + len && c > x && c < x + len)    // clicked on board
        {
            int row = (r - y) / squareSize;
            int col = (c - x) / squareSize;

            System.out.println(row + ", " + col);
            render();
            m_game.getPlayer2().attackedByShip(m_game.getPlayer1(), new Location(row, col));
            
            render();
            m_game.changeTurn();
            m_game.getPlayer1().attackedByShip(m_game.getPlayer2(), null);

            render();
            m_game.changeTurn();

        }

        System.out.println(r + ", " + c);
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args)
    {
        new BattleshipDriver();
    }
}
