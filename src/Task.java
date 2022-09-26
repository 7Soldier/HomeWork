import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        firstTask(); // Start first homework task
    }

    // First homework task
    public static void firstTask() {
        System.out.println("===== Task 1st =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int input = scan.nextInt();

        int first_num = input / 100;
        int second_num = input / 10 % 10;
        int third_num = input % 100 % 10;
        int sum = first_num + second_num + third_num;
        int next = ((input + 1) % 2 == 0) ? input + 1 : input + 2;

        System.out.println(sum + " " + next);
    }
}