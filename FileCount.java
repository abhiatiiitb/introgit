import java.util.Scanner;
import java.io.*;

public class FileCount {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/abhishekchaudhary/Downloads/data.txt");
        Scanner input = new Scanner(file);

        int count = 0;
        while (input.hasNext()) {
            String word  = input.next();
            System.out.println(word +"/");
            if(word.equalsIgnoreCase("Bangalore"))
            count = count + 1;
        }
        System.out.println("Word count: " + count);
    }
}