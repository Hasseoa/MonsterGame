import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;

public class Game {
    Terminal terminal;
    GameBoard gameBoard;
    Render render;
    Input input;


    public Game(){
        this.terminal = TerminalFacade.createTerminal(System.in,System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        this.gameBoard = new GameBoard();
        this.render = new Render(terminal,gameBoard);
        this.input = new Input(terminal, gameBoard);
    }

    public void run()throws InterruptedException{
        int count = 0;

        render.startScreen();
        while(true){

            gameBoard.update();
            if (!gameBoard.player.isAlive()){
                terminal.clearScreen();
                break;
            }
            render.draw();
            input.keyInput();
            terminal.clearScreen();
            count++;
        }
        render.gameOver(count);
        //System.exit(0);
    }

}



