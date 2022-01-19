package exam;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherPrice = Integer.parseInt(scanner.nextLine());
        int ticketsNum = 0;
        int otherPrNum = 0;
        double sumMovie = 0;
        double sumPr = 0;


        while(voucherPrice >= 0){
            String movieName = scanner.nextLine();
            if (movieName.equals("End")){
                System.out.println(ticketsNum);
                System.out.println(otherPrNum);
                break;
            }


            if (movieName.length() > 8){

                sumMovie = movieName.charAt(0) + movieName.charAt(1);

                // sumMovie >= voucherPrice, чиято стойност е по-голяма от останалата сума на ваучера.
                if (sumMovie > voucherPrice){
                    System.out.println(ticketsNum);
                    System.out.println(otherPrNum);
                    break;
                }


                voucherPrice -= sumMovie;
                ticketsNum++;

            }else if (movieName.length() <= 8) {

                sumPr = movieName.charAt(0);

                // sumPr >= voucherPrice, чиято стойност е по-голяма от останалата сума на ваучера.
                if (sumPr > voucherPrice){
                    System.out.println(ticketsNum);
                    System.out.println(otherPrNum);
                    break;
                }
                voucherPrice -= sumPr;
                otherPrNum++;
            }

        }
    }
}
