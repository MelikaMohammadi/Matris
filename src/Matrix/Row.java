package Matrix;

public class Row {
    int [][]sort(int [][]array,int k ,int row){
        for (int i = 0; i < array[k].length; i++) {
                for (int j = 0; j <(array[k].length)-1;j++) {
                if (array[k][j + 1] < array[k][j]) {
                    for (int l = 0; l <row ; l++) {
                        
                    int temp = array[l][j];
                    array[l][j]= array[l][j+1];
                    array[l][j+1]= temp;}
                }
            }
        }
return array;
    }}


