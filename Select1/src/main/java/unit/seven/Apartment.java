package unit.seven;

import java.util.Arrays;

public class Apartment {
    /**Exercise 12
     * */
    private int size;
    private String address;
    private String[] people;
    private int count = 0;

    public Apartment(int size, String address){
        this.size = size;
        this.address = address;
        this.people = new String[10];
    }

    public String houseOwner(int n){
        if(n < 0){
            throw new IllegalArgumentException("음이 아닌 정수를 입력해주세요.");
        } else if(n >= 10){
            return null;
        } else {
            return people[n];
        }
    }

    public void removePeople(int n){
        if(n < count){
            for (int i = n; i < count - 1 ; i++) {
                people[n] = people[n+1];
            }
            count--;
            people[count] = null;
        }
    }

    public void setPeople(String name){
        if(count < 10){
            people[count] = name;
            count++;
        } else {
            System.out.println("아파트에 자리가 없습니다.");
        }
    }

    public int getSize(){
        return this.size;
    }

    public String getAddress(){
        return this.address;
    }

    public String[] getPeople(){
        return this.people;
    }

    public String toString(){
        return "아파트 주소 : " + getAddress() + "\n아파트 크기 : " + getSize() + "\n아파트 입주자 : " + Arrays.toString(getPeople());
    }
}
