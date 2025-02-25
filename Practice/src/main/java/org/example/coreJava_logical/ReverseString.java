package org.example.coreJava_logical;
import java.util.Map;
import java.util.LinkedHashMap;
public class ReverseString {

    public static void main(String[] args) {
        String str = "yashoda";

        String reversed = "";

        for (int i =str.length()-1; i >= 0;i--){
            reversed += str.charAt(i);
        }
        System.out.printf("Reversed String :: "+reversed);
    }
}
