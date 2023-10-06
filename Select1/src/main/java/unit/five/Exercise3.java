package unit.five;

public class Exercise3 {
    public static void triangleType(int a, int b, int c){
        if(a == b && b == c){
            System.out.println("it is regular");
        }else if(a == b || b == c || a == c){
            System.out.println("it is symetric");
        }else{
            System.out.println("it is irregular");
        }
    }

    public static void main(String[] args) {
        triangleType(2, 3, 4);
        triangleType(2, 2, 3);
        triangleType(2, 2, 2);
    }
}
