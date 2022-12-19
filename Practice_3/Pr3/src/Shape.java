public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    public String toString() {
        return String.format("Shape is %s\nIt's field status is: %b\n", color, filled);
    }
}
