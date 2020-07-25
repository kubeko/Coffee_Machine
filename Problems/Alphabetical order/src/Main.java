import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        boolean result = true;
        if (arr.length > 1) {
            int c;
            for (int i = 0; i < arr.length - 1; i++) {
                c = arr[i].compareToIgnoreCase(arr[i + 1]);
                if (c > 0) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}