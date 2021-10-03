package lab1;

import java.util.Objects;

public class Weather {
    private  String typeOfWeather;
    private  int temperature;
    private  int humidity;

    public Weather(final String typeOfWeather,final int temperature,final int humidity)
    {
        this.typeOfWeather = typeOfWeather;
        this.temperature = temperature;
        this.humidity =humidity;
    }

    public String getTypeOfWeather() {
        return typeOfWeather;
    }
    public void setTypeOfWeather(final String typeOfWeather) {
        this.typeOfWeather = typeOfWeather;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(final int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(final int humidity) {
        if(humidity >= 0 && humidity <= 100)
        {
            this.humidity = humidity;
        }
        else {
            throw new IllegalArgumentException("Wrong argument!");
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Weather weather = (Weather) o;
        if(((Weather) o).getTypeOfWeather().equals(this.getTypeOfWeather()))
        return (temperature == weather.temperature && humidity == weather.humidity);
        else
            return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(typeOfWeather,temperature,humidity);
    }

    @Override
    public String toString() {

        return "type of weather: " + getTypeOfWeather() + '\n' +
                "temperature: " + getTemperature() + '\n' +
                "humidity: " + getHumidity() + "%";
    }
}
