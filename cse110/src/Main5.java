public class Main5 {
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
        
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}

//  1+1+2+3+5+8+........