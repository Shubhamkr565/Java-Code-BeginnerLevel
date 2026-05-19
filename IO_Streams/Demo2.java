package IO_Streams;

import java.io.FileWriter;
import java.io.IOException;
public class Demo2 {

    public static void main(String[] args) throws IOException{
        try(FileWriter fw = new FileWriter("xyz.txt", true)){;

        fw.write(100); // d will be added
        fw.write("rames\nWelcome");
        fw.write("\n");
        fw.write("Odissa");
        char ch[] = {'a','b','c',};
        fw.write(ch);
        fw.flush();
        fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
