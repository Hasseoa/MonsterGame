
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;
import java.text.Format;

public class Render {
    Terminal terminal;
    GameBoard gameBoard;

    public Render(Terminal terminal, GameBoard gameBoard) {
        this.terminal = terminal;
        this.gameBoard = gameBoard;
        terminal.setCursorVisible(false);

    }

    public void draw() {
        terminal.applyBackgroundColor(0, 0, 0);
        for (int x = 0; x < GameBoard.WIDTH; x++) {
            for (int y = 0; y < GameBoard.HEIGHT; y++) {
                terminal.moveCursor(x, y);
                if (gameBoard.gameboard[x][y] == 0) {
                    terminal.putCharacter(' ');
                } else if (gameBoard.gameboard[x][y] == 1) { //Player
                    terminal.putCharacter('X');
                } else if (gameBoard.gameboard[x][y] == 2) {
                    terminal.putCharacter('O');
                } else if (gameBoard.gameboard[x][y] == 3) {
                    terminal.putCharacter('\u265E');
                } else if (gameBoard.gameboard[x][y] == 4) {
                    terminal.putCharacter('S');
                } else if (gameBoard.gameboard[x][y] == 5) {
                    terminal.putCharacter('T');


                }
            }
        }
    }

    public void startScreen()throws InterruptedException{
        terminal.applyBackgroundColor(20,150,150);
        for (int x = 0; x < GameBoard.WIDTH ; x++) {
            for (int y = 0; y < GameBoard.HEIGHT; y++) {
                terminal.moveCursor(x,y);
                terminal.putCharacter('*');
            }
        }

        terminalPrint("             Monsterhug 2D              ",
                "   by: Christian, Hans, John, Mathias   ",terminal,8);
        Thread.sleep(6000);
    }

    public void gameOver (int count){
        terminal.applyBackgroundColor(255,0,0);
        for (int x = 0; x < GameBoard.WIDTH; x++) {
            for (int y = 0; y < GameBoard.HEIGHT; y++) {
                terminal.moveCursor(x,y);
                terminal.putCharacter(' ');
            }

        }
        terminalPrint("            Game Over","            Number of steps: "+Integer.toString(count),terminal,8);

    }

    private static void terminalPrint(String s1,String s2, Terminal t, int line){
        t.moveCursor(0,line);
        for (int i = 0; i < s1.length() ; i++) {
            t.putCharacter(s1.charAt(i));
            t.moveCursor(i+1,line);
        }
        t.moveCursor(0,line+1);
        line++;
        for (int i = 0; i < s2.length() ; i++) {
            t.putCharacter(s2.charAt(i));
            t.moveCursor(i+1,line);

        }


    }
}
