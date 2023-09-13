package Unit2;

public class Main{
    public static void main(String[] args) {
        /* 
         * Exercise 2.1
         * Write a Java program that creates an object of type String representing your name, and prints
         * the first and the last characters of the string
         */        
        String name = "KimBaBo";
        System.out.println("0: " + name.charAt(0) + "\n" +
                            "1: "+ name.charAt(6));

        /*
         * Exercise 2.2. Illustrate by means of a diagram what happens in memory when the program of Exercise 2.1
         * is executed.
         * 
         */

         /*
          * Exercise 2.3
          * Modify the Java program in Exercise 2.1 using as few variable as possible.
          */
        System.out.println("0: " + "KimBaBo".charAt(0) + "\n" +
                            "1: " + "KimBaBo".charAt(6) );
        
        /*
         * Exercise 2.4. Write a Java program that reads from input a non-empty string and prints the string obtained
         * from it by inverting the first and the last characters. Illustrate by means of a diagram what happens in memory
         * when the program is executed.
        */

        String inverting = "";
        for(int i = name.length()-1 ;i >= 0; i--) {
            inverting = inverting.concat(name.substring(i, i+1));
        }
        System.out.println(inverting);


        /*
         * Exercise 2.5. Solve Exercise 2.4 using the class StringBuffer.
         * Illustrate by means of a diagram what happens in memory when the program is executed.
         */
        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println(sb.toString());

    }
}