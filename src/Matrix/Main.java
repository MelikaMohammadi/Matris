package Matrix;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("لطفا تعداد ردیف خود را وارد کنید");
        Scanner Row = new Scanner(System.in);
        int row = Integer.parseInt(Row.next());
        System.out.println("لطفا تعداد ستون خود را وارد کنید");
        Scanner Column = new Scanner(System.in);
        int column = Integer.parseInt(Column.next());
       int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt(10);

            }
        }
        printMatrix(array);
        while (true){
        System.out.println("");
        System.out.println("ابتدا سطر یا ستون (c,r) سپس شماره آن را وارد کنید . ");
        String m = scanner.next();
        if (m.equalsIgnoreCase("c")){
            Matrix.Column column1 =new Column();
           printMatrix( column1.sort(array,scanner.nextInt(),row));


        }
        else{
            Row row1 =new Row();
            printMatrix(row1.sort(array,scanner.nextInt()));




        }
    }}
    static void printMatrix(int[][] array) {
        for(int r=0; r<array.length; r++) {
            for(int c=0; c<array[r].length; c++)
                System.out.print(array[r][c] + " ");
            System.out.println();
        }
    }
}