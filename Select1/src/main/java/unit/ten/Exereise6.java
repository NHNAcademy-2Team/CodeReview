package unit.ten;
public class Exereise6 { //TODO
    // 연속되있는지 확인
    // 최대 확인

    public int maxLine(String s, char c) {
        int max = 0;

        if (s.equals(null)) {
            return 0;
        }



        
        
        // return 1 + maxLine(s.substring(1), c);
        // 다음으로 넘어가는 return
        return max;
    }

    public int countChars(String s, char c) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) != c) {
            return 0;
        } else {
            return 1 + countChars(s.substring(1), c);
        }
    }

}
