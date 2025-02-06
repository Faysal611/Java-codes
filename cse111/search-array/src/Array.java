import java.util.Scanner;

public class Array {
    Scanner scan = new Scanner(System.in);
    private int[] arr;

    public Array(int n) {
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
    }

    public void getArr() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void find(int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                System.out.println("Number " + num + " is in the array");
                return;
            }
        }
        System.out.println("Number " + num + " isn't in the array");
    }
}
