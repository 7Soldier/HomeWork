import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        firstTask(); // Start first homework task
        secondTask(); // Start second homework task
        thirdTask(); // Start third homework task
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

    // Second homework task
    public static void secondTask() {
        System.out.println("===== Task 2nd =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter input info: ");
        String input = scan.nextLine();

        String[] split_input = input.split(" ");
        int[] nums = new int[3];
        for (int counter = 0; counter < 3; counter++) {
            nums[counter] = Integer.parseInt(split_input[counter]);
        }

        int rub_price = nums[0] * nums[2];
        int penny_price = nums[1] * nums[2];
        while (penny_price >= 100) {
            rub_price += 1;
            penny_price -= 100;
        }

        System.out.println(rub_price + " " + penny_price);
    }

    // Third homework task
    public static void thirdTask() {
        System.out.println("===== Task 3rd =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter number of seconds: ");
        int input = scan.nextInt();

        int hours = input / 3600;
        int minutes = (input / 60) - (hours * 60);
        int seconds = input - (hours * 3600) - (minutes * 60);

        String parsed_hours = String.valueOf(hours);
        String parsed_minutes = String.valueOf(minutes < 10 ? "0" + minutes : minutes);
        String parsed_seconds = String.valueOf(seconds < 10 ? "0" + seconds : seconds);

        System.out.println(parsed_hours + ":" + parsed_minutes + ":" + parsed_seconds);
    }
}