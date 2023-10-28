package chapter.three.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    public static void main(String[] args) {
        evalutionExpression();
    }

    private static void evalutionExpression() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = br.readLine()).equals("0")) {
                String[] arg = line.split(" ");
                double x = Double.parseDouble(arg[0]);
                String operator = arg[1];
                double y = Double.parseDouble(arg[2]);
                System.out.println(Operator.find(operator).calculator(x, y));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
