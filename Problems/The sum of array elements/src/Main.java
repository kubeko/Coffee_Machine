import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int sum = 0;
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }

}