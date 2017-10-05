public class GameBoard {

    public static final int HEIGHT = 20;
    public static final int WIDTH = 40;

    int[][] gameboard;
    Player player;

    public GameBoard(){
        this.gameboard = new int[WIDTH][HEIGHT];
        player = new Player(20,10,true,'X');

    }

    public void update(){

        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT ; y++) {
                gameboard[x][y] = 0;
            }
        }

        gameboard[player.getXpos()][player.getYpos()] = 1;

    }

}
