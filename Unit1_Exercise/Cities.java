public enum Cities {

    서울("02"),
    대전("042"),
    대구("053"),
    광주("062"),
    부산("051"),
    인천("032"),
    울산("052");

    public final String cityNum;
    // static Cities[] cities = values();   기본 제공 메소드

    private Cities(String cityNum) {
        this.cityNum = cityNum;
    }

    public String getNum() {
        return this.cityNum;
    }

    
    
}
