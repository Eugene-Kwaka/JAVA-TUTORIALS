import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String text = "I will study Java until I find a full-time job";
        
        try{
            FileWriter fw = new FileWriter("C:/Users/Eugene Kwaka/Desktop/JAVA/JAVA-TUTORIALS/file3.txt");
            fw.write(text);
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        

    }
}
