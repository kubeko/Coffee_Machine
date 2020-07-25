import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        int pairProductMax = 0;
        int pairProduct;
        for (int i = 0; i < arrSize - 1; i++) {
            pairProduct = arr[i] * arr[i + 1];
            if (pairProduct > pairProductMax) {
                pairProductMax = pairProduct;
            }
        }
        System.out.println(pairProductMax);
    }

}