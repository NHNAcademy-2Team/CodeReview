package unit.eight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class CarList {

    private String filename;

    public CarList(String filename) {
        this.filename = filename;
    }

    public int countNewCars() throws IOException {
        //새 차(kilometer = 0) 수 반환
        FileReader file = new FileReader(filename);
        BufferedReader br = new BufferedReader(file);

        int count = 0;
        Car c = Car.read(br);
        while (c != null) {
            if (c.getKilometers() == 0) {
                count++;
            }
            c = Car.read(br);
        }
        br.close();
        return count;
    }

    public Car mostExpensiveCar() throws IOException {
        //제일 비싼 차 반환
        FileInputStream is = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        double max = 0;
        Car cmax = null;
        Car c = Car.read(br);
        while (c != null) {
            if (c.getPrice() > max) {
                max = c.getPrice();
                cmax = c;
            }
        c = Car.read(br);
    }
        br.close();
        return cmax;
    }

        public void addCar (Car c) throws IOException {
            //차량 목록 끝에 차량 c 추가
            FileWriter file = new FileWriter(filename, true);
            PrintWriter pw = new PrintWriter(file);

            pw.println(c.getModel());
            pw.println(c.getYear());
            pw.println(c.getKilometers());
            pw.println(c.getPrice());
            pw.close();
        }

        public void remove (Car c) throws IOException {
            //차량 목록에서 데이터가 c와 일치하는 차량 제거
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            File ftemp = new File("cars-temporary.txt");
            FileOutputStream os = new FileOutputStream(ftemp);
            PrintWriter pw = new PrintWriter(os);

            Car curr = Car.read(br);
            while(curr != null) {
                if (!curr.equalTo(c)) {
                    pw.println(curr.getModel());
                    pw.println(curr.getYear());
                    pw.println(curr.getKilometers());
                    pw.println(curr.getPrice());
                }
                curr = Car.read(br);
            }
            br.close();
            pw.close();

            ftemp.renameTo(file);
        }
    }
