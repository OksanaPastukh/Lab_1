package lab1;

public class Task8 {
    public static void main(final String[] args)
    {
        try {
            final CustomDouble value1 = new CustomDouble();
            value1.setInteger(3);
            value1.setFractional(0.5);

            final CustomDouble value2 = new CustomDouble();
            value2.setInteger(-5);
            value2.setFractional(-0.5);


            System.out.print("The sum = " + CustomDouble.add(value1,value2));
            System.out.println();
            System.out.print("The remove = " + CustomDouble.remove(value1,value2));
           System.out.println();
            System.out.print("The multi = " + CustomDouble.multiplication(value1,value2));
            System.out.println();
            System.out.print("The dev = " + CustomDouble.division(value1,value2));
            System.out.println();

           if(value1.compare(value2) == 1)
           {
             System.out.print("The value1 > value2");
           }
           else if(value1.compare(value2) == -1)
           {
             System.out.print("The value1 < value2");
           }
           else {
            System.out.print("The value1 = value2");
           }
        }
        catch (final IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }
        catch (final ArithmeticException n)
        {
            System.err.println(n.getMessage());
        }
    }
}
