import java.awt.*;

public class GameBoard {

    public static final int HEIGHT = 20;
    public static final int WIDTH = 40;

    int[][] gameboard;
    Player player;
    Monster monster1;
    Monster monster2;
    Monster monster3;
    Monster monster4;

    public GameBoard(){
        this.gameboard = new int[WIDTH][HEIGHT];
        player = new Player(20,10,true,'X');
        monster1 = new Monster(10, 10, 0.3);
        monster2 = new  Monster(30,10,0.5);
        monster3 = new Monster(15, 15, 0.4);
        monster4 = new  Monster(10,8,0.6);
    }

    public void update(){

        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT ; y++) {
                gameboard[x][y] = 0;
            }

        }
        monster1.moveMonster(player);
        monster2.moveMonster(player);
        monster3.moveMonster(player);
        monster4.moveMonster(player);
        monster1.changeSpeed(Game.count);//monster 1 bli snabbare med tiden!


        if (player.getXpos()==monster1.getXpos() && player.getYpos()==monster1.getYpos()) {
            player.setAlive(false);
        }
        if (player.getXpos()==monster2.getXpos() && player.getYpos()==monster2.getYpos()) {
            player.setAlive(false);
        }
        if (player.getXpos()==monster3.getXpos() && player.getYpos()==monster3.getYpos()) {
            player.setAlive(false);
        }
        if (player.getXpos()==monster4.getXpos() && player.getYpos()==monster4.getYpos()) {
            player.setAlive(false);
        }
        if(!player.isAlive()){
            Toolkit.getDefaultToolkit().beep();
        }

        gameboard[player.getXpos()][player.getYpos()] = 1;
        gameboard[monster1.getXpos()][monster1.getYpos()] =2;
        gameboard[monster2.getXpos()][monster2.getYpos()] =3;
        gameboard[monster3.getXpos()][monster3.getYpos()] =4;
        gameboard[monster4.getXpos()][monster4.getYpos()] =5;
        }
    }


