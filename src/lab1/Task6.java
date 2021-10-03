package lab1;

public class Task6 {
    public static void main(final String[] args){

        final int[][] a ={{1,1,1},{2,2,2},{3,3,3}};
        final int[][] b ={{1,1,1},{2,2,2},{3,3,3}};
        final int[][] new_matrix= multiplying(a,b);
         print(new_matrix);

    }
    static int[][] multiplying(final int[][]a, final int[][] b)
    {

        final int[][] c =new int[a.length][b.length];


        for(int i=0;i< a.length;i++){
            for(int j=0;j< b.length;j++){
                c[i][j]=0;
                for(int k=0;k< c.length;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }

            }

        }
        return c;
    }
    static void print(final int[][] c)
    {
        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c.length; col++) {
                System.out.printf("%4d", c[row][col]);
            }
            System.out.println();
        }
    }
}
