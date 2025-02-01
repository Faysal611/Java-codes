public class Main1 {
    public static String reverse(String str, int length) {
        if(length < 0) {
            return "";
        }
        else {
            return str.charAt(length) + reverse(str, length - 1);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        int length = str.length() - 1;
        System.out.println(reverse(str, length));
    }
}
