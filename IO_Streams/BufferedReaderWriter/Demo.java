package IO_Streams.BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader(("Demo1.txt")));
            // int data;
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);                
            }
            br.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
