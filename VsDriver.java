import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VsDriver extends Canvas
{
    public static final int WIDTH = 1024, HEIGHT = WIDTH / 12 * 9;
    private int x, y, squareSize, len;
    private BufferedImage logo, end, vs;
    BattleshipGame m_game;

    public VsDriver()
    {
        m_game = new BattleshipGame(new ComputerPlayer("Player 1"), new ComputerPlayer("Player 2"));
        x = 90;
        y = 200;
        squareSize = 36;
        len = squareSize * 10 - 1;

        // get the players names
        String player1Name = m_game.getPlayer1().getName();
        String player2Name = m_game.getPlayer2().getName();

        // create constructor in battle ship game
        
        // Get Battleship Logo
        try {
            logo = ImageIO.read(new File("Logo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get VS Screen
        try {
            vs = ImageIO.read(new File("VS.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get End Screen
        try {
            end = ImageIO.read(new File("End.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String title = player1Name + " -vs- " + player2Name;
        new Window(WIDTH, HEIGHT, title, this);

        try {
            Thread.sleep(100);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        render();
        move();
    }

    private void move()
    {
        while(!m_game.isGameOver())
        {
            render();

            try {
                Thread.sleep(250);                      // milliseconds; adjust to change speed
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void render()
    {
        Graphics g = getGraphics();

        // Background
        g.setColor(Color.BLACK);
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
            g.drawString("", x, y + 25 + len);
            g.drawString("", 570, y + 25 + len);
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

        // VS
        g.drawImage(vs, WIDTH / 2 + 180, 70, this);

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

    private void renderGuesses(Graphics g, int x, int y, int s, Player player)
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

    public static void main(String[] args)
    {
        new VsDriver();
    }
}
