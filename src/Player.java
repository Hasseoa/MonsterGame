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

    public void setXpos(int arrowRightLeft) {
        if (xpos==0){
            if ( arrowRightLeft> 0){
                this.xpos += arrowRightLeft;
            }
        }  else if (xpos == GameBoard.WIDTH-1){
            if (arrowRightLeft < 0){
                this.xpos += arrowRightLeft;
            }
        } else this.xpos += arrowRightLeft;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int arrowDownUpp) {
        if (ypos==0){
            if (arrowDownUpp > 0){
                this.ypos += arrowDownUpp;
            }
        }  else if (ypos == GameBoard.HEIGHT-1){
            if (arrowDownUpp < 0){
                this.ypos += arrowDownUpp;
            }
        } else this.ypos += arrowDownUpp;
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
