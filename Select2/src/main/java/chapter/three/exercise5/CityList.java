package chapter.three.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CityList {
    private final List<City> cityList;

    public CityList() {
        cityList = new ArrayList<>();
    }

    public void add(City city) {
        Objects.requireNonNull(city);
        this.cityList.add(city);
    }

    public double totalSales() {
        Objects.requireNonNull(cityList);
        double sales = 0;
        for (City city : cityList) {
            sales += city.getData();
        }
        return sales;
    }

    @Override
    public String toString() {
        return "CityList{" +
                "cityList=" + cityList +
                '}';
    }
}
