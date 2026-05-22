// Count total characters in file

package IO_Streams.Character_Streams;

import java.io.FileReader;
import java.io.IOException;

public class task3 {
    public static void main(String[] args) {
        int count = 0;

        try (FileReader fr = new FileReader("acb.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
                count++;
            }
            System.out.println("\nTotal Count: " + count);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
