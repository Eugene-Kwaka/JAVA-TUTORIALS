import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {

        String text = "I want to be a Java Developer";
        
        try{
            // FileWriter instance (fileWriter) takes the text file to be written into as its argument.
            // Create a BufferedWriter instance that takes the fileWriter instance as its argument 
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Eugene Kwaka/Desktop/JAVA/JAVA-TUTORIALS/file2.txt"));

            //Use the write() method by the writer object to write whatever I want in the text file.
            writer.write(text);
            // add an '\n' to write a new line of text in the file.
            writer.write("\nI will become so good at it people will say I'm an expert.");

            //##############################################################################################
            
            // Let's say I'm not harcoding what I want to write to the file, rather using input from other sources like arrays, lists e.t.c
            String[] names = {"Eugene", "Kwaka", "Kirima"};
            
            // use a loop to write each individual name in the file on a new line
            for (String name: names){
                writer.write("\n" + name);
            }

            
            // Close the writer object to prevent resource leaks. 
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        
    }
}
