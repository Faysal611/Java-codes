import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        book b1 = new book("Java Programming", "Faysal", 10, 400);
        book b2 = new book("C++ Programming", "John", 5, 300);
        book b3 = new book("Python Programming", "Walter", 15, 500);

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();

        System.out.println("Enter the title of the book you want to buy: ");
        String title = scan.nextLine();
        System.out.println("How many copies do you want?");
        int num = scan.nextInt();

        if(b1.title.toLowerCase() == title.toLowerCase()) {
            b1.calculateCost(num);
        }
        else if(b2.title.toLowerCase() == title.toLowerCase()) {
            b2.calculateCost(num);
        }
        else {
            b3.calculateCost(num);
        }
    }
}
