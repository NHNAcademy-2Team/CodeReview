import java.util.ArrayList;

public class City {
    private final ArrayList<TelephoneRegistry> cityList = new ArrayList<>();

    public void fillTelephoneRegistry() {
        TelephoneRegistry seoul = new TelephoneRegistry("seoul");
        TelephoneRegistry gwangju = new TelephoneRegistry("gwangju");
        TelephoneRegistry mokpo = new TelephoneRegistry("mokpo");

        seoul.add(new ClientInformation("홍길동", "010-1111-1111"));
        seoul.add(new ClientInformation("김철수", "010-2222-2222"));
        gwangju.add(new ClientInformation("홍길동", "010-3333-3333"));
        mokpo.add(new ClientInformation("고봉민", "010-5555-5555"));

        addCityList(seoul);
        addCityList(gwangju);
        addCityList(mokpo);
    }

    public void addCityList(TelephoneRegistry cityName) {
        cityList.add(cityName);
    }

    public ArrayList<TelephoneRegistry> getCityList() {
        return cityList;
    }
}
