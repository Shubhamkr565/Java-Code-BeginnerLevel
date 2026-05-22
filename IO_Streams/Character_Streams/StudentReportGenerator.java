// Create a java program that writes student details into a file

// Requirements
// Write the following data into student.txt

// ======= Student Report ======
// Name: Shubham Gupta
// Course : MCA
// College : LPU
// Skills : Java, Python, DSA

// Thank you

// Rule:
// use: FileWriter, append mode, try-catch add peoper new line using \n




package IO_Streams.Character_Streams;

import java.io.FileWriter;
import java.io.IOException;

public class StudentReportGenerator {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("student.txt", true);
            fw.write("===== Student Report =====");
            fw.write("\nName: Shubham Gupta");
            fw.write("\nCourse: MCA");
            fw.write("\nCollege : LPU");
            fw.write("\nSkills: Java, Python, DSA");

            fw.write("\nThank You");
            fw.flush();
            fw.close();
        }catch (IOException e){
            System.out.println(e);
        }

        try{
            FileWriter fw = new FileWriter("student.txt", true);
            fw.write("\n\n\n===== Student Report =====");
            fw.write("\nName: Sameer Gupta");
            fw.write("\nCourse: MCA");
            fw.write("\nCollege : LPU");
            fw.write("\nSkills: Java, Python, DSA");

            fw.write("\nThank You");
            fw.flush();
            fw.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
