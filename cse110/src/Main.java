public class Main {
    public static boolean pal(String str, int index) {
        if(index == str.length() / 2) {
            return true;
        }
        if(str.charAt(index) == str.charAt(str.length() - 1 - index)) {
            return pal(str, index + 1);
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "abccba";
        int index = 0;
        System.out.println(pal(str, index));
    }
}