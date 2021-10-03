package lab1;

public class Task9 {
    public static void main(final String[] args){
        try{
            final double num1 = 9.2;
            final double num2 = 4.5;
            final Calculator calculator = new Calculator();

            System.out.println(calculator.calc(num1,'+',num2));
            System.out.println(calculator.calc(num1,'-',num2));
            System.out.println(calculator.calc(num1,'*',num2));
            System.out.println(calculator.calc(num1,'/',num2));
        }
        catch (final UnsupportedOperationException e)
        {
            System.err.println(e.getMessage());
        }
        catch (final ArithmeticException a)
        {
            System.err.println(a.getMessage());
        }

    }
}
