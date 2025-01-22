package numbersLogicalPrograms;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int number = 153, originalNumber = number,result = 0;

        while (originalNumber != 0){
            int digit = originalNumber % 10;
            result +=   Math.pow(digit,3);
            originalNumber /= 10;
        }
        if (result == number){
            System.out.println(number + " : Yes... this is ArmStrong Number ");
        }else {
            System.out.println(number+"  : No--- this is not ArmStringNumber ");
        }
    }
//    153 : Yes... this is ArmStrong Number
//
//    Process finished with exit code 0

}
