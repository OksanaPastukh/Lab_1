package lab1;

import java.util.Objects;

public class Order {
    private int date;
    private int time;
    private int price;
    private Car car;

    public Order (final int date,final int time,final int price,final Car car)
    {
        this.date = date;
        this.time = time;
        this.price = price;
        if(car.getDriver() == null)
        {
            throw new UnsupportedOperationException("No driver");
        }
        this.car = car;
    }

    public int getDate() {
        return date;
    }
    public int getTime() {
        return time;
    }
    public int getPrice() {
        return price;
    }
    public Car getCar() {
        return car;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Order order = (Order) o;
        return date == order.date && time==order.time && price == order.price && Objects.equals(car,order.car);
    }
    @Override
    public int hashCode() {
        return Objects.hash(date,time,price,car);
    }

    @Override
    public String toString() {

        return "Order № " + '\n'+
                "Date: " + getDate() + '\n' +
                "Time: " + getTime() + '\n' +
                "Price: " + getPrice() + '\n'+
                getCar().toString();
    }

}
