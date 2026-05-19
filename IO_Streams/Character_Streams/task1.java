package IO_Streams.Character_Streams;

import java.io.FileWriter;
import java.io.IOException;

public class task1 {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("abc.txt", true);
            fw.write("Shubham");
            fw.write("\njava");
            fw.write("\njava");
            fw.write("\nC++");

            fw.write("\nI am learning IO Streams");
            fw.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
