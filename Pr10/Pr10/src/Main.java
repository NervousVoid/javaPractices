public class Main {
    public static void main(String[] args) {
        StudentListCreator list = new StudentListCreator(10);
        list.printNames();
        list.printGPAs();

        list.quicksortGpa();
        list.printNames();
        list.printGPAs();
    }
}