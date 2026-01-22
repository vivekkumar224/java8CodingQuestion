package org.example.ArrayStringCodingQuestion.Array;

public class MatrixDiagonalCheck {

    public static void main(String[] args) {

        int a[][]={{1,0,1},
                {0,1,0},
                {1,0,1}};

        boolean flag=true;

        int value=a[0][0];
        for(int i=0;i<a.length;i++) {
            if (a[i][i] != value || a[i][a.length - 1 - i] != value) {
                flag = false;
            }
        }

        System.out.println(flag);

    }




}
