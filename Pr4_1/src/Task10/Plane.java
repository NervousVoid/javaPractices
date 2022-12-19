package Task10;

public class Plane extends Vehicle{

    public Plane(int fueltank, int fuelprice, int consumption, int speed) {
        super(fueltank, fuelprice, consumption, speed);
    }

    @Override
    public void calcPrice(int distance) {
        double res = (distance / 100) * consumption * fuelprice;
        System.out.println(res);
    }

    @Override
    public void calcTime(int distance) {
        System.out.println(distance / speed);
    }
}
