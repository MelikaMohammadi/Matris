package Matrix;

import java.util.*;

public class Column {
    static  int[][] sort(int[][] array, int col,int Col) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <(array.length)-1;j++) {
                if (array[j + 1][col] < array[j][col]) {
                    for (int k = 0; k <Col ; k++) {


                    int temp = array[j][k];
                    array[j][k]= array[j+1][k];
                    array[j+1][k]= temp;}
                }
            }
        }
   return array; }}
