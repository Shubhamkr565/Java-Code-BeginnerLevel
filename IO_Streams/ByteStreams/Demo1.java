package IO_Streams.ByteStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args){

        try{
            FileInputStream fis = new FileInputStream("Demo1.txt");
            
            // int data = fis.read();
            // System.out.println(data);
            
            
            //  Convert to Character 
            // int data = fis.read();
            // System.out.println((char)data);

            // Read Complete file
            int data;

            while((data = fis.read()) != -1){
                System.out.print((char)data);
            }


            fis.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
