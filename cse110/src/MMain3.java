public class MMain3 {
    public static void print(int num) {
        increase(num, 1);
        decrease(num - 1);
    }

    public static void increase(int num, int start) {
        if(start > num) {
            return;
        }
        System.out.print(start);
        increase(num, start + 1);
    }

    public static void decrease(int num) {
        if(num == 0) {
            return;
        }
        System.out.print(num);
        decrease(num - 1);
    }

    public static void dot(int num) {
        if(num == 0) {
            return;
        }
        System.out.print(".");
        dot(num - 1);
    }

    public static void diamond(int num) {
        for(int i = 0; i < num; i++) {
            dot(num - 1 - i);
            print(i + 1);
            dot(num - 1 - i);
            System.out.println("");
        }
        for(int i = num - 1; i > 0; i--) {
            dot(num - i);
            print(i);
            dot(num - i);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int start = 1;
        int num = 8;
        diamond(num);
    }
}
