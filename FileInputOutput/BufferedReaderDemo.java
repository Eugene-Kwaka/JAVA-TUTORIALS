
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        
        // The input code is placed in a try-catch block to check IOExceptions which are checked exceptions
        try{
            // FileReader is an instance of the Reader class.
            // We create a FileReader object called fileReader that takes the text file's location as its argument.
            FileReader fileReader = new FileReader("C:/Users/Eugene Kwaka/Desktop/JAVA/JAVA-TUTORIALS/file.txt");
            
            // I create a BufferedReader object called bf that takes the fileReader object as its argument. 
            // The fileReader object contains the text file to be read
            BufferedReader bf = new BufferedReader(fileReader);

            // The readLine() method is provided by BufferedReader instance and is used to read the lines in the text file.
            // I'm saving the text contents as Strings in a word variable.
            String words = bf.readLine();

            System.out.println(words);

            // It is important to always close the BufferedReader instance to prevent resource leaks.
            bf.close();
        
        }
            // Catch block to catch any IOException which is a Checked Exception
            catch (IOException e){
                e.printStackTrace();
            }

        
    }
}
