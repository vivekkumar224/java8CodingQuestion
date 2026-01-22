package org.example.ArrayStringCodingQuestion.Array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudukoProblem {

    public static void main(String[] args) {
        char[][] board ={{'5','3','.','.','7','.','.','6','.'},
                        {'.','.','8','1','4','5','.','.','.'},
                        {'6','9','.','.','3','.','.','8','.'},
                        {'8','6','.','4','2','3','.','.','.'},
                        {'4','.','.','.','6','.','.','.','3'},
                        {'7','.','.','.','.','8','.','.','1'},
                        {'.','.','.','.','.','.','2','.','.'},
                        {'.','.','.','.','.','.','.','.','6'},
                        {'.','.','.','.','.','.','.','7','5'}};


        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];

        boolean isValidSoduko=true;

        for(int i = 0; i < 9; i++) {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();

        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                int gridNo = (i/3)*3 + (j/3);

                if (board[i][j] != '.') {
                    boolean isPresentInRow = rowSet[i].contains(board[i][j]);
                    boolean isPresentInCol = colSet[j].contains(board[i][j]);
                    boolean isPresentInGrid = gridSet[gridNo].contains(board[i][j]);

                    if (isPresentInRow || isPresentInCol || isPresentInGrid) {

                        isValidSoduko=false;

                    }

                    rowSet[i].add(board[i][j]);
                    colSet[j].add(board[i][j]);
                    gridSet[gridNo].add(board[i][j]);
                }
            }
        }




        if(isValidSoduko)
        {
            System.out.println("valid sududko");
        }
        else
        {
            System.out.println("invalid sududko");
        }

    }
}
