package unit.nine;

public class Exercise4 {

    //컴파일 오류
    //1. FileReader가 file을 읽어야 하는데, file명만 명시되어 있을 뿐, File로 인코딩 하지 못해서 컴퓨터가 읽어들일 수 없음
    //2. 에러처리를 하지 못해서 BufferedReader, FileReader를 읽을 때 에러 발생

//    public static void main(String[] args) {
//        int n = 10;
//        int[] v = new int[n];
//        FileReader f = new FileReader("dati.txt");
//        BufferedReader in = new BufferedReader(f);
//        int i = 0;
//        String linea = in.readLine();
//        while (linea != null) {
//            v[i] = Integer.parseInt(linea);
//            linea = in.readLine();
//            i++;
//        }
//        f.close();
//    }
}
