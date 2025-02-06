import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 number");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        Finder find = new Finder(n1, n2, n3);

        int largest = find.largest();
        int secLargest = find.secLargest();

        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest Number: " + secLargest);
    }
}
