package Matrix;

public class Row {
    int [][]sort(int [][]array,int k ){
        for (int i = 0; i < array[k].length; i++) {
                for (int j = 0; j <(array[k].length)-1;j++) {
                if (array[k][j + 1] < array[k][j]) {

                    int temp = array[k][j];
                    array[k][j]= array[k][j+1];
                    array[k][j+1]= temp;
                }
            }
        }
return array;
    }}


