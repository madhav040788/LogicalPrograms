package numbersLogicalPrograms;

import java.util.*;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println("=========Reverse Word : =======");
        reversedWord();
        System.out.println("=========repeating Word : =======");
        repeatingWord();

    }
    private static void reversedWord() {
        String str = "Hello Word";

        String[] words = str.split(" ");
        String reverseString = "";

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reverseString += reversedWord + " ";
        }
        System.out.println("Reversed Word : " + reverseString.trim());
    }

    private static void repeatingWord(){
        String word = "maharashtra";

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : word.toCharArray()){
            charCountMap.put(c,charCountMap.getOrDefault(c,0) + 1);
        }
        System.out.println("Duplictate Charactor : ");
            for (char c : charCountMap.keySet()){
                if (charCountMap.get(c) > 1){
                    System.out.println(c + " = "+charCountMap.get(c));
                }
            }
    }
}
