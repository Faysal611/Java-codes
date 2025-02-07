public class book {
    public String title;
    private String author;
    private int copies;
    private int cost;

    public book(String title, String author, int copies, int cost) {
        this.title = title;
        this.author = author;
        this.copies = copies;
        this.cost = cost;
    }

    public void displayInfo() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Available copies: " + copies);
        System.out.println("Cost: " + cost);
        System.out.println("");
    }

    public void calculateCost(int num) {
        if(copies >= num) {
            System.out.println("Total cost: " + (cost * num) + " BDT");
            copies -= num;
        }
        else {
            System.out.println("Requested amount of copies is not available.");
        }
    }
}
