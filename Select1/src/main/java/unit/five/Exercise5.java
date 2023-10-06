package unit.five;

public class Exercise5 {
    public static void discriminant(double a, double b, double c){
        if(a == 0)
            throw new IllegalArgumentException("이차 방정식이 성립되지 않습니다.");
        double result = (b * b) - (4 * a * c);
        if(result > 0){
            System.out.println("two distinct real solutions");
        }else if(result == 0){
            System.out.println("the real double solution");
        }else{
            System.out.println("the two complex solutions");
        }
    }

    public static void main(String[] args) {
        discriminant(3, 8, 5);
        discriminant(1, 4, 4);
        discriminant(3, 4, 5);
    }
}
