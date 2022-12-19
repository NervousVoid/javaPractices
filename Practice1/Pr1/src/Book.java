public class Book {
    private String author;
    private int pages;

    public Book(String a, int p) {
        author = a;
        pages = p;
    }

    public Book(String a) {
        author = a;
        pages = 200;
    }
    public Book(int p) {
        author = "Tolstoy";
        pages = p;
    }

    public Book(){
        author = "Tolstoy";
        pages = 1500;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages(){
        return pages;
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return "A book by " + this.author + " has " + this.pages + " pages";
    }

    public void isBookBoring(){
        if (author == "Tolstoy"){
            System.out.println("The book is boring");
        } else System.out.println("The book is not boring");
    }
}
