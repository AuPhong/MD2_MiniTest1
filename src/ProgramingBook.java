public class ProgramingBook extends Book{

    private String language;
    private String frameWork;
    static int countJava=0;


    public ProgramingBook(String bookCode, String name, String author, double price, String language, String frameWork) {
        super(bookCode, name, author, price);
        this.language = language;
        this.frameWork = frameWork;
        if (this.language=="Java"){
            countJava++;
        }
       // Book.price+=this.getPrice();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }


}
