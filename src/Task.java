import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        firstTask();  // Start first homework task
        secondTask(); // Start second homework task
        thirdTask();  // Start third homework task
        fourthTask(); // Start fourth homework task
        fifthTask();  // Start fifth homework task
        sixthTask();  // Start sixth homework task
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

    // Fourth homework task
    public static void fourthTask() {
        System.out.println("===== Task 4th =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        float input = scan.nextFloat();

        System.out.println((input >= -2 && input <= 3) || (input >= 6 && input <= 9) ? "false" : "true");
    }

    // Fifth homework task
    public static void fifthTask() {
        System.out.println("===== Task 5th =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter input numbers: ");
        String input = scan.nextLine();

        String[] split_input = input.split(" ");
        int[] nums = new int[3];
        for (int counter = 0; counter < 3; counter++) {
            nums[counter] = Integer.parseInt(split_input[counter]);
        }

        int tmp = 0;
        for (int number : nums) {
            tmp += (number % 100 == 0) && (number % 5 == 0) ? 1 : 0;
        }

        System.out.println(tmp >= 2);
    }

    // Sixth homework task
    public static void sixthTask() {
        System.out.println("===== Task 6th =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter input cords: ");
        String input = scan.nextLine();

        String[] split_input = input.split(" ");
        float[] nums = new float[2];
        for (int counter = 0; counter < 2; counter++) {
            nums[counter] = Float.parseFloat(split_input[counter]);
        }

        System.out.println((nums[1] - nums[0]) >= 0 && (nums[1]+nums[0]*nums[0]) <= 2 ? "YES" : "NO");
    }
}
