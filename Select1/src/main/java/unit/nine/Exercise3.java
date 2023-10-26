package unit.nine;

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