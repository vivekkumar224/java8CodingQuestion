package org.example.ArrayStringCodingQuestion.string;

public class RotationString {

    public static void main(String[] args) {
        String s1="abcd";
        String s2="dabc";

        if(s1.length()!=s2.length())
        {
            System.out.println("both are not rotation of each other");
        }

        if((s1+s1).contains(s2))
        {
            System.out.println("S2 is rotation of s1 other");
        }
    }
}
