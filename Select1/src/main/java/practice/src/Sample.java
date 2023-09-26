public class Sample {
    public static void main(String[] args) {
        Cellphone taehee = new Cellphone("taehee", "010-1234-1234");

        taehee.setAddressbook("suyeon", "010-3333-3333", "nhnacademy");
        taehee.setAddressbook("jinyoung", "010-5678-5678", "nhnacademy");

        Cellphone jinyoung = new Cellphone("jinyoung", "010-5678-5678");

        jinyoung.setAddressbook("taehee", "010-1234-1234", "chosun");
        jinyoung.setAddressbook("suyeon", "010-3333-3333", "nhnacademy");

        taehee.send("Are you free this weekend?", jinyoung);
        jinyoung.receive(taehee);

        jinyoung.send("No, I'm not. But I'm free next weekend.", taehee);
        taehee.receive(jinyoung);

    }
}
