package IO_Streams;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException{
        try{
        FileWriter fw = new FileWriter("abc.txt", true);

        fw.write("Hello Shubham\n");
        fw.write(100);
        fw.write("\n");
        fw.write("odissa\n");
        char ch[]= {'a','b','c'};
        fw.write(ch);
        fw.write("\n");
        fw.flush();
        fw.close();

        System.out.println("Data Written");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
