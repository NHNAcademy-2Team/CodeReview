package unit.ten;

public class Exercise6 {
    public static int findLongSequence(String s, char letter){
        if(s.length()==0){
            return 0;
        }

        if(s.charAt(0) == letter){
            int count = 1;
            int i = 1;
            while(i < s.length() && s.charAt(0)=='c'){
                count++;
                i++;
            }
            int nextSequence = findLongSequence(s.substring(i), letter);
            return Math.max(count, nextSequence);
        } else {
            return findLongSequence(s.substring(1),letter);
        }
    }

    public static void main(String[] args) {
        String sequence = "aaabbbcccccc";
        char target = 'c';

        int longestSequence = findLongSequence(sequence,target);
        System.out.println("가장 긴 시퀀스의 길이는 " + longestSequence);

    }
}
