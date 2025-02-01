public class happy {
    public static boolean isHappyNum(int num) {
        int newNum = 0;
        if(num == 4) {
            return false;
        }
        if(num == 1) {
            return true;
        }
        while(num != 0) {
            newNum = newNum + (num % 10) * (num % 10);
            num /= 10;
        }
        return isHappyNum(newNum);
    }
    public static void main(String[] args) {
        boolean temp = isHappyNum(4);
        System.out.println(temp);
    }
}
