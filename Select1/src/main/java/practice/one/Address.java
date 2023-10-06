package practice.one;

public class Address {
    private String name;
    private String phoneNumber;
    private String company;

    public static class Builder {
        private String name;
        private String phoneNumber;
        private String company = "없음";

        public Builder(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public Builder setCompany(String val) {
            company = val;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    private Address(Builder builder) {
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.company = builder.company;
    }

    public String toString() {
        return String.format("이름 : %s, 전화번호 : %s, 회사 : %s", this.name, this.phoneNumber, this.company);
    }
}
