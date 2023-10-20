package unit.ten;
import java.io.*;

public class Exereise5 {

    public int count(BufferedReader br) throws IOException{
        String s = br.readLine();
        if (s.equals(null)) {
            return 0;
        }
        if (Integer.parseInt(s) == 1){  // Integer.parseInt(String s) -> s를 int 형으로 변경
            return 1 + count(br);
        } else {
            return count(br);
        }
    }
}
