import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        System.out.println("Please, enter numbers: ");
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();

        int[] input = new int[max];
        for (int counter = 0; counter < max; counter++) {
            input[counter] = scan.nextInt();
        }

        System.out.println(avgOf4Digit(input));

        for (int call_result : minToBegin(input)) {
            System.out.print(call_result + " ");
        }
    }

    public static double avgOf4Digit(int[] nums) {
        double search = 0;
        int sum = 0;
        for (int element : nums) {
            if (element < 1000 || element > 9999) continue;

            search++;
            sum += element;
        }

        return sum == 0 ? -1 : sum / search;
    }

    public static int[] minToBegin(int[] nums) {
        int tmp = nums[0];
        int lowest = 0;
        for (int num : nums) {
            lowest = Math.min(tmp, num);
            tmp = num;
        }

        boolean first_time = true;
        int[] result = new int[nums.length];
        result[0] = lowest;
        for (int handler = 1; handler < result.length; handler++) {
            if (nums[handler - 1] == lowest && first_time) {
                first_time = false;
            }

            if (first_time) {
                result[handler] = nums[handler - 1];
            } else {
                result[handler] = nums[handler];
            }
        }

        return result;
    }
}
