import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class TryWithMultipleResourcesDemo {
    public static void main(String[] args) {

        String text = "I have a meeting with a mentor tomorrow";
        
        try(FileWriter fw = new FileWriter("output.txt"); BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(text);
        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
