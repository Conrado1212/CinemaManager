package stage2;

import java.util.Scanner;

public class Cinema2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int columns  = scanner.nextInt();
        int seats = rows * columns;
        int income= seats > 60
                ? 8 * seats + 2 * (rows / 2 * columns)
                : 10 * seats;

        System.out.println("Total income:");
        System.out.println("$"+income);
    }
}
/*
  Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numOfRows = input.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numOfSeats = input.nextInt();

        input.close();

        int totalSeats = numOfRows * numOfSeats;
        int ticketPrice;

        if (totalSeats <= 60) {
            ticketPrice = totalSeats * 10;
        } else {
            int frontRows = numOfRows / 2;
            int frontRowIncome = frontRows * numOfSeats * 10;

            int backRows = numOfRows - frontRows;
            int backRowIncome = backRows * numOfSeats * 8;

            ticketPrice = frontRowIncome + backRowIncome;
        }

        System.out.println("Total income:\n$" + ticketPrice);


 */
