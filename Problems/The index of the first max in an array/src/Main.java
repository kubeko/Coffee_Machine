import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        int indexMax = 0;
        int numbMax = Integer.MIN_VALUE;
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] > numbMax) {
                numbMax = arr[i];
                indexMax = i;
            }
        }
        System.out.println(indexMax);
    }
}