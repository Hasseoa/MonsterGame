import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;

public class Input {
    
    Key key;
    Terminal terminal;

    public Input(Terminal terminal){
        Key key = terminal.readInput();
        this.terminal = terminal;
    }

    public void keyInput()throws InterruptedException{
        do{
            Thread.sleep(5);
            key=terminal.readInput();

            switch(key.getKind())
            {
                case ArrowDown:
                    break;
                case ArrowUp:
                    break;
                case ArrowLeft:
                    break;
                case ArrowRight:
                    break;
            }

        }while(key == null);
        System.out.println(key.getCharacter()+ " " + key.getKind());





    }




}
