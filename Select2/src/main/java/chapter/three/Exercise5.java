package chapter.three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) {
        SalesFigures sales = new SalesFigures("../Select2/src/main/resources/sales.dat");
        System.out.println(sales.totalSales());
    }
}

class SalesFigures{
    private String filename;
    public SalesFigures(String filename){
        this.filename = filename;
    }

    private int fileLength(){
        int count = 0;
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while((line = br.readLine()) != null){
                count++;
            }
        } catch(IOException e){
            throw new RuntimeException();
        }
        return count;
    }

    public double totalSales(){
        double result = 0.0;
        String line;

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            for (int i = 0; i < fileLength(); i++) {
                line = br.readLine();
                double temp = sales(line);

                if(temp != -1)
                    result += temp;
            }
        }catch (IOException e){
            throw new RuntimeException();
        }
        return result;
    }

    private double sales(String line){
        String number = "";
        line = line.replaceAll(" ", "");

        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ':'){
                number = line.substring(i+1);
                break;
            }
        }

        try{
            return Double.parseDouble(number);
        } catch(NumberFormatException e){
            return -1;
        }
    }
}