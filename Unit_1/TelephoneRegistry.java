import java.util.ArrayList;

public class TelephoneRegistry {
    private final ArrayList<ClientInformation> list = new ArrayList<>();
    private String cityName;

    public TelephoneRegistry(String cityName) {
        this.cityName = cityName;
    }

    public void add(ClientInformation privacy) {
        list.add(privacy);
    }

    public String findClientName(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                return list.get(i).getNumber();
            }
        }
        return "";
    }

    public ArrayList<ClientInformation> getList() {
        return list;
    }

    public String getCityName() {
        return cityName;
    }
}
