public class Main6 {
    public static int power(int base, int power) {
        if(power == 0) {
            return 1;
        }

        else {
            return base * power(base, power - 1);
        }
    }
    public static void main(String[] aargs) {
        int base = 5;
        int power = 2;
        System.out.println(power(base, power));
    }
}
