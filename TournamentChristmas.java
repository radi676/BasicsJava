package exam;

import java.util.Scanner;

public class TournamentChristmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daysOfTournament = Integer.parseInt(sc.nextLine());
        int counterWins = 0;
        int counterLose = 0;
        double totalSum = 0;

        for (int i = 0; i < daysOfTournament; i++) {
            double dailySum = 0;
            int counterDailyWins = 0;
            int counterDailyLose = 0;

            String input = sc.nextLine();

            while (!input.equals("Finish")) {
                String typeGame = input;
                String gameResult = sc.nextLine();
                if (gameResult.equals("win")) {
                    dailySum += 20;
                    counterDailyWins++;
                } else {
                    counterDailyLose++;
                }
                input = sc.nextLine();
            }
            if (counterDailyWins > counterDailyLose) {
                dailySum = dailySum * 1.10;
            }
            counterWins += counterDailyWins;
            counterLose += counterDailyLose;
            totalSum += dailySum;
        }
        if (counterWins > counterLose) {


            System.out.print("You won the tournament! ");
            System.out.printf("Total raised money: %.2f", totalSum * 1.20);
        } else {
            System.out.print("You lost the tournament! ");
            System.out.printf("Total raised money: %.2f", totalSum);
        }
    }
}


