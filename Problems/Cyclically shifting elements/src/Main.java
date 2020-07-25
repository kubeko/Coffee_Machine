import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            if (i < arrSize - 1) {
                arr[i + 1] = scanner.nextInt();
            } else {
                arr[0] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
