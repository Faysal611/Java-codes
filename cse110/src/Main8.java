class Main8 {
    public static void main(String args[]) {
        int num = 7;
        int temp = 0;
        for(int i = 0; i < num / 2 + 1; i++) {
            for(int j = 0; j < num / 2 - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < num / 2; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < num - 2 - temp; k++) {
                System.out.print("*");
            }
            System.out.println();
            temp += 2;
        }
    }
}

//  *
// ***
//  *

//  *
// ***
//*****
// ***
//  *