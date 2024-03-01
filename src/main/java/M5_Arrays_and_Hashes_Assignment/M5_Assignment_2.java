package M5_Arrays_and_Hashes_Assignment;

import java.util.Scanner;

public class M5_Assignment_2 {
    public static void main(String[] args) {
        ToysStore toysStore = new ToysStore();
        System.out.println(toysStore.getToyById(12));
        System.out.println(toysStore.getToyById(212));
        System.out.println(toysStore.getToyById(45));
        System.out.println(toysStore.getToyById(0));
        System.out.println(toysStore.getToyById(201));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Toy ID: ");
        int id = Integer.parseInt(scanner.next());
        System.out.println(toysStore.getToyById(id));
    }

}
