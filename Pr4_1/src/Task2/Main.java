package Task2;

public class Main {
    public static void main(String[] args) {
        Phone ph1 = new Phone("79678764327", "iPhone", 150);
        Phone ph2 = new Phone("88005553535", "Xiaomi");
        Phone ph3 = new Phone();

        System.out.printf("Phone 1: number — %s, model — %s, weight — %d\n", ph1.getNumber(), ph1.getModel(), ph1.getWeight());
        System.out.printf("Phone 2: number — %s, model — %s, weight — %d\n", ph2.getNumber(), ph2.getModel(), ph2.getWeight());
        System.out.printf("Phone 3: number — %s, model — %s, weight — %d\n", ph3.getNumber(), ph3.getModel(), ph3.getWeight());

        ph1.receiveCall("Peter");
        ph2.receiveCall("Sam");
        ph3.receiveCall("Peter", "79999991212");

        ph1.sendMessage("87865748743", "78234239112", "78778128754", "87865641289");
    }
}