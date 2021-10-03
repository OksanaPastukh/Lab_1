package lab1;

public class Task3 {
    public static void main(final String[] args) {
        final int[] a = {1, 2, 3, 4, 5};
        final char[] b = {'a', 'b', 'c', 'd','e','f'};
       final String result = MergeArr(a,b);
       System.out.print(result);

    }
    static String MergeArr(final int[] a,final char[] b)
    {
        int idx = 0;
        String result = "";
        for( idx = 0;idx < Math.max(a.length,b.length); idx++)
        {
            if(idx < a.length)
            {
               result += String.valueOf(a[idx]);
            }
            if(idx < b.length)
            {
                result +=  String.valueOf(b[idx]);
            }
        }
        return  result;
    }

    }
