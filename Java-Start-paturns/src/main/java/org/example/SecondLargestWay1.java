package org.example;

public class SecondLargestWay1 {
    public static void main(String[] args) {

        int[] a = {11,22,34,13,89,99,44,39};

        int temp ;
        for (int i = 0; i < a.length; i++ ){
            for (int j = i + 1; j < a.length; j++){
                if ( a[i] < a[j]){
                    temp=a[i];
                    a[i] = a [j];
                    a[j] = temp;
                }
            }
        }
        // Print sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : a) {
            System.out.print(num + " ");
        }

        // Print the second largest number
        if (a.length > 1) {
            System.out.println(" Second largest number: " + a[1]);
        } else {
            System.out.println("\nArray does not have enough elements for a second largest number.");
        }
    }
}
