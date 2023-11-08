import java.util.Arrays;

public class Stack {
    private int lastItem = 0;

    // New array with 0 items
    private int[] items = new int[0];

    // Adds a new element to the array
    public void push(int newItem){
        int index = items.length;
        System.out.println("The array length is: " + index);

        // Increase the items array length by 1
        items = new int[items.length + 1];
        System.out.println("items after extending the length by 1: " + Arrays.toString(items));

        //store the value in the index
        items[index] = newItem;
        System.out.println("items after storing the new value: "+ Arrays.toString(items));

        //update lastItem
        lastItem = newItem;
        System.out.println("The last item: " + lastItem);
    }

    // removes the recently added element in the array
    public int pop(){
        int tempItem = lastItem; //store the last item into a variable

        //copy a new array but remove last item
        int[] newArray = new int[items.length-1];

        //This loop is used to copy the items from the items array to newArray.
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = items[i];
        }

        items = newArray; //update the items array
        lastItem = items[items.length-1]; //update lastItem

        //return our ‘popped' element
        return tempItem;
    }

    public int peek(){
        return 0;
    }
}
