package chapter.three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;

public class Exercise5 {
    public static void main(String[] args) {
        String fileName = Objects.requireNonNull(Exercise5.class.getClassLoader().getResource("sales.dat")).getFile();
        try (FileReader file = new FileReader(fileName); BufferedReader br = new BufferedReader(file)) {
            String line;
            int missingDataCount = 0;
            CityList cityList = new CityList();
            while ((line = br.readLine()) != null) {
                try {
                    String[] CityInfo = line.split(":");
                    String cityName = CityInfo[0];
                    double data = Double.parseDouble(CityInfo[1]);

                    cityList.add(new City(cityName, data));
                } catch (NumberFormatException | InputMismatchException e) {
                    missingDataCount++;
                }
            }
            System.out.printf("모든 도시의 총 매출 : %f%n", cityList.totalSales());
            System.out.printf("누락된 도시의 수 : %d%n", missingDataCount);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class City {
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

class CityList {
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