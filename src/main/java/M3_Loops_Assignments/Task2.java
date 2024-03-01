package M3_Loops_Assignments;

public class Task2 {
    public static void main(String[] args) {
        Task2 loop = new Task2();
        loop.sumNumbers(1, 3);
    }

    public void sumNumbers(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
                   }
        System.out.println(sum);
    }

}
