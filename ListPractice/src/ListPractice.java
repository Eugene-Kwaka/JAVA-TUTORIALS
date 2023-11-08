import java.util.*;

public class ListPractice {
    public static void main(String[] args){
        
        ListPractice list = new ListPractice();
        list.practiceList();
    }

    public void practiceList(){
        // 1. This is a String arrayList
        List<String> sonicChar = new ArrayList<>();

        // 2. 2nd way to create a list
        ArrayList<Integer> nums = new ArrayList<>();

        // Adding elements to a String list
        sonicChar.add("Sonic");
        sonicChar.add("Hedgehog");
        sonicChar.add("Knuckles");
        sonicChar.add("Doctor Eggman");
       // System.out.println(sonicChar);
        
        // add new element to a List at an index
        nums.add(0, 4);
        nums.add(1, 3);
        nums.add(2, 2);
        nums.add(3, 1);
        System.out.println(nums);
        Collections.sort(nums);

        // Looping through an ArrayList
        for(int index = 0; index < nums.size(); index++){
            System.out.println(nums.get(index));
        }
        // printlist using an ForEach loop
        for(String characters:sonicChar){
            System.out.println(characters);
        }

        for(Integer num:nums){
            System.out.println(num);
        }
    }
}
