package unit.seven;

public class Apartment {
    private int size;
    private String address;
    private String[] persons;
    private int peopleNum;

    public Apartment(int size, String address) {
        this.size = size * size;
        this.address = address;
        this.persons = new String[10];
        this.peopleNum = 0;
    }

    public int getSize() {
        return this.size;
    }

    public String getAddress() {
        return this.address;
    }

    public int getNumberOfPeople() {
        return this.peopleNum;
    }

    public String getPerson(int num) {
        if (num >= 0 && this.peopleNum > num) {
            return persons[num];
        }
        return null;
    }

    public void addPerson(String name) {
        if (peopleNum != 10) {
            persons[peopleNum++] = name;
        }
    }

    public void removePerson(int num) {
        if (num >= 0 && this.peopleNum > num) {
            this.persons[peopleNum--] = null;

            for (int i = num; i < peopleNum; i++) {
                this.persons[i] = this.persons[i + 1];
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (String person : this.persons) {
            if (person == (null)) {
                break;
            }
            sb.append(person + ", ");
        }

        return "[ APARTMENT ]\n" + "Address: " + getAddress()
                + "\nSize Of Apartment: " + getSize() + "\nPeople Num: "
                + getNumberOfPeople() + "\nLiving People List: " + sb.toString();
    }
}
