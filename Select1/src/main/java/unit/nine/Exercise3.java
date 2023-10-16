package nine;

// 수정 후
class Base {
    public Base() {
        infob = "I am an object of the Base class";
    }

    public String getInfo() {
        return infob;
    }

    private String infob;
}

class Derived extends Base {
    public Derived() {
        super();
        infod = "I am an object of the Derived class";
    }

    public String getInfo() {
        return infod + ", " + super.getInfo();
    }

    private String infod;
}

public class Exercise3 {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b.getInfo());
    }

    // 수정 전 -> 자바 파일에서 여러개의 클래스를 작성하는 경우 하나의 대표 클래스를 지정하고 파일명과 동일하게 만들어야 하는데
    // 클래스마다 public으로 지정되어 있어 오류가 생긴다.

    // public class Base {
    // public Base() {
    // infob = "I am an object of the Base class";
    // }
    // public String getInfo() {
    // return infob;
    // }
    // private String infob;
    // }

    // public class Derived extends Base {
    // public Derived() {
    // super();
    // infod = "I am an object of the Derived class";
    // }
    // public String getInfo() {
    // return infod + ", " + super.getInfo();
    // }
    // private String infod;
    // }

    // public class Exercise3 {
    // public static void main(String[] args) {
    // Base b = new Base();
    // Derived d = new Derived();
    // System.out.println(b.getInfo());
    // System.out.println(d.getInfo());
    // b = d;
    // System.out.println(b.getInfo());
    // }
}