package org.example.ArrayStringCodingQuestion.string;

public class PalindromChecker {

    public static void main(String[] args) {
        String s="madam";

        String string = new StringBuffer(s).reverse().toString();
        if(s.equals(string))
        {
            System.out.println("both are palindrom");
        }
        else
        {
            System.out.println("both are not palindrom palindrom");

        }
    }
}
