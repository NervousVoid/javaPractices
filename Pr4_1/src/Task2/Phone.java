package Task2;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String n, String m, int w) {
        this(n, m);
        weight = w;
    }

    public Phone(String n, String m) {
        number = n;
        model = m;
        weight = 100;
    }

    public Phone() {
        number = "81231231212";
        model = "Nokia 3310";
        weight = 100;
    }

    public String getNumber(){
        return number;
    }

    public int getWeight(){
        return weight;
    }

    public String getModel(){
        return model;
    }

    public void receiveCall(String name) {
        System.out.printf("%s calls\n", name);
    }

    public void receiveCall(String name, String num) {
        System.out.printf("%s calls: %s\n", name, num);
    }

    public void sendMessage(String ... list) {
        for (String num : list) {
            System.out.printf("Message sent to %s\n", num);
        }
    }
}
