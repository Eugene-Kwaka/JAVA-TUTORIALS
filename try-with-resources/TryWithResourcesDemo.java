import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("C:/Users/Eugene Kwaka/Desktop/JAVA/JAVA-TUTORIALS/file3.txt"))){
            String text = br.readLine();
            System.out.println(text);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
