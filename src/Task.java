import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        firstTask();  // Start first homework task
        secondTask(); // Start second homework task
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

    // Second task
    public static void secondTask() {
        System.out.println("===== Task 2nd =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int input = scan.nextInt();

        int rabbits = 11;
        int wolfs = 2;
        int eaten = 0;

        for (int month = 1; month < input; month++) {
            if (month % 2 != 0) {
                rabbits = rabbits * 3;
            } else {
                while (rabbits < 10 * wolfs) {
                    wolfs -= 1;
                }
                rabbits -= 10 * wolfs;
                eaten += 10 * wolfs;
            }

            while (eaten >= 70) {
                wolfs += 1;
                eaten -= 70;
            }

            if (rabbits >= 19000000) {
                rabbits = 19000000;
            }

        }

        System.out.println("Number of rabbits: " + rabbits);
        System.out.println("Number of wolfs: " + wolfs);
    }
}
