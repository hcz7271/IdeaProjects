package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numRows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numSeats = sc.nextInt();

        int totalSeats = numRows * numSeats;
        int income;

        if (totalSeats <= 60) {
            income = 10 * totalSeats;
        } else {
            int firstHalfSeats = (numRows / 2) * numSeats;
            int backHalfSeats = (numRows - (numRows / 2)) * numSeats;
            income = 10 * firstHalfSeats + 8 * backHalfSeats;
        }
        System.out.println("Total income:\n$" + income);
    }
}