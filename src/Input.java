import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;

public class Input {

    Key key;
    Terminal terminal;
    GameBoard gameBoard;

    public Input(Terminal terminal, GameBoard gameBoard){
        this.terminal = terminal;
        this.gameBoard = gameBoard;
    }

    public void keyInput()throws InterruptedException{
        do{
            Thread.sleep(5);
            key=terminal.readInput();

        }while(key == null);

        switch(key.getKind())
        {
            case ArrowDown:
                gameBoard.player.setYpos(1);
                break;
            case ArrowUp:
                gameBoard.player.setYpos(-1);
                break;
            case ArrowLeft:
                gameBoard.player.setXpos(-1);
                break;
            case ArrowRight:
                gameBoard.player.setXpos(1);
                break;
        }

    }




}
