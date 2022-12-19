public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Tolstoy", 237);
        Book b2 = new Book("Lermontov", 134);
        Book b3 = new Book("London");
        b3.setPages(511);
        b2.setAuthor("Brodsky");
        System.out.println(b1);
        System.out.println(b2);
        b1.isBookBoring();
    }
}