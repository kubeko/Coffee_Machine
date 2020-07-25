import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int day = 0;
        int distance = 0;

        while (distance < h) {
            distance += a;
            day++;
            if (distance >= h) {
                break;
            }
            distance -= b;

        }
        System.out.println(day);
    }
}