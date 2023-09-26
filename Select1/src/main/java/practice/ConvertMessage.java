package practice;

import java.util.HashMap;
import java.util.Map;

public class ConvertMessage {

    private Map<String, String> initial = new HashMap<String, String>();

    public void setInitial(String key, String value) {
        this.initial.put(key, value);
    }

    public String getSentence(String initial) {
        return this.initial.get(initial);
    }

    public Map<String, String> getInitialList() {
        return this.initial;
    }

    public void removeInitial(String key) {
        this.initial.remove(key);
    }


}
