package Task10;

public abstract class Vehicle {
    protected int fueltank;
    protected int fuelprice;
    protected int consumption;
    protected int speed;

    public Vehicle(int fueltank, int fuelprice, int consumption, int speed){
        this.fueltank = fueltank;
        this.fuelprice = fuelprice;
        this.consumption = consumption;
        this.speed = speed;
    }

    public abstract void calcTime(int distance);
    public abstract void calcPrice(int distance);
}
