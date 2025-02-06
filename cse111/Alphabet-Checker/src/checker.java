public class checker {
    public static void check(char c) {
        char cLower = Character.toLowerCase(c);

        if(cLower == 'a' || cLower == 'e' || cLower == 'i' || cLower == 'o' || cLower == 'u') {
            System.out.println(c + " is a vowel");
        }
        else if(cLower >= 'a' && cLower <= 'z') {
            System.out.println(c + " is an consonent");
        }
        else {
            System.out.println(c + " is not an alphabet");
        }
    }
}
