package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    public static int noOfPurchasedTickets = 0;
    public static int currentIncome = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //___getting no of rows and columns
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int columns = sc.nextInt();
        char[][] seatArrangements = new char[rows][columns];
        for (int i = 0; i < seatArrangements.length; i++) {
            Arrays.fill(seatArrangements[i], 'S');
        }

        //___Showing Menu
        int ch;
        do {
            System.out.println();
            System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            ch = sc.nextInt();
            System.out.println();
            switch (ch) {
                case 1:
                    showTheSeats(rows, columns, seatArrangements);
                    break;
                case 2:
                    buyATicket(rows, columns, seatArrangements);
                    break;
                case 3:
                    statistics(rows, columns);
                    break;
                case 0:
                    return;
            }
        } while (true);
    }  //  End of Main Method


    //_____________________________Method for show seating arrangements______________________________//
    public static void showTheSeats(int rows, int columns, char[][] seatArr) {
        System.out.println("Cinema:");
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("  ");
                } else if (i == 0) {
                    System.out.print(j + " ");
                } else if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(seatArr[i - 1][j - 1] + " ");
                }
            }
            System.out.println();
        }
    }
    //**********************************************************************************************//

    //___________________________________________ Buy A ticket _____________________________________//
    public static void buyATicket(int rows, int columns, char[][] seatArr) {
        Scanner sc = new Scanner(System.in);
        boolean booked = false;
        do {
            System.out.println("Enter a row number:");
            int rowsNo = sc.nextInt();
            System.out.println("Enter a seat number in that row:");
            int columnNo = sc.nextInt();

            if (rowsNo > rows || columnNo > columns) {
                System.out.println("Wrong input!\n");
                continue;
            }

            if (seatArr[rowsNo - 1][columnNo - 1] == 'B') {
                System.out.println("That ticket has already been purchased!\n");
            } else {
                booked = true;
                System.out.print("\nTicket price: ");

                if (rows * columns <= 60) {
                    System.out.println("$10");
                    currentIncome += 10;
                } else if (rowsNo <= rows / 2) {
                    System.out.println("$10");
                    currentIncome += 10;
                } else {
                    System.out.println("$8");
                    currentIncome += 8;
                }
                seatArr[rowsNo - 1][columnNo - 1] = 'B';
                noOfPurchasedTickets += 1;
            }
        } while (!booked);


    }
    //************************************************************************************************//

    //_____________________________________ Method Statistics ________________________________________//
    public static void statistics(int rows, int columns) {
        System.out.println("Number of purchased tickets: " + noOfPurchasedTickets);
        System.out.printf("Percentage: %.2f%%\n", ((float) 100 / (rows * columns) * noOfPurchasedTickets));
        System.out.println("Current income: $" + currentIncome);
        System.out.printf("Total income: $%d\n", totalIncome(rows, columns));
    }
    //*************************************************************************************************//

    //______________________________ Method for Calculating Total Income ______________________________//
    public static int totalIncome(int rows, int columns) {
        if (rows * columns <= 60) {
            return rows * columns * 10;

        } else {
            int firstHalf = rows / 2 * 10 * columns;
            int secondHalf = 8 * (rows - rows / 2) * columns;
            return firstHalf + secondHalf;
        }
    }
    //*************************************************************************************************//
} // End of Class