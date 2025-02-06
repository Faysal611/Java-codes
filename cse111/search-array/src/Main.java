import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements:");
        int size = scan.nextInt();
        System.out.println("Enter " + size + " Elements:");
        Array arr = new Array(size);

        System.out.println("Array Elements Are:");
        arr.getArr();
        System.out.print("Enter Element To Search For: ");
        int num = scan.nextInt();

        arr.find(num);
    }
}
