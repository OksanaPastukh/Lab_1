package lab1;
import java.util.Arrays;

public class Task2 {
    public static void main(final String[] args) {
        final String[] arr ={ "hello", "world"};
        final char searchChar = 'l';

        int result= 0;
        for (final String word :arr) {
            result += countinword(word,searchChar);
        }
        System.out.print(result);
    }

    static int countinword(final String word, final char searchChar) {

         int count = 0;

         for (int i = 0; i <word.length() ; ++i)
         {

           if (word.charAt(i)== searchChar) {
               count++;
          }

         }
     return count;
  }
}


