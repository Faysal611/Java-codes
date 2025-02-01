public class Main4 {
    public static int sumOfDigit(int num) {
        if(num >= 0 && num < 10) {
            return num;
        }
        else {
            return (num % 10) + sumOfDigit(num / 10);
        }
    }
    public static void main(String[] args) {
        int num = 123;
        System.out.println(sumOfDigit(num));
    }
}
