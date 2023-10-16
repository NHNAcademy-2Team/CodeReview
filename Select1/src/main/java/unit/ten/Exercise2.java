package ten;

public class Exercise2 {

    static int count = 0;

    public static int fibonacci(int number) {
        count++;
        if (number == 0)
            return 1;
        else if (number == 1)
            return 1;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(4)); // 3
        System.out.println(count);

    }
}
