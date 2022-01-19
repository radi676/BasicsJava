package exam;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counterForSeaPacket = Integer.parseInt(sc.nextLine());
        int counterForMountainPacket = Integer.parseInt(sc.nextLine());
        String nameOfThePacket = sc.nextLine();
        double seaPrice = 680;
        double mountainPrice = 499;
        double profits = 0;
        while (!nameOfThePacket.equals("Stop")) {

            if (nameOfThePacket.equals("sea") && counterForSeaPacket != 0) {

                profits += seaPrice;
                counterForSeaPacket--;

            }

            if (nameOfThePacket.equals("mountain") && counterForMountainPacket != 0) {
                profits += mountainPrice;
                counterForMountainPacket--;
            }
            if (counterForSeaPacket == 0) {
                if (counterForMountainPacket == 0)
                    break;
            }

            profits += profits;
            nameOfThePacket = sc.nextLine();
            if (counterForMountainPacket == 0 && counterForSeaPacket == 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }


        }
        System.out.printf("Profits: %.2f", profits);
    }
}

