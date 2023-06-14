import java.util.Arrays;

public class arrays{
    public static void main(String[] args){
        // To create an array
        char vowels[] = {'e', 'a', 'u', 'o', 'i'};
        System.out.println(Arrays.toString(vowels));

        // To Sort arrays
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

        // Binary search in Java.
        // The arrays needs to be sorted first
        Arrays.sort(vowels);
        char key = 'a';
        // looking for the key's index position
        int indexPosition = Arrays.binarySearch(vowels, key);
        System.out.println(Arrays.toString(vowels)); // -> prints the whole array
        System.out.println(indexPosition); // -> prints the key's index position

        // copyOf method
        int nums[] = new int[4];
        nums[0] = 15;
        nums[1] = 25;  
        nums[2] = 35;
        nums[3] = 45;
        System.out.println(Arrays.toString(nums));
        int copyOfNums[] = Arrays.copyOf(nums, nums.length);
        System.out.println(Arrays.toString(copyOfNums));
        // When I compare the two num arrays
        System.out.println(nums.equals(copyOfNums)); // false. 
        System.out.println(nums == copyOfNums); // false
        // Another way of comparing the numbers is
        System.out.println(Arrays.equals(nums, copyOfNums)); // True




    }
}