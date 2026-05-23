package IO_Streams.BufferedReader;

import java.io.FileWriter;
import java.io.IOException;


public class fileWrite {
    public static void main(String[] args){

        try{
            FileWriter fw = new FileWriter("Demo1.txt", true);

            fw.write("\nHello Shubham\n");
            fw.write("\nWelcome to Java\n");
            fw.write("\nBufferReader\n");

            fw.flush();
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
