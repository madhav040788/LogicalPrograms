package org.example;

public class SecondLargest {
    public static void main(String[] args) {

        int[] a = {11, 22, 34, 13, 89, 99, 44, 39};

        if (a.length < 2) {
            System.out.println("Array does not have enough elements for a second largest number.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found (all elements might be the same).");
        } else {
            System.out.println("Largest number: " + largest + ", Second largest number: " + secondLargest);
        }
    }
}
