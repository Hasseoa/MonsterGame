public class GameBoard {

    public static final int HEIGHT = 20;
    public static final int WIDTH = 40;

    int[][] gameboard;
    Player player;
    Monster monster1;

    public GameBoard(){
        this.gameboard = new int[WIDTH][HEIGHT];
        player = new Player(20,10,true,'X');
        monster1 = new Monster(10, 10);

    }

    public void update(){

        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT ; y++) {
                gameboard[x][y] = 0;
            }

        }
        monster1.moveMonster(player);
        if (player.getXpos()==monster1.getXpos() && player.getYpos()==monster1.getYpos()) {
            player.setAlive(false);
        }
        gameboard[player.getXpos()][player.getYpos()] = 1;
        gameboard[monster1.getXpos()][monster1.getYpos()] =2;

        }


    }


