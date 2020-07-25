import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        System.out.println(arr[0] + arr[1] == 20 || arr[0] + arr[2] == 20 || arr[1] + arr[2] == 20);
    }
}
