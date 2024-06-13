package Data_Structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Set is a way to group liked objects to handle as one unit
// Sets are ideally used to iterate through a list to remove duplicates
// Hash are ideally quickest way to store elements because the time is constant regardless of how big the set gets

public class hash_set {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(); // Set is an interface and hashset is a class that is used to initiate new.

        // Note that a list (array) maintains the order of how the data was entered, hashset has no order and do not allow duplicates
        names.add("Noel");
        names.add("Jesse");
        names.add("John");
        
        names.remove("Jesse");
        // List lets you remove an item with the index, hashset you cannot because it does not exist

        names.clear(); // clears the whole set

        // Prints out all names
        for ( String name : names) {
            System.out.println(name); 
        }

        // Print all the names
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next()); 
        }
        
        System.out.println(names.size()); // prints the amount of items in the list
        System.out.println(names.contains("Noel")); // bool to check if it exists
        System.out.println(names.isEmpty()); // bool if set is empty
    }
    
    // Example on how to convert list to a set to remove duplicates
    public static void listToSet(String[] args){
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(2);
        numberList.add(1);

        Set<Integer> numberSet = new HashSet<>(); // The ideal set is hash for speed
        // Set<Integer> numberSet = new TreeSet<>(); // Treeset organizes by order but is slower
        // Set<Integer> numberSet = new LinkedHashSet<>(); // Keeps the order of how the items are added which is faster than treeset

        numberSet.addAll((numberList)); // Takes collection and adds to another collection

        System.out.println(numberSet); // Set will print with all duplicates removed

    }
}
