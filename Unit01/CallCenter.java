public class CallCenter {
    private static TelephoneRegistry addTelephone(){
        TelephoneRegistry telephoneRegistry = new TelephoneRegistry();
        telephoneRegistry.add(new Telephone("010-1234-5678", "수연", "Mokpo"));
        telephoneRegistry.add(new Telephone("010-5678-9012", "진영", "Gwangju"));
        telephoneRegistry.add(new Telephone("010-3456-7890", "태희", "Gwangju"));
        telephoneRegistry.add(new Telephone("010-1234-7890", "승현", "Gwangju"));
        return telephoneRegistry;
    }
    public static void main(String[] args) {
        Client client = new Client("Mokpo", "수연");
        TelephoneRegistry telephoneRegistry = addTelephone();
        Operator operator = new Operator(client.getClientCity(), client.getClientName());
        operator.pickCity(telephoneRegistry);
        System.out.println(operator.searchPhoneNumber());
    }
}
// 