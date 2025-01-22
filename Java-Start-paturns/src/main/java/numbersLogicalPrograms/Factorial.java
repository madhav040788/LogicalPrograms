package numbersLogicalPrograms;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
            System.out.println(factorial  +" = "+i);
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
//            1 = 1
//            2 = 2
//            6 = 3
//            24 = 4
//            120 = 5
//    Factorial of 5 is 120

}
