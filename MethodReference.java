import java.util.Arrays;
import java.util.List;



public class MethodReference {
    public static void main(String[] args) {
        List <String> msg = Arrays.asList("One", "Two", "Three");
        msg.forEach(t -> System.out.println(t));

    }
}
