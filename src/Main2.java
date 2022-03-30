public class Main2 {
    public static void main(String[] args) {
        Book book1 = new ProgramingBook("a", "a", "a", 10.1, "Java", "");
        Book book2 = new ProgramingBook("a", "a", "a", 10.1, "Java", "");
        Book book3 = new FictionBook("a", "a", "a", 12.1, "");
        System.out.println(ProgramingBook.countJava);

        System.out.println(Book.totalPrice);
    }


}
