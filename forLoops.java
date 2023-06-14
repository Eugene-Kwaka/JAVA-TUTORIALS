public class forLoops {
    public static void main(String[] args){
        // for(int number = 1; number <= 10; number++){
        //     System.out.println(number);
        // }
        // // Looping over an array
        // int nums[] = {1,2,3,4,5,6};
        // for (int num = 0; num < nums.length; num++){
        //     System.out.println(nums[num]);
        // }

        // // Finding the sum of items in an array
        // int sum = 0;
        // for(int item = 0; item < nums.length; item++){
        //     sum += nums[item];
        // }
        // System.out.println(sum);

        // // Create a multiplication table
        // int multiplier = 5;
        // for(int num = 1; num < nums.length; num++){
        //     System.out.printf("%d X %d = %d \n", nums[num], multiplier, nums[num] * multiplier);
        // }

        // Using a conditional statement inside a For loop
        // To check for odd numbers 
        for(int num = 1; num <=10; num++){
            if (num % 2 == 1){
                System.out.println(num);
            }
        }
    }
}
