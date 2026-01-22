package org.example.ArrayStringCodingQuestion.string;

public class PalindromwithoutPredefinedMethod {

    public static void main(String[] args) {
        String s="madam";

        char[] charArray = s.toCharArray();

        String string= reverseString(charArray);
        if(s.equals(string))
        {
            System.out.println("both are palindrome");
        }
        else
        {
            System.out.println("both are not palindrom");
        }
    }

    private static String reverseString(char[] charArray) {

        int i=0;
        int l=charArray.length-1;

        while (i<=l/2)
        {
            char c=charArray[i];
            charArray[i]=charArray[l];
            charArray[l]=c;
            i++;
            l--;
        }

        return new String(charArray);
    }
}
