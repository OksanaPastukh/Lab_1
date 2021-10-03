package lab1;

public class Calculator {

    public double calc(final double value1, final char operation, final double value2) {
        double result = 0;
         final CustomDouble value_1 = new CustomDouble();
        final CustomDouble value_2 = new CustomDouble();
         value_1.fromDouble(value1);
         value_2.fromDouble(value2);

        switch (operation) {
            case '+':
                result = CustomDouble.add(value_1, value_2).toDouble();
                break;
            case '-':
                result = CustomDouble.remove(value_1, value_2).toDouble();
                break;
            case '*':
                result = CustomDouble.multiplication(value_1, value_2).toDouble(); // обычно сумируем int числа
                break;
            case '/':
                result = CustomDouble.division(value_1, value_2).toDouble(); // обычно сумируем int числа
                break;
            default:
                throw new UnsupportedOperationException("Wrong operation!");
        }
        return  result;
    }
}
