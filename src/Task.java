import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        firstTask();  // Start first homework task
    }

    // First task
    public static void firstTask() {
        System.out.println("===== Task 1st =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int input = scan.nextInt();

        int cur = 1;
        int prev = 0;
        int tmp;
        for (int counter = 0; counter != input; counter++) {
            tmp = cur;
            cur = cur + prev;
            prev = tmp;
        }

        System.out.println(cur);
    }
}
