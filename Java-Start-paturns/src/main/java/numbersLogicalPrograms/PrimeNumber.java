package numbersLogicalPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 98;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % 2 ==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime && number > 1){
            System.out.println("Number is prime : "+number);
        }else {
            System.out.println("this is Not prime number :"+number);
        }

    }
}
