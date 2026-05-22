// Read file and print only vowels.

package IO_Streams.Character_Streams;

import java.io.FileReader;
import java.io.IOException;


public class task4 {
    public static void main(String[] args){
        String vowels = "aeiouAEIOU";
        try{
            FileReader fr = new FileReader("abc.txt");

            int data;
            while ((data = fr.read()) != -1) {
                char ch = (char) data;
                if (vowels.indexOf(ch) != -1){
                    System.out.print(ch + " ");
                }
            }
            fr.close();
        }catch(IOException e){
            System.out.println(e);
        }
    } 

}
