package unit.five;

public class Exercise2 {
    public static int pairCount(int a, int b, int c){
        int result = 0;
        if(a == b && b == c){
            result = 2;
        }else if(a == b || b == c || a == c){
            result = 1;
        }
        return result;
    }
    public static void trianlgeType(int a, int b, int c){
        int count = pairCount(a, b, c);
        if(count == 0){
            System.out.println("it is irregular");
        }else if(count == 1){
            System.out.println("it is symetric");
        }else{
            System.out.println("it is regular");
        }
    }

    public static void main(String[] args) {
        trianlgeType(3, 3, 3);
        trianlgeType(4, 4, 3);
        trianlgeType(2, 3, 4);
    }
}
