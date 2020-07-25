import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scNum = scanner.nextInt();
        int[] arr = new int[scNum];
        for (int i = 0; i < scNum; i++) {
            arr[i] = scanner.nextInt();
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        boolean result = pairCheck(arr, num1, num2);
        System.out.println(!result);
    }

    public static boolean pairCheck(int[] arr, int num1, int num2) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1 && i + 2 <= arr.length) {
                if (arr[i + 1] == num2) {
                    return true;
                }
                if (i > 0 && arr[i - 1] == num2) {
                    return true;
                }
            } else if (arr[i] == num1 && i == arr.length - 1) {
                return arr[i - 1] == num2;
            }
        }
        return false;
    }
}