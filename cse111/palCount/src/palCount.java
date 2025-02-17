public class palCount {
    public static boolean pal(String str, int n) { //abccba
        if((str.length() / 2) == n) {
            return true;
        }

        if(str.charAt(n) == str.charAt(str.length() - 1 - n)) {
            return pal(str, n + 1);
        }

        return false;
    }

    public static void main(String[] args) {
        String[] arr = { "mom", "1aa1", "tree", "kayak" };
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(pal(arr[i], 0)) {
                count++;
            }
        }
        System.out.println("Palindrome count: " + count);
    }
}