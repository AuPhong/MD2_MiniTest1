public class FictionBook extends Book{
    private String category;

    public FictionBook(String bookCode, String name, String author, double price, String category) {
        super(bookCode, name, author, price);
        this.category = category;
       // Book.price+=price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
