package org.example.ArrayStringCodingQuestion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEncodeDecode {

    public static void main(String[] args) {
       // List<String> str= Arrays.asList("Hello","world");
        List<String> str= Arrays.asList("Hello;","world");
        //List<String> str= Arrays.asList("He/llo/;","world");

        String encodeedString=encodeString(str);
        System.out.println(encodeedString);
       List<String> decoded =decodesString(encodeedString);
       System.out.println(decoded);
    }

    private static List<String> decodesString(String s) {

        List<String> decodedStrings = new ArrayList<>();

        StringBuilder currentString = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '/') {
                currentString.append(s.charAt(i + 1));
                i += 2;
            }
            else if (s.charAt(i) != ';') {
                currentString.append(s.charAt(i));
                i++;
            }
            else {
                decodedStrings.add(currentString.toString());
                currentString.setLength(0);
                i++;
            }
        }

        return decodedStrings;
    }





    private static String encodeString(List<String> str) {

        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == ';') {
                    sb.append("/;");
                }
                else if (s.charAt(i) == '/') {
                    sb.append("//");
                }
                else {
                    sb.append(s.charAt(i));
                }
                i++;
            }

            sb.append(";");
        }

        return sb.toString();

    }
}
