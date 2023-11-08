package chapter.three;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.printf("생일이 같은 세 사람을 찾으려면 무작위로 몇 명을 뽑아야 하는가? %d%n", sameThreeBirthCount());
        System.out.printf("365명을 무작위로 선택한다고 가정하자. 그들은 다른 생일들을 얼마나 가질 것인가? %d%n", differentBirthCount());
        System.out.printf("한 해의 365일 각각마다 생일이 있는 사람을 적어도 한 명 찾으려면 얼마나 많은 다른 사람을 확인해야 하는가? %d%n", eachBirthCount());
    }

    private static int sameThreeBirthCount() {
        int count = 0;
        int[] personArr = new int[366];
        while (true) {
            int personBirthday = new Person().getBirthDate();
            personArr[personBirthday] += 1;
            count++;
            if (personArr[personBirthday] == 3) {
                break;
            }
        }
        return count;
    }

    private static int differentBirthCount() {
        PersonSet personSet = new PersonSet();
        for (int i = 0; i < 365; i++) {
            personSet.add(new Person());
        }
        return personSet.size();
    }

    private static int eachBirthCount() {
        PersonSet personSet = new PersonSet();
        int count = 0;
        while (personSet.size() != 365) {
            count++;
            personSet.add(new Person());
        }
        return count;
    }
}
class Person {
    private final int birthDate;

    public Person() {
        this.birthDate = randomDate();
    }

    private int randomDate() {
        Random random = new Random();
        return random.nextInt(365) + 1;
    }

    public int getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Person)) {
            return false;
        }
        Person person = (Person) object;
        return person.birthDate == this.birthDate;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(birthDate);
    }
}
class PersonSet {
    private final Set<Person> personSet;

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
