public class email {
    public static void main(String[] args) {
        String[] arr = {"abc@gmail.com", "!@cv.bd",  "123cse@bracu.ac.bd"};
        int num = 0;
        int index = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            boolean isEmail = true;
            for(int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) == '@') {
                    count++;
                    index = j;
                }
            }
            if(count == 0) {
                isEmail = false;
            }
            for(int j = 0; j < arr[i].length(); j++) {
                if(!(index != 0 && (arr[i].charAt(index + 1) >= 'a' && arr[i].charAt(index + 1) <= 'z' || arr[i].charAt(index + 1) >= 'A' && arr[i].charAt(index + 1) <= 'Z') && (arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <= 'z' || arr[i].charAt(0) >= 'A' && arr[i].charAt(0) >= 'Z'))) {
                    isEmail = false;
                }
            }
            
        }
    }
}
