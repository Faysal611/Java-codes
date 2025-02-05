public class book {
    private String title;
    private String author;
    private boolean available = true;

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void borrow() {
        if(available == true) {
            System.out.println("You borrowed " + title + ", by " + author);
            available = false;
        }
        else {
            System.out.println("Not available.");
        }
    }

    public void returnBook() {
        if(available == false) {
            System.out.println("You returned the book " + title + ", by " + author);
            available = true;
        }
        else {
            System.out.println("BUT YOU NEVER TOOK IT IN THE FIRST PLACE");
        }
    }
}
