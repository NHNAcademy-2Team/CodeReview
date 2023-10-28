package chapter.three.exercise7;

import java.util.Objects;
import java.util.Random;

public class Person {
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
