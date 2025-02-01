import java.util.Scanner;

public class modifyStr {
	public static void modifyStrings(String s, String s1, String s2) {
		String newStr = "";
		int index = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == s1.charAt(index)) {
				for(int j = i; j < i + s1.length(); j++) {   
					if(s.charAt(j) == s1.charAt(index)) {
						index++;
						if(index == s1.length()) {
							newStr = newStr + s2;
							i = i + s1.length() - 1;
							index = 0;
							break;
						}
					}
					else {
						newStr = newStr + s.charAt(i);
						break;
					}
				}
			}
			else {
				newStr = newStr + s.charAt(i);
			}
		}
		System.out.println(newStr);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		modifyStrings(s, s1, s2);
	}
}