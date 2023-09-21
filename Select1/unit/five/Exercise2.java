package unit.five;

public class Exercise2 {

    public static void triangleType(double longest, double middle, double shortest) {
        if (longest != middle && longest != shortest && middle != shortest) {
            System.out.println("irregular triangle");
        } else if ((longest == middle && middle != shortest) || (middle == shortest && longest != middle)) {
            System.out.println("symmetric trinagle");
        } else {
            System.out.println("regular");
        }
    }

    public static void main(String[] args) {
        triangleType(4, 4, 4);
    }
}
