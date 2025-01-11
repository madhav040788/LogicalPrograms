package org.example;

public class InvertedPyramidStarPtrn {

        public static void main(String[] args) {
            int n = 5; // Height of the inverted pyramid
            for (int i = n; i >= 1; i--) {
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

