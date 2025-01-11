package org.example;

public class InvertedRightAngleStarPatrun {

        public static void main(String[] args) {
            int n = 5; // Height of the triangle
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
