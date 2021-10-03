package lab1;

public class CustomDouble {
    private int integer;
    private double fractional;


    public int getInteger() {
        return integer;
    }
    public void setInteger(final int integer) {
        if((this.fractional>0 && integer >= 0)
                || (this.fractional < 0 && integer <= 0)
                || (this.fractional == 0)) {
            this.integer = integer;
        }
        else
        {
            throw new IllegalArgumentException("Wrong argument!");
        }
    }

    public double getFractional() {
        return fractional;
    }
    public void setFractional(final double fractional) {

        if((this.integer>0 && fractional >= 0)
                || (this.integer < 0 && fractional <= 0)
                || (this.integer == 0)) {
            this.fractional = fractional;
        }
        else
        {
            throw new IllegalArgumentException("Wrong argument!");
        }
    }


   // public void add(final CustomDouble value)
    // {
      //this.fromDouble(this.toDouble() + value.toDouble());
   // }
     public static CustomDouble add(final CustomDouble value1, final CustomDouble value2)
     {
         final CustomDouble result = new CustomDouble ();
         result.fromDouble(value1.toDouble()+ value2.toDouble());
         return result;
     }

    public static CustomDouble remove(final CustomDouble value1, final CustomDouble value2)
    {
        final CustomDouble result = new CustomDouble ();
        result.fromDouble(value1.toDouble() - value2.toDouble());
        return result;
    }

    public static CustomDouble division(final CustomDouble value1, final CustomDouble value2)
    {
        if(value2.toDouble() == 0)
        {
           throw new ArithmeticException("Cannot be divided by zero!");
        }
        final CustomDouble result = new CustomDouble ();
        result.fromDouble(value1.toDouble() / value2.toDouble());
        return result;
    }

    public static CustomDouble multiplication(final CustomDouble value1, final CustomDouble value2)
    {
        final CustomDouble result = new CustomDouble ();
        result.fromDouble(value1.toDouble() * value2.toDouble());
        return result;
    }

    public int compare (final CustomDouble value1)
    {
        int result = 0;
        if(this.toDouble() > value1.toDouble())
        {
           return  result = 1;
        }
        else if(this.toDouble() < value1.toDouble())
        {
          return   result = -1;
        }
        else
        {
            return result = 0;
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final CustomDouble custom_double = (CustomDouble) o;

            return (integer == custom_double.integer && fractional == custom_double.fractional);
    }
    @Override
    public int hashCode() {
        return 31 * integer +
                31 *Double.hashCode(this.fractional);
    }

    @Override
    public String toString() {
        return String.valueOf(this.toDouble()) ;
    }
    public double toDouble()
    {
        final double result = this.integer + this.fractional;
        return result;
    }

    public void fromDouble(final double value)
    {

        this.integer = (int)value;
        this.fractional = value % 1;
    }
}
