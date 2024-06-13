package Data_Structures;

import java.util.HashMap;

// Maps are ideally key value pairs, Map is interface, hash is a type of the map interface
public class hash_map {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Noel", 12345); // New entries
        empIds.put("John", 54321);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl")); // Find the value with the given key

        System.out.println(empIds.containsKey("Jerry")); // Bool to check if the key exists

        System.out.println(empIds.containsValue(12345)); // Bool to check if the value exists

        empIds.replace("Noel", 23456); 

        empIds.putIfAbsent("John", 222); // creates the entry if it does not exists

        empIds.remove("John"); // Removes 
    }
}
