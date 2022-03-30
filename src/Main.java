//public class Main {
//    public static void main(String[] args) {
//        int countJava=0;
//        double price = 0;
//        Book[] books = new Book[10];
//        for (int i = 0; i < 5; i++) {
//            books[0] = new ProgramingBook("a", "programingBook1", "Phong", 5.0, "Java","");
//            books[1] = new ProgramingBook("a", "programingBook2", "Phong", 5.0, "Java","");
//            books[2] = new ProgramingBook("a", "programingBook3", "Phong", 5.0, "Java","");
//            books[3] = new ProgramingBook("a", "programingBook4", "Phong", 5.0, "Python","");
//            books[4] = new ProgramingBook("a", "programingBook5", "Phong", 5.0, "C","");
//
//            books[5]  = new FictionBook("a", "fictionBook1", "Phong", 10.0,"Universe");
//            books[6]  = new FictionBook("a", "fictionBook2", "Phong", 10.0,"Universe");
//            books[7]  = new FictionBook("a", "fictionBook3", "Phong", 10.0,"Universe");
//            books[8]  = new FictionBook("a", "fictionBook4", "Phong", 10.0,"Universe");
//            books[9]  = new FictionBook("a", "fictionBook5", "Phong", 10.0,"Universe");
//        }
//
//        for (Book book:books) {
//            price += book.getPrice();
//            if (book instanceof ProgramingBook){
//                if (((ProgramingBook) book).getLanguage() == "Java"){
//                    countJava++;
//                }
//            }
//        }
//
//        System.out.println("Sum price: "+price +"\n"+"Number of java books: "+countJava);
//
//    }
//}
