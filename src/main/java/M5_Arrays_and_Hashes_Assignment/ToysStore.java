package M5_Arrays_and_Hashes_Assignment;

import java.util.*;

import java.util.HashMap;

public class ToysStore {
    public String getToyById(int id) {
        HashMap<Integer, String> toyStore = new HashMap<Integer, String>();

        toyStore.put(12, "Batmobile");
        toyStore.put(45, "Light Saber");
        toyStore.put(6, "Wonder Woman Bag");
        toyStore.put(201, "Hello Kitty");
        toyStore.put(56, "Junior QA Analyst Doll");

        if (!toyStore.containsKey(id)){
            return "No such Toy";
        }
        return toyStore.get(id);
    }
}
