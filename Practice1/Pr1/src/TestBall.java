public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("White", 11);
        Ball b2 = new Ball("Orange", 7);
        Ball b3 = new Ball("Yellow");
        b3.setRadius(5);
        b2.setColor("Pink");
        System.out.println(b1);
        b2.radiusToCm();
    }
}