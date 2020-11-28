package stage4;

import java.util.Scanner;

public class Cinema4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        int totalSeats = rows * seats;
        String[][] seatss = new String[rows][seats];

       boolean exit=false;
       while(!exit) {

           System.out.println("1. Show the seats\n" +
                   "2. Buy a ticket\n" +
                   "0. Exit");
           int menu = scanner.nextInt();
           switch (menu) {
               case 1:
                   System.out.print("\nCinema:\n  ");
                   for (int i = 1; i <= seats; i++) {
                       System.out.print(i + " ");
                   }
                   for (int i = 0; i < rows; i++) {
                       System.out.print("\n" + (i + 1) + " ");
                       for (int j = 0; j < seats; j++) {
                           if(seatss[i][j]==null){
                               System.out.print("S ");
                           }else {
                               System.out.println("B ");
                           }
                       }

                   }
                   System.out.println();
                   break;
               case 2:
                   System.out.println("Enter a row number:");
                   int row = scanner.nextInt();
                   System.out.println("Enter a seat number in that row:");
                   int seat = scanner.nextInt();
                   if (totalSeats > 60) {
                       if (row > seat / 2) {
                           System.out.println("Ticket price: $8\n");
                       } else {
                           System.out.println("Ticket price: $10\n");
                       }
                   } else {
                       System.out.println("Ticket price: $10\n");
                   }

                   break;
               case 3:
                  exit=true;
                   break;

           }

       }

    }
}
