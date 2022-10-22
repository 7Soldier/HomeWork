import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter input data:");
        int len = scan.nextInt();
        byte[] optimized = new byte[(len+7)/8];

        byte tmp;
        for (int counter = 0; counter < len; counter++) {
            tmp = scan.nextBoolean() ? (byte)1 : (byte)0;
            optimized[counter/8] = (byte)(optimized[counter/8] | tmp << counter % 8);
        }

        for (int output = 0; output < len; output++) {
            System.out.print((((optimized[output / 8] & (1 << (output % 8))) >> (output % 8))==1) + " ");
        }
    }
}
