public class vowel {
    public static void isVowel(String str) {
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < arr.length; j++) {
                if(str.charAt(i) == arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void consonent(String str) {
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int count = 0;
        boolean isVowel = false;
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < arr.length; j++) {
                if((str.charAt(i) == arr[j])) {
                    isVowel = true;
                }
            }
        }

        

        System.out.println(count);
    }

    public static void main(String[] args) {
        consonent("The quick brown fox jumps over the lazy dog");
    }
}
