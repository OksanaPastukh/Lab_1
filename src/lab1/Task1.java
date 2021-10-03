package lab1;

public class Task1 {

    public static void main(final String[] args)
    {
        final String []arr = {"qwe", "a", "qw", "fghj","www"};
        final int n = arr.length;


        sort(arr,n);
        printArraystring(arr, n);

    }

    static void sort(final String []s, final int n)
    {

        for (int i=1 ;i<n; i++)
        {
             final String temp = s[i];

            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
    }


    static void printArraystring(final String[] str, final int n)
    {
        for (int i=0; i<n; i++)
            System.out.print(str[i]+" ");
    }

}
