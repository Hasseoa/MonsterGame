public class Monster {

    private int xpos;
    private int ypos;

    private double dxpos;
    private double dypos;

    public Monster(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.dxpos = (double) xpos;
        this.dypos = (double) ypos;
    }
    
    //region setget
    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos += xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos += ypos;
    }
    //endregion

    public void moveMonster(Player player) {
        int xDiff = player.getXpos()-xpos;
        int yDiff = player.getYpos()-ypos;

        if (xDiff>0){
            setXpos(1);
        }
        else if (xDiff<0){
            setXpos(-1);
        }

        if (yDiff>0){
            setYpos(1);
        }
        else if (yDiff<0){
            setYpos(-1);
        }
    }
}
