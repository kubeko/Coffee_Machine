import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
