package unit.six;

public class Exercise7 {
    public static int findIndex(String s, char c){
        int max = 0;
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            if(s.charAt(i) == c) {
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(i) != s.charAt(j)) {
                        break;
                    }
                    count++;
                }
                if (max < count) {
                    result = i;
                    max = count;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findIndex("ababbba", 'b'));
    }
}
