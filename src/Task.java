import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        firstTask();  // Start first homework task
        secondTask(); // Start second homework task
        thirdTask();  // Start third homework task
        fourthTask(); // Start fourth homework task
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

    // Third task
    public static void thirdTask() {
        System.out.println("===== Task 3rd =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int input = scan.nextInt();

        int num;
        if (input < 10) {
            num = input;
        } else if (input < 100) {
            num = input % 10;
        } else {
            num = input % 100 % 10;
        }

        String end;
        switch (num) {
            case 1:
                end = "";
                break;
            case 2:
            case 3:
            case 4:
                end = "A";
                break;
            default:
                end = "OV";
        }

        System.out.println(input + " TORT" + end);
    }

    // Fourth task
    public static void fourthTask() {
        System.out.println("===== Task 4th =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int input = scan.nextInt();

        int tmp = input;
        int result = 0;
        for (;input > 0;input /= 10) {
            result = Math.min(tmp, input % 10);
            tmp = input % 10;
        }

        System.out.println(result);
    }
}
