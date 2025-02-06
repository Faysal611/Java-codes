public class Library {
    public Book[] collection;
    public Library(int x) {
        this.collection = new Book[x];
    }
    int count = 0;

    public void addBook(Book b) {
        collection[count] = b;
        count++;
    }

    public void details(int x) {
        System.out.println("Title: " + collection[x].title + " --- Author: " + collection[x].author);
    }

    public void rmBook(int n) {
        collection[n] = null;
    }
}
