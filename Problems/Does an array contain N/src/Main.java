import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            arr[i] = scanner.nextInt();
        }
        int guessNumb = scanner.nextInt();
        boolean result = false;
        for (int j = 0; j < sizeArr; j++) {
            if (arr[j] == guessNumb) {
                result = true;
                break;
            }
        }
        System.out.println(result);

    }
}