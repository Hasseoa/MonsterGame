import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        while (true){
            Game game = new Game();
            game.run();
            System.out.println("Do you want to play again? (y/n)");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(s.equals("no") || s.equals("n")){
                break;
            }
        }

        System.exit(0);

    }



}
