package org.example.coreJava_logical;

public class FibonacciSer {
    public static void main(String[] args) {
        int num = 10;
        int first = 0,second = 1,last;
        System.out.printf("Fibonacci Ser : "+first+" , "+second);
        for (int i = 2; i < num ; i++){
            last = first + second;
            System.out.printf(" , "+last);
            first = second;
            second = last;
        }
    }
}
