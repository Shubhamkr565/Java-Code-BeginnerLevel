package IO_Streams.BufferedReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        // Task 1: Write Java, Python, C++ using newLine()
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Task4.txt"))) {
            bw.write("Java");
            bw.newLine();
            bw.write("Python");
            bw.newLine();
            bw.write("C++");
            bw.newLine();
        } catch (IOException e) {
            System.out.println(e);
        }

        // Task 2: Append "I love programming" without deleting old data
        try (BufferedWriter appendBw = new BufferedWriter(new FileWriter("Task4.txt", true))) {
            appendBw.write("I love programming");
            appendBw.newLine();
        } catch (IOException e) {
            System.out.println(e);
        }

        // Task 3: Write numbers 1 to 10 each on a new line
        try (BufferedWriter numBw = new BufferedWriter(new FileWriter("Task4.txt", true))) {
            for (int i = 1; i <= 10; i++) {
                numBw.write(String.valueOf(i));
                numBw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}