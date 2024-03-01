package M4_String_Assignment;

public class M4_exercises {
    public static void main(String[] args) {
        M4_exercises m4 = new M4_exercises();
        String string="red";
String result=m4.addChars(string);
        System.out.println(String.format("string %s ---> %s", string, result));
    }

    public String addChars(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            System.out.println("the String is null or empty");
            return "";
        }
        int lastPosition = str.length() - 1;
        char lastChar=str.charAt(lastPosition);
        String result=lastChar + str + lastChar;
        return result;
    }
}
