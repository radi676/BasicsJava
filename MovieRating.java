package exam;

import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int movieCounts = Integer.parseInt(sc.nextLine());
        double maxRating = 0;
        double minRating = 11;
        double sumRating = 0;
        String highestRatingForFilm = "";
        String lowestRatingForFilm = "";




        for (int m = 1; m <= movieCounts; m++) {
            String movieName = sc.nextLine();
            double filmRating = Double.parseDouble(sc.nextLine());
            if (filmRating > maxRating) {
                maxRating = filmRating;
                highestRatingForFilm = movieName;
            }
            if (filmRating < minRating) {
                minRating = filmRating;
                lowestRatingForFilm = movieName;
            }
            sumRating += filmRating;
        }
        double averageRating = sumRating / movieCounts;

        System.out.printf("%s is with highest rating: %.1f%n", highestRatingForFilm, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", lowestRatingForFilm, minRating);
        System.out.printf("Average rating: %.1f%n", averageRating);
    }

}
