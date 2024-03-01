package M4_String_Assignment;

public class M4_Task2 {
    public boolean isPalindrome(String textToReverse){
        String result = "";
        int lastLetter = textToReverse.length() - 1;
        for(int i = lastLetter; i>=0; i-- ){
            result = result + textToReverse.charAt(i);
        }
        return textToReverse.equals(result);
    }
    public static void main(String[] args) {
        M4_Task2 m4_task2 = new M4_Task2();
        String string="carrace";
        boolean isPalindrome= m4_task2.isPalindrome(string);
        System.out.println(String.format("string %s is palindrome: %b", string, isPalindrome));
    }
}
