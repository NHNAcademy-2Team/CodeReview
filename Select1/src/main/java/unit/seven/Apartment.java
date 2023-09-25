package unit.seven;

/*  아파트의 제곱미터를 나타내는 정수, 주소, 아파트에 거주하는 최대 10명의 이름 목록 등의
 *   정보를 객체가 유지
 *   아파트에 살고 있는 각 사람은 0과 현재 아파트에 살고 있는 사람 수에서 1을 뺀
 *   숫자 사이의 연관 숫자를 갖는다.
 *
 *   1. 크기와 주소를 취하고 처음엔 비어 있는 아파트를 생성하는 생성자
 *   2. 아파트의 크기를 반환하는 메소드
 *   3. 아파트 주소를 반환하는 메소드
 *   4. 현재 아파트에 살고 있는 사람의 수를 반환하는 메소드
 *   5. 사람의 이름을 매개변수로 취하고 그 사람을 아파트에 사는 사람으로 추가하는 방법
 *       - 아직 공간이 남아 있으면 그 사람에게 다음 사용 가능한 번호 할당
 *       - 꽉 찼다면 메소드는 아무 작업도 수행 x
 *   6. 음이 아닌 정수를 매개변수로 취하고 해당 숫자와 연관되어 있으면 아파트에 살고 있는
 *      사람의 이름 반환하는 메소드
 *       - 숫자가 아파트에 거주하는 사람 수보다 크거나 같으면 null 반환
 *   7. 음이 아닌 정수를 매개변수로 취하고 아파트에서 해당 번호와 견관된 사람을 제거하는 방법
 *       - 다음의 모든 사람과 관련된 수는 1명 씩 감소되어야 함
 *       - 숫자가 아파트에 사는 사람 수보다 크거나 같으면 메소드는 아무 작업 수행 x
 *   8. tostring 재정의하고 아파트에 대한 모든 정보가 포함된 문자열 반환 */

public class Apartment {
    private int squareMeters;
    private String address;
    private String[] apartments;

    public Apartment(int squareMeters, String address) {
        this.squareMeters = squareMeters;
        this.address = address;
        this.apartments = new String[10];
    }

    public int getSquareMeters() {
        return this.squareMeters;
    }

    public String getAddress() {
        return this.address;
    }

    public int countLivingPerson() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (apartments[i] != null) {
                num++;
            }
        }
        return num;
    }

    public void setApartment(String name) {
        for (int i = 0; i < 10; i++) {
            if (apartments[i] == null) {
                apartments[i] = name;
            }
            break;
        }
    }

    public String getApartment(int slot) {
        if (slot < 0) {
            System.out.println("음이 아닌 정수를 입력하세요.");
        } else if (slot >= 10) {
            return null;
        }
        return apartments[slot];
    }

    public void removeApartment(int slot) {
        if (slot < 0) {
            System.out.println("음이 아닌 정수를 입력하세요.");
        } else if (slot >= 10) {
            System.out.println("없는 번호의 자리입니다.");
        } else
            apartments[slot] = null;
    }


    public void reorganizeApartments() {
        int empty = -1;
        for (int i = 0; i < 10; i++) {
            if (apartments[i] == null && empty == -1)
                empty = i;
            if (apartments[i] != null && empty != -1) {
                apartments[empty] = apartments[i];
                apartments[i] = null;
                empty++;
            }
        }
    }

    public String toString() {
        String ris = "";
        ris += "아파트 크기: " + this.squareMeters + " " + "주소: " + this.address;
        for (int i = 0; i < 10; i++) {
            if (apartments[i] != null)
                ris += "\nApartment " + i + ": " + apartments[i];
        }
        return ris;
    }
}

