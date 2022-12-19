public class Ball {
    private String col;
    private int rad;

    public Ball(String c, int r) {
        col = c;
        rad = r;
    }

    public Ball(String c) {
        col = c;
        rad = 10;
    }

    public Ball() {
        rad = 10;
        col = "white";
    }

    public void setColor(String c){
        this.col = c;
    }

    public void setRadius(int r) {
        this.rad = r;
    }

    public String getColor() {
        return col;
    }

    public int getRadius() {
        return rad;
    }

    public String toString(){
        return this.rad + " inch ball is " + this.col;
    }

    public void radiusToCm() {
        System.out.println(this.col + "ball's radius is " + 2.54 * this.rad);
    }
}
