package unit.five;

public class Exercise4 {
    private double longest, middle, shortest;
    private String type;

    public Exercise4(double a, double b, double c) {
        this.longest = a;
        this.middle = b;
        this.shortest = c;
    }


    public double longestSide() {
        if (longest >= middle) {
            if (longest >= shortest) {
                return longest;
            }
        } else if (middle > longest) {
            if (middle >= shortest) {
                double temp = middle;
                middle = longest;
                return longest = temp;
            }
        }
        double temp = shortest;
        shortest = longest;
        return longest = temp;
    }

    public double middleSide() {
        if (longest >= middle) {
            if (longest <= shortest) {
                double temp = longest;
                longest = middle;
                return middle = temp;
            }
        } else if (middle >= longest) {
            if (middle <= shortest) {
                return middle;
            }
        }
        double temp = shortest;
        shortest = middle;
        return middle = temp;
    }

    public double shortestSide() {
        if (longest <= middle) {
            if (longest <= shortest) {
                double temp = longest;
                longest = shortest;
                return shortest = temp;
            }
        } else if (middle < longest) {
            if (middle <= shortest) {
                double temp = middle;
                middle = shortest;
                return shortest = temp;
            }
        }
        return shortest;
    }

    public void triangleTest() {
        if (longestSide() > shortestSide() + middleSide()) {
            throw new IllegalArgumentException("가장 긴 변이 다른 두 변의 합보다도 깁니다");
        }
    }

    public double perimeter() {
        return longest + shortest + middle;
    }

    public double area() {
        double s = (perimeter()) / 2;
        return Math.sqrt(s * (s - longest) * (s - middle) * (s - shortest));
    }

    public void triangleType() {
        if (longest != middle && longest != shortest && middle != shortest) {
            this.type = "irregular triangle";
            System.out.println(this.type);
        } else if ((longest == middle && middle != shortest) || (middle == shortest && longest != middle)) {
            this.type = "symmetric triangle";
            System.out.println(this.type);
        } else {
            this.type = "regular";
            System.out.println(this.type);
        }
    }

    public static void main(String[] args) {
        Exercise4 t = new Exercise4(4, 4, 4);

        try {
            t.longestSide();
            t.middleSide();
            t.shortestSide();
            t.triangleTest();
            t.triangleType();
            System.out.println(t.perimeter());
            System.out.println(t.area());
        } catch (IllegalArgumentException e) {
            System.out.println("삼각부등식에 의거하여 다시 변을 입력해주세요");
        }
    }
}
