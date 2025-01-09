package org.example;

import java.util.Arrays;
public class SecondLargestNumJava8 {

        public static void main(String[] args) {

            int[] a = {11, 22, 34, 13, 89, 99, 44, 39};

            if (a.length < 2) {
                System.out.println("Array does not have enough elements for a second largest number.");
                return;
            }

            // Find the largest number
            int largest = Arrays.stream(a).max().orElseThrow(() -> new RuntimeException("Array is empty"));

            // Find the second largest number
            int secondLargest = Arrays.stream(a)
                    .filter(num -> num != largest) // Exclude the largest number
                    .max()
                    .orElseThrow(() -> new RuntimeException("No second largest number found"));

            System.out.println("Largest number: " + largest + ", Second largest number: " + secondLargest);
        }
    }



