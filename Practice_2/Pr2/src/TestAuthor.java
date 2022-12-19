public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Tolstoy", "genius@water.com", 'm');
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
        System.out.println(a.toString());
        a.setEmail("water@genius.com");
        System.out.println(a.toString());
    }
}
