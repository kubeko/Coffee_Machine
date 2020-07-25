import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            arr[i] = scanner.nextInt();
        }
        int j = 0;
        int numb = scanner.nextInt();
        for (int i = 0; i < sizeArr; i++) {
            if (arr[i] == numb) {
                ++j;
            }
        }
        System.out.println(j);
    }


}