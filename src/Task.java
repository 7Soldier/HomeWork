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
        System.out.print("Please, enter input info: ");
        String input = scan.nextLine();

        String[] split_input = input.split(" ");
        int[] nums = new int[2];
        for (int counter = 0; counter < 2; counter++) {
            nums[counter] = Integer.parseInt(split_input[counter]);
        }

        int tmp;
        String result = "";
        int counter = nums[0];
        for (;counter > 0;counter /= 10) {
            tmp = counter % 10;

            result = result + (tmp == nums[1] ? "" : tmp);
        }

        result = new StringBuffer(String.valueOf(result)).reverse().toString();
        System.out.println(result);
    }

    // Second task
    public static void secondTask() {
        System.out.println("===== Task 2nd =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int input = scan.nextInt();

        int tmp;
        String result = "";
        for (;input > 0;input /= 10) {
            tmp = input % 10;
            result = result + tmp;
        }

        System.out.println(result);
    }

    // Third task
    public static void thirdTask() {
        System.out.println("===== Task 3rd =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter input info: ");
        String input = scan.nextLine();

        String[] split_input = input.split(" ");
        int[] nums = new int[split_input.length];
        for (int counter = 0; counter < nums.length; counter++) {
            nums[counter] = Integer.parseInt(split_input[counter]);
        }

        int tmp = nums[0];
        for (int counter : nums) {
            if (counter > 0 && tmp > 0) {
                tmp = Math.min(counter, tmp);
            }
        }

        System.out.println(tmp);
    }

    // Fourth task
    public static void fourthTask() {
        System.out.println("===== Task 4th =====");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter input info: ");
        String input = scan.nextLine();

        String[] split_input = input.split(" ");
        int[] nums = new int[split_input.length];
        for (int counter = 0; counter < nums.length; counter++) {
            nums[counter] = Integer.parseInt(split_input[counter]);
        }

        int max = 0;
        int second_max = 0;
        for (int counter = 0; counter < nums.length; counter++) {
            if (nums[counter] > max) {
                second_max = max;
                max = nums[counter];
            } else if (max > nums[counter]) {
                if (nums[counter] > second_max) {
                    second_max = nums[counter];
                }
            }
        }

        System.out.println(max + " " + second_max);
    }
}
