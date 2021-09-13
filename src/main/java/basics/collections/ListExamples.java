package basics.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    /*
    There are two general purpose lists that implement the 'List' interface.

    They are ArrayList (which is most commonly use) and a LinkedList.

    The core difference are that if you're simply storing and accessing data -> use an ArrayList.
    If you need to manipulate data in that list a linkedList would be better due to the different implementation of the
    queue and dequeue interfaces allowing faster and more flexability in how you amend data.
     */

    // ***ArrayList***
    // create an ArrayList
    // the below is a hard implementation of an ArrayList -> remember we need to apply the data object we intend to
    // store, in this case a String
    ArrayList<String> stringArrayList = new ArrayList<>();
    // The following initialisation uses the type of 'List<>'
    List<String> stringListUsingAnArrayList = new ArrayList<>();

    /*
    Why use the List<> interface and not the ArrayList??? It's down to preference to some degree but creating a
    variable as it's interface type will give you more options if you wish to change it to a LinkedList<> later.
     */

    // We can add to our ArrayList as below
    public void addToArrayList(String stringItem){
        stringArrayList.add(stringItem);
    }

    // We can also initialise a List as below
    public List<String> thisIsAnInitialisedArrayList = new ArrayList<>(List.of("multiple", "Elements"));

    // LinkedList
    // As mentioned, LinkedLists implement the List interface as well and are predominantly used for lists that will
    // change on a regular basis

    public List<Integer> aLinkedList = new LinkedList<>();

    public void addToOurLinkedList(Integer anyNum){
        aLinkedList.add(anyNum);
    }

    // LinkedLists can be initialised in the same way as an ArrayList

    public static void main(String[] args) {
        ListExamples listExamples = new ListExamples();
        System.out.println(listExamples.thisIsAnInitialisedArrayList.toString());

        listExamples.addToOurLinkedList(1);
        listExamples.addToOurLinkedList(2);
        listExamples.addToOurLinkedList(3);
        System.out.println(listExamples.aLinkedList.toString());
    }



}
