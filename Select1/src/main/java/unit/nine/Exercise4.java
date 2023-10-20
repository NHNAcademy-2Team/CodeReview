package unit.nine;

import java.io.*;

public class Exercise4 {

    public static void main(String[] args) throws IOException{
            int n = 10;
            int[] v = new int[n];
            FileReader f = new FileReader("src/main/java/unit/nine/dati");
            BufferedReader in = new BufferedReader(f);
            int i = 0;
            String linea = in.readLine();
            while (linea != null) {
                v[i] = Integer.parseInt(linea);
                linea = in.readLine();
                i++;
            }
            f.close();

    }
}


/*
*   1. dati파일이 존재하지 않습니다.
*   2. FilNotFoundException (IOException을 throws했을 때는 안 뜨는데, throws안 하면 뜨는 에러임... 왜 뜨지..?)
*   3. IOException
*   걍 예외처리 안하면 컴파일러에서부터 걸러지는 건감
* */