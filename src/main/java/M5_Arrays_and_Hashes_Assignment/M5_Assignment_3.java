package M5_Arrays_and_Hashes_Assignment;

import java.util.ArrayList;

public class M5_Assignment_3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Steve");
        arrayList.add("Tim");
        arrayList.add("Lucy");
        arrayList.add("Steve");
        arrayList.add("Pat");
        arrayList.add("Angela");
        arrayList.add("Tom");
        arrayList.add("Tim");
        arrayList.add("Anna");
        arrayList.add("Lucy");
        arrayList.add("Michael");
        NameList nameList = new NameList();
        System.out.println(nameList.unique(arrayList));
        System.out.println(nameList.uniqueSet(arrayList));
    }
}
