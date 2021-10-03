package lab1;

import java.util.Objects;

public class Day {
    private String nameOfday;
    private Weather weather;

    public Day(final String nameOfday, final Weather weather)
    {
        this.nameOfday = nameOfday;
        this.weather = weather;

    }
    public String getNameOfday() {
        return nameOfday;
    }
    public void setNameOfday(final String nameOfday) {
        this.nameOfday = nameOfday;
    }

    public Weather getWeather() {
        return weather;
    }
    public void setWeather(final Weather weather) {
        this.weather = weather;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Day day = (Day) o;
        return Objects.equals(weather,day.weather);
    }
    @Override
    public int hashCode() {
        return Objects.hash(weather,nameOfday);
    }

    @Override
    public String toString() {

        return "Name of the day: " + getNameOfday() + '\n' +
                getWeather().toString() + '\n';
    }
}
