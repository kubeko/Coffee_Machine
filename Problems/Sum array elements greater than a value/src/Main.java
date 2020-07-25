import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        final int numb = scanner.nextInt();
        for (int i : arr) {
            if (i > numb) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}