public class asciiSum {
    public static void main(String[] args) {
        String[] arr = { "Feluda", "Batman", "Sherlock", "Conan" };
        int index = 0;
        int largestSum = 0;

        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length(); j++) {
                sum = sum + arr[i].codePointAt(j);
            }
            if(sum > largestSum) {
                index = i;
                largestSum = sum;
            }
        }

        System.out.println("Word: " + arr[index]);
        System.out.println("Index: " + index);
        System.out.println("Sum: " + largestSum);
    }
}
