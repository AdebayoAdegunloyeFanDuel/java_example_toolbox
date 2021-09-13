package basics.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {

    /*
         When using a Hashtable or HashMap, we specify an object that is used as a key and the value
         that you want to be linked to that key.

         There are many implementations of the Map interface and we will simply focused on the most commonly used
         which is a HashMap
     */

    // When creating a HashMap we need to identify what data types we want to implement as our key and value
    // Strings and numbers are most common as Keys and values can be anything.

    Map<String, String> hashMapImplementation = new HashMap<>();

    public void weMustAddAKeyAndAValue(String key, String value){
        hashMapImplementation.put(key, value);
    }

    // As of Java 9 and above you can initialise a Map in a literal way as below

    Map<Integer, String> hashMapLiteral = new HashMap<>(Map.ofEntries(
            Map.entry(1, "somedata1"),
            Map.entry(2, "somedata2")
    ));

    public static void main(String[] args) {
        MapsExamples mapsExamples = new MapsExamples();

        mapsExamples.weMustAddAKeyAndAValue("newKey1", "value string 1");
        mapsExamples.hashMapImplementation.containsKey("newKey1");

        System.out.println(mapsExamples.hashMapImplementation.entrySet());

        System.out.println(mapsExamples.hashMapLiteral.entrySet());
    }

}
