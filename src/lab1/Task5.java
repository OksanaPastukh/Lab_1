package lab1;

public class Task5 {
    public static void main(final String[] args) {

        final int rowCount = 3;
        final int colCount = 4;
        final int[][] a = new int[rowCount][colCount];

        creating(a,rowCount,colCount);
        print(a,rowCount,colCount);
        final int[][] t_a = change(a,rowCount,colCount);
        print(t_a,colCount,rowCount);
     }

     static int[][] creating(final int[][] a, final int rowCount, final int colCount){

            for (int row = 0; row < rowCount; row++) {
              for (int col = 0; col < colCount; col++) {
                a[row][col] = rowCount*row + col;
              }
             }
            return a;
        }

    static void print(final int[][] a , final int rowCount, final int colCount){

        System.out.println("------");
        for (int row = 0; row < rowCount; row++) {
        for (int col = 0; col < colCount; col++) {
        System.out.printf("%4d", a[row][col]);
        }
      System.out.println();
      }
    }

    static int[][] change(final int[][] a,final int rowCount, final int colCount){
        final int[][] t = new int[colCount][rowCount];
       for (int row = 0; row <rowCount; row++) {
       for (int col = 0; col < colCount; col++) {
          t[col][row] = a[row][col];
       }
    }
       return t;
    }
}
