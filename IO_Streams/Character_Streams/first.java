package IO_Streams.Character_Streams;

import java.io.FileWriter;
import java.io.IOException;


public class first {
    public static void main(String[] args){
        try{
            // FileWriter fw = new FileWriter("abc.txt");
            // Using append Mode to keep old data and add new data
            FileWriter fw = new FileWriter("abc.txt", true);
            fw.write("\nWelcome");
            // fw.close();
            //  In Modern Recommended Way java automatically closes file.
            System.out.println("Data Written Successfully");
        }catch (IOException e){
            System.out.println(e);
        }
    }
    
}
