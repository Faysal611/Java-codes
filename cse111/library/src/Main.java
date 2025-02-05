public class Main {
    public static void main(String[] args) throws Exception {
        book b1 = new book("ABC", "SOME IDIOT");
        book b2 = new book("XYZ", "ANOTHER IDIOT");

        b1.borrow();
        b1.borrow();
        b1.returnBook();
        b1.returnBook();
    }
}
