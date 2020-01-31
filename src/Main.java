import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            int im = scan.nextInt();
            Main my = new Main();
            my.printFibonacci(im);
        }
    }

    public static void printFibonacci(long n) {
        long[] array = new long[(int) (n + 1)];
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (i < 2) array[i] = i;
            if (i >= 2) array[i] = array[i - 2] + array[i - 1];
        }
        System.out.println(array[(int) (n)]);


    }

}
