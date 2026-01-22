package org.example.ArrayStringCodingQuestion.string;

public class PrintAllpossiblePermuationOfString {

    public static void main(String[] args) {

        String string="God";
        if(string.isEmpty())

        {
            System.out.println("permuation of String is"+ string);
        }
        else
        {
            findAllPermuation(string,"");
        }



    }

    private static void findAllPermuation(String string, String result) {

        if(string.isEmpty())
        {
            System.out.println(result);
            return;
        }

        for(int i=0;i<string.length();i++)
        {
            char current=string.charAt(i);

            String remaining=string.substring(0,i)+ string.substring(i+1);

            findAllPermuation(remaining,result+current);
        }



    }


}
