package Matrix;

import java.util.*;

public class Column {
    static  int[][] sort(int[][] array, int col,int row) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <(array.length)-1;j++) {
                if (array[j + 1][col] < array[j][col]) {

                    int temp = array[j][col];
                    array[j][col]= array[j+1][col];
                    array[j+1][col]= temp;
                }
            }
        }
   return array; }}