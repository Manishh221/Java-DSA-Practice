package dataStructureImpl.HashMapImpl;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {

    public static void main(String[] args) {
//Syntax
        Map<String, Integer> map = new HashMap<>();

//Adding Elements
        map.put("Manish", 26);   // entry that contains key and value
        map.put("Umer", 21);

//Getting value of a key from the HashMap
        System.out.println(map.get("Manish"));  // 26
        System.out.println(map.get("Anil")); // null because Rahul does not exist

//Changing/Updating value of a key in the HashMap014+-
        map.put("Manish", 25);      // put is used to update or insert the data;
        System.out.println(map.get("Manish"));

//Removing a pair from the HashMap
        map.remove("Manish"); // pass the key to delete the pair of the value if it is pressent else return null:
        System.out.println(map.get("Manish"));

//Checking if a key is in the HashMap
        System.out.println(map.containsKey("Manish")); // return false
        System.out.println(map.containsValue("Umer")); // return true

// Adding a new entry only if the new key doesn't exist already
        map.putIfAbsent("Manish", 29); // if key already exist then will not insert else will insert

//Get all keys in the Hashmap
        System.out.println(map.keySet()); // returns all the keys that are present in the hash map

//Get all values in the Hashmap
        System.out.println(map.values()); // returns all the values

//Get all entries in the Hashmap
        System.out.println(map.entrySet()); // returns all the keys and values pairs that are present in the map;

//Traversing all entries of Hashmap multiple methods
        for(String key : map.keySet()) {
            System.out.println("age of " + key + " is "+ map.get(key));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
