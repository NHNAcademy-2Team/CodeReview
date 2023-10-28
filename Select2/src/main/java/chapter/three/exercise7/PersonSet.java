package chapter.three.exercise7;

import java.util.HashSet;
import java.util.Set;

public class PersonSet {
    private Set<Person> personSet;

    public PersonSet() {
        personSet = new HashSet<>();
    }

    public void add(Person person) {
        personSet.add(person);
    }

    public int size() {
        return personSet.size();
    }
}
