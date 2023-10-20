package unit.one;

public class Operator {
    // private List<TelephoneReg> telegistry = new ArrayList<>();
    private static Seoul seoul = new Seoul();    
    private static Busan busan = new Busan();
    private static Gwangju gwangju = new Gwangju();
    private static Incheon incheon = new Incheon();


    public static void call(String city, String name) {
        switch(city) {
            case "seoul":
                seoul.search(name);
                break;
            case "incheon":
                incheon.search(name);
                break;
            case "gwangju":
                gwangju.search(name);
                break;
            case "busan":
                busan.search(name);
                break;
            default:
                System.out.println("그런 지역은 없는디유잉");
        }
    }

}
