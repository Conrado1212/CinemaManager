package stage3;

import java.util.Scanner;

public class Cinema3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        int totalSeats = rows*seats;

        System.out.print("\nCinema:\n ");
        for(int i =1;i<=seats;i++){
            System.out.print(i + " ");
        }
        for(int i=0;i<rows;i++){
            System.out.print("\n"+(i+1) + " ");
            for(int j=0;j<seats;j++){
                System.out.print("S ");
            }

        }
        System.out.println();
        System.out.println("Enter a row number:");
        int row =scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seat = scanner.nextInt();
        if(totalSeats>60){
            if(row>seat/2){
                System.out.println("Ticket price: $8");
            }else{
                System.out.println("Ticket price: $10");
            }
        }
        System.out.println("\nCinema:\n ");
        for(int i=1;i<=seats;i++){
            System.out.print(i +" ");
        }
        for(int i =1;i<=rows;i++){
            System.out.print("\n"+ i +" ");
            for(int j=1;j<seats;j++){
                if(i== row && j ==seat){
                    System.out.print("B ");
                }else {
                    System.out.print("S ");
                }
            }
        }


    }
}
/* Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numberOfRows = input.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int noOfSeatInARow = input.nextInt();

        int totalSeats = numberOfRows * noOfSeatInARow;

        System.out.print("\nCinema:\n  ");
        for (int i = 1; i <= noOfSeatInARow; i++) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < numberOfRows; i++) {
            System.out.print("\n"+ (i + 1) + " ");
            for (int j = 0; j < noOfSeatInARow; j++) {
                System.out.print("S ");
            }
        }

        System.out.println("\nEnter a row number:");
        int rowNumber = input.nextInt();

        System.out.println("Enter a seat number in that row:");
        int seatNumber = input.nextInt();

        if (totalSeats > 60) {
            if (rowNumber > numberOfRows / 2) {
                System.out.println("Ticket price: $8");
            } else {
                System.out.println("Ticket price: $10");
            }
        } else {
            System.out.println("Ticket price: $10");
        }

        System.out.print("\nCinema:\n  ");
        for (int i = 1; i <= noOfSeatInARow; i++) {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= numberOfRows; i++) {
            System.out.print("\n"+ i + " ");
            for (int j = 1; j <= noOfSeatInARow; j++) {
                if (i == rowNumber && j == seatNumber) {
                    System.out.print("B ");
                } else {
                    System.out.print("S ");
                }
            }


 */