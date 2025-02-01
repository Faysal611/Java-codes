public class test {
    public static void main(String[] args) {
        int count = 5;

        for(int i = 0; i < count; i++) {
            for(int j = 0; j < count - i - 1; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++) {
                int nominator = 1;
                int denominator1 = 1;
                int denominator2 = 1;

                for(int l = 1; l <= i; l++) {
                    nominator = nominator * l;
                }

                for(int m = 1; m <= k; m++) {
                    denominator1 = denominator1 * m;
                }

                for(int n = 1; n <= (i - k); n++) {
                    denominator2 = denominator2 * n;
                }

                System.out.print((nominator / (denominator1 * denominator2)) + " ");
            }
            System.out.println();
        }
	}
}

//   #
//  ###
// #####
//  ###
//   #