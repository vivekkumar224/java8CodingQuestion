package org.example.ArrayStringCodingQuestion.string;

public class PalindromeWIthoutCaseAndSpecialCharacter {

    public static void main(String[] args) {
        String s1="Mad&&am  ";

        String s = s1.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        String string = new StringBuffer(s).reverse().toString();

        if(string.equals(s))
        {
            System.out.println("both are palindrome");
        }
        else
        {
            System.out.println("both are not palindrome");

        }
    }
}
