public class Player {

    private int xpos;
    private int ypos;
    private boolean alive;
    private char symbol;

    public Player(int xpos, int ypos, boolean alive, char symbol) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.alive = alive;
        this.symbol = symbol;
    }

    //region setget
    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    //endregion
}
