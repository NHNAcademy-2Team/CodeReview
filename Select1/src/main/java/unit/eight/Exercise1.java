package unit.eight;

import java.io.*;


public class Exercise1 {
    /* is로 지정된 입력 채널에서 읽은 n개의 문자열 배열 반환 */
    public static String[] loadArray(InputStream is, int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String[] result = new String[n];
        try {
            for (int i = 0; i < n; i++) {
                result[i] = reader.readLine();
            }
        } finally {
            is.close();
        }
        return result;
    }

    /* os가 지정한 출력 채널에 문자열 sa의 배열 사용*/
    public static void saveArray(OutputStream os, String[] sa) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
        try {
            for (String s : sa) {
                writer.write(s);
                writer.newLine();
            }
            writer.flush();
        } finally {
            os.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String[] loadStrings = loadArray(new FileInputStream("Select1/test.txt"), 3);

        saveArray(System.out, loadStrings);

    }
}
