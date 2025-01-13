package org.example;

public class HallowDiamond {

    public static void main(String[] args) {

        int rows =5;
        // Top half
        for (int i = 1; i <= rows; i ++) {
            for (int j = 1; j <= rows - i; j ++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k ++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Bottom half
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
