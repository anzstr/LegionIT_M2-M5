package M4_String_Assignment;

import M3_Loops_Assignments.task1;

public class M4_Task1 {
    public static void main(String[] args) {
        M4_Task1 strings = new M4_Task1();
        String a = null;

        String b = "Cat";

        strings.compareStrings(a, b);
    }
public void compareStrings(String a, String b){
    if (a == null || b == null) {
        System.out.println("Cannot compare Strings");
    }
    else
    if (a.equals(b)){
        System.out.println("The Strings are the same");
    }
    else
    if (a.indexOf(b)>=0) {
        System.out.println(String.format("%s is the part of %s", b, a));
    }

}

}
