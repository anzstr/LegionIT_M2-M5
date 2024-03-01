package M5_Arrays_and_Hashes_Assignment;

import java.util.*;

public class NameList {
    public ArrayList<String> unique(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<String>();
        Collections.sort(list);
        System.out.println(list);

        for (int i = 0; i < list.size()-1; i++) {
            if (!list.get(i).equals(list.get(i + 1))) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public HashSet<String> uniqueSet(ArrayList<String> list){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.addAll(list);
        return hashSet;
    }
}
