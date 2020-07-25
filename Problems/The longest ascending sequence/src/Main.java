import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        int sequenceMax = 1;
        int j = 1;
        for (int i = 0; i < arrSize - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                j++;
                if (sequenceMax < j) {
                    sequenceMax = j;
                }
            } else {
                j = 1;
            }
        }
        System.out.println(sequenceMax);
    }
}