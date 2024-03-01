package M3_Loops_Assignments;

public class task1 {
    public static void main(String[] args) {
        task1 loop = new task1();
        loop.countNumbers();
    }

    public void countNumbers() {
        for (int i = 1; i <= 100; i++) {
            boolean isEven = (i % 2 == 0);
            boolean isDivisibleByThree = (i % 3 == 0);
            if (isEven && isDivisibleByThree) {
                System.out.println("the number '" + i + "' is divisible by two and three.");
            } else if (isDivisibleByThree) {
                System.out.println("the number '" + i + "' is divisible by three.");
            } else if (isEven) {
                System.out.println("the number '" + i + "' is even.");
            } else {
                System.out.println("the number '" + i + "' is odd.");
            }
        }
    }
}
