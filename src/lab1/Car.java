package lab1;

import java.util.Objects;

public class Car {
    private String carBrand;
    private int numberOfCar;
    private Driver driver;

    public Car(final String carBrand,final int numberOfCar)
    {
        this.carBrand = carBrand;
        this.numberOfCar = numberOfCar;
    }

    public void setDriver(final Driver driver) {
        this.driver = driver;
    }
    public Driver getDriver() {
        return driver;
    }

    public String getCarBrand() {
        return carBrand;
    }
    public int getNumberOfCar() {
        return numberOfCar;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Car car = (Car) o;
        return Objects.equals(carBrand,car.carBrand) && Objects.equals(numberOfCar,car.numberOfCar);
    }
    @Override
    public int hashCode() {
        return Objects.hash(carBrand,numberOfCar,driver);
    }

    @Override
    public String toString() {

        return "Car Brand: " + getCarBrand() + '\n' +
                "Number of the car: " + getNumberOfCar() + '\n' +
                "Driver: " + ((getDriver() == null) ? "No driver" : getDriver().toString());
    }
}
