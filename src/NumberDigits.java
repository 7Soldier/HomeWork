import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        System.out.print("Please, enter numbers: ");
        Scanner scan = new Scanner(System.in);

        int[] input = new int[2];
        for (int counter = 0; counter < 2; counter++) {
            input[counter] = scan.nextInt();
        }

        System.out.println(sumOfSeven(input[0], input[1]));
    }

    public static int sumOfSeven(int a, int b) {
        int result = 0;

        for (int between = a; between <= b; between++) {
            if (between < 10 || between > 99) continue;
            if (between % 7 == 0) {
                result += (between / 10) + (between % 10);
            }
        }

        return result;
    }
}
