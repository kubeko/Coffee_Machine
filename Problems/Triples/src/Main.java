import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];
        int count = 0;
        for (int i = 0; i < sizeArr; i++) {
            arr[i] = scanner.nextInt();
            if (i > 1 && arr[i - 2] + 1 == arr[i - 1] && arr[i - 1] + 1 == arr[i]) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
