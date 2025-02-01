import java.util.Scanner;

public class Main2 {
    public static void showDots(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(".");
        }
    }

    public static void show_palindrome(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        for(int i = n - 1; i > 0; i--) {
            System.out.print(i);
        }
    }

    public static void showDiamond(int n) {
        for(int i = 1; i <= n; i++) {
            showDots(n - i);
            show_palindrome(i);
            showDots(n- i);
            System.out.println();
        }
        for(int i = 1; i < n; i++) {
            showDots(i);
            show_palindrome(n - i);
            showDots(i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        showDiamond(num);
    }
}