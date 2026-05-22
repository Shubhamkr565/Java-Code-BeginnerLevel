What are Character Streams?

Charcater Streams are used to handle text data in Java
they work with 
> Characters
> strings
> text files

Character Streams use Unicode (16-bits) characters.


Main Character Stream Classes

    Class                                   Purpose
FileReader                          Read characters from file
FileWriter                          Write characters into file
BufferedReader                      Fast reading
BufferedWriter                      Fast writing





First Topic => FileWriter

What is FileWriter?
> FileWriter is used to write text data into a file.

Basic Systax
Filewriter fw = new FileWriter("abc.txt");

meaning:        Create/Opne file abc.txt        Write text into it




First Program


package IO_Streams.Character_Streams;

import java.io.FileWriter;
import java.io.IOException;


public class first {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("abc.txt");
            fw.write("Hello Shubham");
            fw.close();

            System.out.println("Data Written Successfully");
        }catch (IOException e){
            System.out.println(e);
        }
    }
    
}




Step-by-step Explanation

FileWriter fw = new FileWriter("abc.txt)
This is creates file connection.

If file does not exist: Java create it
if already exists: Old data gets overwritten


fw.write("Hello Shubham")
Writes text into file.


fw.close():
very important
closes stream and saves data properly.

Without close(), data may not save correctly

<!-- Output -->
Hello Shubham  (Inside abc.txt)


<!-- Real-life Analogy -->

imagine:
> File = notebook
> FileWriter = pen
> write() = writing text
> close() = closing notebook



Append Mode

If you want to keep old data and add new data so we used Append Mode.

FileWriter fw = new FileWriter("abc.txt", true);

true means : append mode ON




Modern Recommended Way
Java automatically closes file so no need to write fw.close();


Important Notes:

    Point                       Meaning

FileWriter                  Writes text
Character Stream            Works with text
close()                     Closes file
true                        Append mode
Overwrite                   Default behavior





FileReader



What is FileReader?
FileReader is used to read text data from a file.

it reads:
    Characters, words, lines, text files

Simple Definition
    FileReader is a character stream class used to read data from a text file.

Real life examples
Imagine:
        file= book
        FileReader = your eyes
        Reading Characters = reading letters one by one

Basic Syntax
        FileReader fr = new FileReader("abc.txt")

        Open file abc.txt, Read data from it.





