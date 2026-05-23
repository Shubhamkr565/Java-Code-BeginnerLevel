package IO_Streams.BufferedReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Demo2 {
    public static void main(String[] args){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Demo2.txt", true));
            // bw.write("Hello Shubham");
            bw.write("Java");
            bw.newLine();

            bw.write("C++");

            bw.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
