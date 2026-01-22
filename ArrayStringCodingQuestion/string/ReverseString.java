package org.example.ArrayStringCodingQuestion.string;

public class ReverseString {

    public static void main(String[] args) {
        String s1="hello";
        char[] split = s1.toCharArray();

        int i=0;
        int l=split.length-1;

        while (i<=l/2)
        {
          char string=split[i];
          split[i]=split[l];
          split[l]=string;
          i++;
          l--;
        }

        System.out.println(new String(split));

    }
}
