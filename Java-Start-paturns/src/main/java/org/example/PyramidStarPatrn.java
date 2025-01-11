package org.example;

public class PyramidStarPatrn {

        public static void main(String[] args) {
            int n = 5; // Height of the pyramid
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
