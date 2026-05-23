// Task2 : Count total lines in file and also print only lines containig (java)

package IO_Streams.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args){
        try{
            BufferedReader bf = new BufferedReader(new FileReader("Demo1.txt"));

            int count = 0;
            String line;

            while((line = bf.readLine()) != null){
                count++;
                if(line.contains("Java")){
                    System.out.println(line);
                }
            }
            System.out.println("Total number of Lines: "+ count);
           
            bf.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    
}
