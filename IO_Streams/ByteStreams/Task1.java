// Task1 Read complete file using FileInputStream
// Task2 Count total bytes in file
// Print ASCII values of all characters.


package IO_Streams.ByteStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args){

        try(FileInputStream fis = new FileInputStream("Demo1.txt")){
            int data;
            int count = 0;
            // Read complete file using FileInputStream.
            System.out.println("Contents of the file:");
            while((data = fis.read())!= -1){
                System.out.print((char)data);
                
                // task2:  Count totla bytes in File
                count++;

            }

            // Task3: Print ASCII value of the Character

            while((data = fis.read()) != -1){
                System.out.println((char)data + "-> "+ data);

            }

            System.out.println("Total bytes in file: "+count);

            fis.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
