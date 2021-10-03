package lab1;

public class Task11 {
    public static void main(final String[] args){
        try {
            final Driver driver1 = new Driver("Tom", "Kappa");
            final Driver driver2 = new Driver("Alex", "Spirit");
            final Driver driver3 = new Driver("Petr", "Petrov");

            final Car car1 = new Car("Mazda", 1234);
            final Car car2 = new Car("BMW", 5678);
            car1.setDriver(driver1);
            car2.setDriver(driver2);

            final Order order1 = new Order(3, 17, 100, car1);
            final Order order2 = new Order(5, 11, 120, car2);

            System.out.print(order1);
            System.out.print(order2);

            car2.setDriver(driver3);
            final Order order3 = new Order(6, 12, 130, car2);
            System.out.print(order3);
        }catch (final UnsupportedOperationException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
