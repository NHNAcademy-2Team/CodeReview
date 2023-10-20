package unit.one;

import java.util.Scanner;

public class CallCenter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        String name = input.next();
        String city = input.nextLine();
        Client.call(city, name);


        name = input.next();
        city = input.nextLine();
        Client.call(city, name);


        name = input.next();
        city = input.nextLine();
        Client.call(city, name);


    }
    
}