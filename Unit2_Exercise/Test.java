package Unit2_Exercise;

public class Test {

        public static void main (String[] args) {
          StringBuffer s = new StringBuffer("test");
          StringBuffer t;
          t = s;
          s.append("!");
          System.out.println(s.toString());
          System.out.println(t.toString());
        }
    
}
