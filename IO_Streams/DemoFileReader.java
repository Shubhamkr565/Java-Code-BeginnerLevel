package IO_Streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
    public static void main(String[] args){
        File f = new File("abcd.txt");
        try(FileReader fr = new FileReader(f)){
            // int i = fr.read();
            // while (i != -1){
            //     System.out.println((char) i);
            //     i = fr.read();
            // }
            // recommended way

            int i;
            while((i = fr.read()) != -1){
                System.out.println((char) i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
