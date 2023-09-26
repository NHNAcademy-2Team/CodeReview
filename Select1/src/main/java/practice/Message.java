package practice;

class Message {
    public String sender;
    public String senderNumber;
    public String messageText;

    public Message(String sender, String senderNumber, String messageText) {
        this.sender = sender;
        this.senderNumber = substractDash(senderNumber);
        this.messageText = messageText;
    }

    public String substractDash(String senderNumber) {
//        return senderNumber.replaceAll("-", "");

        int index = senderNumber.indexOf("-");
        StringBuilder sb = new StringBuilder();
        sb.append(senderNumber.substring(0, 3));    //010

        int index2 = senderNumber.indexOf("-", index + 1);

        sb.append(senderNumber.substring(index + 1, index2));
        sb.append(senderNumber.substring(index2 + 1));

        return sb.toString();
    }


}
