public class Book {

        private String bookCode;
        private String name;
        static  double totalPrice;
        private String author;
        private double price;



    public Book(String bookCode, String name, String author, Double price) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        totalPrice +=price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  double getPrice() {
        return price;
    }

    public  void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


