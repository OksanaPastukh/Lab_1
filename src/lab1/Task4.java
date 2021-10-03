package lab1;

import java.util.Arrays;

public class Task4 {

    public static void main(final String[] args) {
        for (int value = 1; value <= 100; value++){
            System.out.print(fizzbuzz(value)+ ", ") ;
        }

    }
    static String fizzbuzz(final int number){

        String result="";
           if (number % 3 == 0 && number % 5 == 0){
               result = "FizzBuzz";}
            else if (number % 3 == 0) { result ="Fizz";}
            else if (number % 5 == 0)  {result = "Buzz";}
            if (number % 3 != 0 && number % 5 != 0)  {result = String.valueOf(number);}

        return result;
    }
}
