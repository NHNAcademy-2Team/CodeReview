package chapter.three.exercise5;

import java.util.Objects;

public class City {
    private final String cityName;
    private final double data;

    public City(String cityName, double data) {
        this.cityName = Objects.requireNonNull(cityName);
        this.data = data;
    }

    public double getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", data=" + data +
                '}';
    }
}
