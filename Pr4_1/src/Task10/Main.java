package Task10;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(10000, 80, 1000, 800);
        Train train = new Train(1000, 30, 450, 100);
        Ship ship = new Ship(500000, 65, 2500, 90);

        plane.calcTime(15000);
        plane.calcPrice(1000);

        train.calcTime(15000);
        train.calcPrice(1000);

        ship.calcTime(15000);
        ship.calcPrice(1000);
    }
}