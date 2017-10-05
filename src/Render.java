
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;

public class Render {
    Terminal terminal;
    GameBoard gameBoard;

    public Render(Terminal terminal, GameBoard gameBoard){
        this.terminal = terminal;
        this.gameBoard = gameBoard;

    }

    public void draw(){
        terminal.applyBackgroundColor(0,0,0);
        for (int x = 0; x < GameBoard.WIDTH; x++) {
            for (int y = 0; y < GameBoard.HEIGHT; y++) {
                terminal.moveCursor(x,y);
                if (gameBoard.gameboard[x][y] == 0) {
                    terminal.putCharacter(' ');
                }

                if(gameBoard.gameboard[x][y] == 1){
                    terminal.putCharacter('X');
                }
                if (gameBoard.gameboard[x][y] == 2) {
                    terminal.putCharacter('O');
                }


            }
        }
    }
}
