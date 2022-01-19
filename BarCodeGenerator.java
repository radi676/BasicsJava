package exam;

import java.util.Scanner;

public class BarCodeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = Integer.parseInt(sc.nextLine());
        int endNum = Integer.parseInt(sc.nextLine());

        int startUnits = startNum % 10;
        int startTens = startNum / 10 % 10;
        int startHundreds = startNum / 100 % 10;
        int startThousands = startNum / 1000 % 10;

        int endUnits = endNum % 10;
        int endTens = endNum / 10 % 10;
        int endHundreds = endNum / 100 % 10;
        int endThousands = endNum / 1000 % 10;

        for (int i = startNum; i < endNum; i++) {
            for (int j = startHundreds; j <= endHundreds; j++) {
                for (int k = startTens; k <= endTens; k++) {
                    for (int l = startUnits; l <= endUnits; l++) {
                        boolean isOdd = (i % 2 != 0)
                                && (j % 2 != 0)
                                && (k % 2 != 0)
                                && (l % 2 != 0);
                        if (isOdd) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }


}
