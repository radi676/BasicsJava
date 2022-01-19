import java.util.Scanner;

public class Examexercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTickets = 0;
        int stu = 0;
        int sta = 0;
        int kid = 0;
        String movieName = sc.nextLine();
        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(sc.nextLine());
            String ticketType = sc.nextLine();
            int soldTickets = 0;
            while (!ticketType.equals("End")) {
                soldTickets++;
                switch (ticketType) {
                    case "student":
                        stu++;
                        break;
                    case "standard":
                        sta++;
                        break;
                    case "kid":
                        kid++;
                }

                if (soldTickets == freeSeats) {
                    break;
                }
                ticketType = sc.nextLine();

            }
            totalTickets += soldTickets;
            System.out.printf("%s - %.2f%% full.%n", movieName, 1.0 * soldTickets / freeSeats * 100);
            movieName = sc.nextLine();

        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", stu * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", sta * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kid * 1.0 / totalTickets * 100);

    }


}


