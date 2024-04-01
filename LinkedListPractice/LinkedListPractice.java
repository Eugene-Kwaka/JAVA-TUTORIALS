import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {

        // ******************** CREATING LINKED LIST ************************
        // creating a linkedlist of Pickle objects
        LinkedList<Pickle> list = new LinkedList<>();
        List<Pickle> list2 = new LinkedList<>();

        // ******************** ADDING ELEMENTS ************************
        // creating Pickle objects in the list
        list.add(new Pickle("onion"));
        list.add(new Pickle("sweet"));

        list2.add(new Pickle("sour"));
        list2.add(new Pickle("mild"));

        // ******************** MUTATING ELEMENTS ************************
        // In linkedlists, the insertion and removal of elements is fast
        // This is because nodes in linkedlists contain reference to the next or previous node
        // Ths allows addition of removal of elements to be done simply by changing the links between nodes.
        list.get(0);
        list2.remove(1);
        list.contains(new Pickle("onion"));
    }

class Pickle{
    String flavor;
    // Parameterized constructor
    public Pickle(String flavor){
        this.flavor = flavor;
    }
}
}
