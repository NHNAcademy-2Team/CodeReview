package unit.five;

public class Exercise6 {
    public static String answerPrint(String str){
        StringBuilder answer = new StringBuilder("");
        if(str.startsWith("vocal")){
            answer.append("MAYBE ");
        }
        if(str.endsWith("a") || str.endsWith("i") || str.endsWith("u")){
            answer.append("YES");
        }else if(str.endsWith("e") || str.endsWith("o")){
            answer.append("NO");
        }else{
            answer.append("DON'T KNOW");
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(answerPrint("vocal i love u"));
        System.out.println(answerPrint("u"));
        System.out.println(answerPrint("a"));
        System.out.println(answerPrint("i"));
        System.out.println(answerPrint("vocal eo"));
        System.out.println(answerPrint("e"));
        System.out.println(answerPrint("o"));
        System.out.println(answerPrint("vocal"));
        System.out.println(answerPrint("h"));
    }
}
