package unit.five;

public class Exercise1 {
    public static void alcohol(double g){
        if(g <= 10.5){
            System.out.println("light vine");
        }else if(g <= 12){
            System.out.println("normal vine");
        }else if(g <= 15){
            System.out.println("strong vine");
        }else if(g <= 20){
            System.out.println("liquor");
        }else if(g <= 40){
            System.out.println("strong liquor");
        }else{
            System.out.println("extra strong liquor");
        }
    }
    public static void main(String[] args) {
        alcohol(10);
        alcohol(12);
        alcohol(15);
        alcohol(20);
        alcohol(40);
        alcohol(50);
    }
}
