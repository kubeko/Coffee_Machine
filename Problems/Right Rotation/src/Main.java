import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().trim().split(" ");
        int rightShift = scanner.nextInt();
        int[] arr = new int[strArr.length];
        int equalShift = rightShift % strArr.length;

        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int arrSize = arr.length;
        int[] shiftedArr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            if (i < arrSize - equalShift) {
                shiftedArr[i + equalShift] = arr[i];
            } else {
                shiftedArr[Math.abs(i + equalShift - arrSize)] = arr[i];
            }
        }

        for (int i = 0; i < arrSize; i++) {
            System.out.print(shiftedArr[i] + " ");
        }
    }
}
