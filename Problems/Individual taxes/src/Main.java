import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompany = scanner.nextInt();
        int[] income = new int[numberOfCompany];

        for (int i = 0; i < numberOfCompany; i++) {
            income[i] = scanner.nextInt();
        }
        int[] tax = new int[numberOfCompany];

        for (int i = 0; i < numberOfCompany; i++) {
            tax[i] = scanner.nextInt();
        }
        int compIndexMaxTax = 1;
        double[] resultTax = new double[numberOfCompany];
        for (int i = 0; i < numberOfCompany; i++) {
            resultTax[i] = (double) income[i] * ((double) tax[i] / 100D);
            if (i > 0 && resultTax[i] > resultTax[i - 1]) {
                compIndexMaxTax = i + 1;
            }
        }
        System.out.println(compIndexMaxTax);
    }

}
