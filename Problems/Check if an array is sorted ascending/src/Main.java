import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        boolean ascend = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (i != 0 && arr[i] < arr[i - 1] && ascend) {
                ascend = false;
            }
        }
        System.out.println(ascend);
    }
}