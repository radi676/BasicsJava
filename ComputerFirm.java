package exam;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int lastDigits = 0;
        int sale = 0;
        double profits = 0;
        double sum = 0;
        double rating = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            lastDigits = number % 10;
            sale = number / 10;

            if (lastDigits == 2) {
                profits = 0;
            } else if (lastDigits == 3) {
                profits = sale * 0.5;
            } else if (lastDigits == 4) {
                profits = 0.7 * sale;
            } else if (lastDigits == 5) {
                profits = 0.85 * sale;
            } else if (lastDigits == 6) {
                profits = 1.0 * sale;
            }
            sum += profits;
            rating+=lastDigits;
        }
        double average = rating/ n;
        System.out.printf("%.2f%n%.2f", sum, average);
    }

}
