package unit.seven;

public class Apartment {
    private int size;
    private String address;
    private String[] name = new String[10];

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
    }
    public int getSize() {
        return size;
    }
    public String getAddress() {
        return address;
    }
    public int numPeople() {
        int num = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                num++;
            }
        }
        return num;
    }
    public void addPeople(String name) {
        for (int i = 0; i < this.name.length; i++) {
            if (this.name[i] == null) {
                this.name[i] = name;
                break;
            }
        }
        System.out.println("빈자리가 없습니다.");
    }
    public String getName(int i) {
        if (i >= name.length) {
            return null;
        }
        return this.name[i];
    }
    public void daiPeople(int i) {
        if (i >= name.length) {
            return;
        }
        if (name[i] == null) {
            return;
        } else {
            name[i] = null;
            for (int j = i ;j < name.length - 1; j++) {
                name[i] = name[i+1];
            }
        }
    }
    public String toString() {
        String people = name[0];
        for (int i = 1; i < name.length; i++) {
            if (name[i] == null) {
                break;
            }
            people = people + ", " + name[i];
        }
        return "주소 : "+this.address+" 집 크기 : "+this.size+" 입주자 : "+people;
    }
}

