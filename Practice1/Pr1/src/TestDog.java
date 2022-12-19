public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Walter", 7);
        Dog d3 = new Dog("Saul");
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d3);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}