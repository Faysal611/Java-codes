public class Tester {
    public static void main(String[] args) {
        Book b1 = new Book("Times new roman", "Faysal");
        Book b2 = new Book("The cradle", "Sami");
        Book b3 = new Book("Monopoly", "juice");
        Book b4 = new Book("open sans", "Sarah");
        Book b5 = new Book("Barren Land", "Cave");

        Library c1 = new Library(5);
        c1.addBook(b1);
        c1.addBook(b2);
        c1.addBook(b3);
        c1.addBook(b4);
        c1.addBook(b5);

        c1.details(2); 
    }
}