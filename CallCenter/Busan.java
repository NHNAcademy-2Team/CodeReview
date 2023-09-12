import java.util.ArrayList;
import java.util.List;

public class Busan{
    private static final List<String> name = new ArrayList<>();
   

    public Busan() {
        name.add("Kim");
        name.add("Lee");
        name.add("Park");
        name.add("Choi");

    }

    public void search(String name) {
        if(this.name.contains(name))
            System.out.println(name + "님과 통화연결되었습니다.");
        else
            System.out.println("부산엔 " + name + "님이 안 계십니다");

    }

}
