import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) throws IOException {
        FileReader read = new FileReader("E:\\Coding files\\Main\\src\\file.txt");
        BufferedReader reader = new BufferedReader(read);
        int size = 0;
        String str = reader.readLine();

        while (str != null) {
            str = reader.readLine();
            size++;
        }
        int[] arr = new int[size];
        reader.close();
        FileReader newRead = new FileReader("E:\\Coding files\\Main\\src\\file.txt");
        BufferedReader newReader = new BufferedReader(newRead);

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(newReader.readLine());
        }
        newReader.close();
        FileWriter write = new FileWriter("E:\\Coding files\\Main\\src\\file.txt");
        BufferedWriter writer = new BufferedWriter(write);

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            writer.write(arr[i] + "\n");
        }
        writer.close();
    }
}