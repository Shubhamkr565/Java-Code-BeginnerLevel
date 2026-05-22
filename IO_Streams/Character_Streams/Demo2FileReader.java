package IO_Streams.Character_Streams;

import java.io.FileReader;
import java.io.IOException;

public class Demo2FileReader {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("abc.txt");

            int data;

            while((data = fr.read())  != -1){
                System.out.println((char)data);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
