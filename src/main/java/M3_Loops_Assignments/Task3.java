package M3_Loops_Assignments;

public class Task3 {
    public static void main(String[] args) {
        Task3 loop = new Task3();
        loop.pyramid(6);
    }
    public void pyramid(int rows){
     for (int i = rows; i >= 1; i--){
         for (int j = 1; j<=i; j++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}
