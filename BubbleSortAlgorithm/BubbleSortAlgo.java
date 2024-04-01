public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] unsortedArr = {5, 3, 4, 7, 1};
        int[] sortedArr = sort(unsortedArr);
        // I loop throught the sorted array and print each element
        for(int el : sortedArr){
            System.out.print(el + " "); // -> 1 3 4 5 7;
        }
    }

    // create a method that takes in an array parameter, sorts it and returns a sorted array
    public static int[] sort(int[] arr){
        // Outer loop that ensures each element in the arr is sorted
        for (int x = 0; x < arr.length; x++){
            // Loop starting at [1] because I will be comparing the first index [0] to the second index [1]
            // by subtraction, then swap if one is bigger than the other. 
            // Then I compare [1] with index [2] as I loop through the array to avoid the IndexOutOfBoundsException
            // This loop is responsible for comparing adjacent elements
            for (int i = 1; i < arr.length; i++){
                // If first index is greater than [1], I will swap the elements
                if (arr[i-1] > arr[i]){
                    // create a temp variable to store one of them.
                    // temp stores the previous index [i-1] because I am supposed to swap it
                    // as it is bigger than arr[i]
                    int temp = arr[i-1];
                    // Then I replace the indexes with each other.
                    // I assign the value of arr[i] to the position of previous element arr[i-1]
                    arr[i-1] = arr[i];
                    // use the temp to complete the swap by assigning the original value of arr[i-1] to arr[i]
                    arr[i] = temp;
                }
            }
        }
        
        return arr;
    }
}