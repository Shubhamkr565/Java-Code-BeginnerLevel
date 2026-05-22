package IO_Streams.Character_Streams;


import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("abc.txt");
            int data = fr.read();
            System.out.println("Output data: "+data);
            System.out.println((char)data);
            fr.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}


// Output come only in Ascii value of one character at a time

