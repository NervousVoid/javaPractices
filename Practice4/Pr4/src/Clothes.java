abstract public class Clothes {
    protected int size, price;
    protected String color;

    public Clothes(){}
    public Clothes(int s, int p, String c) {
        size = s;
        price = p;
        color = c;
    }

    public Clothes(int p, String c) {
        price = p;
        color = c;
    };

    public abstract String getType();
    public abstract String toString();
}

