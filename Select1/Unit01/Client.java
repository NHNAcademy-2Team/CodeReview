public class Client {
    private String clientCity;
    private String clientName;

    public Client(String clientCity, String clientName){
        this.clientCity = clientCity;
        this.clientName = clientName;
    }

    public String getClientCity(){
        return this.clientCity;
    }
    public String getClientName(){
        return this.clientName;
    }
}
