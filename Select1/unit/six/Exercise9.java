package unit.six;

public class Exercise9 {
    public static String pyramid(int h){
        StringBuilder sb = new StringBuilder();
        if(h < 1 || h > 9)
            throw new IllegalArgumentException("1 ~ 9 사이의 정수를 입력해주세요.");
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= h - i; j++){
                sb.append(" ");
            }
            for(int j = 1; j <= i; j++){
                sb.append(j);
            }
            for(int j = i - 1; j > 0; j--){
                sb.append(j);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(pyramid(5));
    }
}
