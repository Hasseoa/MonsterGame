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
        this.input = new Input(terminal);
    }

    public void run()throws InterruptedException{


        while(true){
            gameBoard.update();
            render.draw();
            input.keyInput();

            //Wait for a key to be pressed
//            Key key=terminal.readInput();
//            keyHandler(key);

        }
    }

//    private void keyHandler(Key key)throws InterruptedException{
//        do{
//            Thread.sleep(5);
//
//            key =terminal.readInput();
//        }
//        while(key == null);
//        System.out.println(key.getCharacter()+ " " + key.getKind());
//
//        switch(key.getKind())
//        {
//            case ArrowDown:
//                break;
//            case ArrowUp:
//                break;
//            case ArrowLeft:
//                break;
//            case ArrowRight:
//                break;
//        }
//    }
}



