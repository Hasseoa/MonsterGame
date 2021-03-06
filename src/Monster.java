public class Monster {

    private int xpos;
    private int ypos;

    private double dxpos;
    private double dypos;
    private double  speed;

    public Monster(int xpos, int ypos, double speed) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.dxpos = (double) xpos;
        this.dypos = (double) ypos;
        this.speed = speed;
    }

    //region setget


    public double getDxpos() {
        return dxpos;
    }

    public void setDxpos(double changeX) {
        this.dxpos += changeX;
    }

    public double getDypos() {
        return dypos;
    }

    public void setDypos(double changeY) {
        this.dypos += changeY;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed += speed;
    }

    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int change) {
        this.ypos = change;
    }
    //endregion


public void moveMonster(Player player) {
        int xDiff = player.getXpos()-xpos;
        int yDiff = player.getYpos()-ypos;

        if (xDiff>0){
            setDxpos(1*speed);
        }
        else if (xDiff<0){
            setDxpos(-1*speed);
        }
        if (yDiff>0){
            setDypos(1*speed);
        }
        else if (yDiff<0){
            setDypos(-1*speed);
        }
        toInteger();
    }

    private void toInteger(){
        setXpos((int)getDxpos());
        setYpos((int)getDypos());
    }
    public void changeSpeed(int count) {
        if (count%20==0)
            setSpeed(0.05);
    }

}
