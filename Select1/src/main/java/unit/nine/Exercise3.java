package unit.nine;

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
}

/*
 *  compilation error...?
 *
 * I am an object of the Base class
 * I am an object of the Derived class, I am an object of the Base class
 * I am an object of the Base class
 * */