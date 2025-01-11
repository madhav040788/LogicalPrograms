package org.example;

public class RightAngleStarPatrn {

        public static void main(String[] args) {
            int n = 5; // Height of the triangle
            for (int i = 1; i <= n; i++) { // i = rows
                for (int j = 1; j <= i; j++) { // j=columns
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}
