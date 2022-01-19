import java.util.Scanner;

public class Axe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int width = 5 * n;
        int left = 3 * n;
        int middle = 0;
        int right = width - left - middle - 2;
        int stars = 1;
        int right1 = n - 1;

        for (int r = 0; r < n; r++) {
            String firstRow = repeatStr("-", left) +
                    repeatStr("*", stars) +
                    repeatStr("-", middle) +
                    repeatStr("*", stars) +
                    repeatStr("-", right);
            middle++;
            right--;
            System.out.print(firstRow);
            System.out.println();
        }
        for (int j = 0; j < n / 2; j++) {
            String middleRows = repeatStr("*", left - 1) +
                    repeatStr("*", stars) +
                    repeatStr("*", stars) +
                    repeatStr("-", middle - 1) +
                    repeatStr("*", stars) +
                    repeatStr("-", right + 1);
            System.out.print(middleRows);
            System.out.println();

        }
        for (int i = 0; i < (n / 2) - 1; i++) {
            String nextRow = repeatStr("-", left) + repeatStr("*", stars) +
                    repeatStr("-", (middle - 1)) +
                    repeatStr("*", stars) +
                    repeatStr("-", right1);
            right1--;
            left = left - 1;
            middle += 2;

            System.out.print(nextRow);
            System.out.println();

        }

        if (n % 2 != 0) {
            String lastRow = repeatStr("-", (n * 3) - (n / 2) + 1)
                    + repeatStr("*", 2 * n - 2)

                    + repeatStr("-", (n / 2) + 1);
            System.out.print(lastRow);
            System.out.println();
        }  else{
            String lastRow = repeatStr("-", (n * 3) - (n / 2) + 1)
                    + repeatStr("*", 2 * n - 1)

                    + repeatStr("-", (n / 2));
            System.out.print(lastRow);
            System.out.println();
            }


    }





    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
