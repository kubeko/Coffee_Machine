import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] box2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        String result = boxFitInBoxCheck(box1, box2);
        System.out.println(result);

    }

    public static String boxFitInBoxCheck(int[] box1, int[] box2) {
        Arrays.sort(box1);
        Arrays.sort(box2);

        int x1 = box1[0];
        int y1 = box1[1];
        int z1 = box1[2];

        int x2 = box2[0];
        int y2 = box2[1];
        int z2 = box2[2];

        if (x1 == x2 && y1 == y2 && z1 == z2) {
            return "Box 1 = Box 2";
        } else if (x1 >= x2 && y1 >= y2 && z1 >= z2) {
            return "Box 1 > Box 2";
        } else if (x1 <= x2 && y1 <= y2 && z1 <= z2) {
            return "Box 1 < Box 2";
        } else {
            return "Incomparable";
        }
    }
}
