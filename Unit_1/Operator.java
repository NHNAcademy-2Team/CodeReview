public class Operator {

    private String city;
    private String name;

    public Operator(String city, String name) {
        this.city = city;
        this.name = name;
    }

    public String findPhoneNumber() {
        City cityTelRegistry = new City();
        cityTelRegistry.fillTelephoneRegistry();

        for (int i = 0; i < cityTelRegistry.getCityList().size(); i++) {
            if (city.equals(cityTelRegistry.getCityList().get(i).getCityName())) {
                return cityTelRegistry.getCityList().get(i).findClientName(name);
            }
        }
        throw new Error("클라이언트의 정보가 없습니다.");
    }
}
