package exam;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfD = Integer.parseInt(sc.nextLine());
        String typeOfD = sc.nextLine();
        String deliveryType = sc.nextLine();
        double singlePrise = 0;
        double priceForDelivery = 0;
        double price = 0;

        switch (typeOfD) {
            case "90X130":
                singlePrise = 110;
                if (countOfD >= 30) {
                    price = (countOfD * singlePrise) * 0.95;
                } else {
                    price = (countOfD * singlePrise )* 0.92;
                }
            case "100X150":
                singlePrise = 140;
                if (countOfD >= 40) {
                    price = (countOfD * singlePrise) * 0.94;
                } else {
                    price = (countOfD * singlePrise) * 0.90;
                }
                break;
            case "130X180":
                singlePrise = 190;
                if (countOfD >= 20) {
                    price = (countOfD * singlePrise) * 0.93;
                } else {
                    price =( countOfD * singlePrise) * 0.88;
                }
                break;
            case "200X300":
                singlePrise = 250;
                if (countOfD >= 25) {
                    price = (countOfD * singlePrise) * 0.91;
                } else  {
                    price = (countOfD * singlePrise )* 0.85;
                }
                break;
        }
        switch (deliveryType) {
            case "With delivery":
                priceForDelivery = 60;
                break;
            case "Without delivery":
                priceForDelivery = 0;
                break;
        }

        double finalPrice = price + priceForDelivery;

        if (countOfD > 99) {
            finalPrice = finalPrice -(0.04*finalPrice);
        }
        if (countOfD <= 10) {
            System.out.println("Invalid order");
        }else {
            System.out.printf("%.2f BGN", finalPrice);
        }

    }


}

