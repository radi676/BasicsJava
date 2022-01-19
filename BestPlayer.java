package exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxGoals = 0;
        String bestPlayer = "";


        while (true) {

            String playerName = sc.nextLine();
            int numberOfGoals = Integer.parseInt(sc.nextLine());

            if (maxGoals < numberOfGoals) {
                maxGoals = numberOfGoals;
                bestPlayer = playerName;
            }

            if (maxGoals >= 3) {
                System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", bestPlayer, maxGoals);
            }
            if (playerName.equals("End") || numberOfGoals >= 10) {
                System.out.printf("%s is the best player!%nHe has scored %d goals.", bestPlayer, maxGoals);
                break;
            }
        }


    }
}
