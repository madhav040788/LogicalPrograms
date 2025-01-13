package org.example;

public class NumberPyramid {

    public static void main(String[] args) {

        int row = 5;
        for (int i=1; i<= row;i++){
            for (int j =1; j<=row-1;j++){
                System.out.print(" ");
            }
            for (int k =1; k<=(2*i-1);k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
