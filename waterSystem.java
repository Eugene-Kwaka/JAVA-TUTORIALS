import java.util.Scanner;

public class waterSystem {
    public static void main(String[] args){
        // int precipitation = 0;
        // int temperature = 80;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the precipitation today? ");
        // Changing the input from String to an integer
        // int precipitation = Integer.parseInt(input.nextLine());
        int precipitation = input.nextInt(); 

        System.out.println("What is the temperature today? ");
        //int temperature = Integer.parseInt(input.nextLine());
        int temperature = input.nextInt();

        int waterOutput = 0;

        if (precipitation < 20){
            if (temperature <= 75){
                waterOutput = 30;
                System.out.println("The water output is " + waterOutput);
            }else{
                waterOutput = 45;
                System.out.println("The water output is " + waterOutput);
            }
        } else if(precipitation <31){
            if (temperature <= 75){
                waterOutput = 10;
                System.out.println("The water output is " + waterOutput);
            }else{
                waterOutput = 25;
                System.out.println("The water output is " + waterOutput);
            }
        } else if(precipitation <56){
            if (temperature <= 75){
                waterOutput = 0;
                System.out.println("The water output is " + waterOutput);
            }else{
                waterOutput = 15;
                System.out.println("The water output is " + waterOutput);
            }
        } else{
            if (temperature <= 75){
                waterOutput = 0;
                System.out.println("The water output is " + waterOutput);
            }else{
                waterOutput = 0;
                System.out.println("The water output is " + waterOutput);
            }
        }

        input.close();
    }
}
