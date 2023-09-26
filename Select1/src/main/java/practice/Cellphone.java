package practice;

class Cellphone {
    public Message[] messages;
    private ConvertMessage convert;

    public Cellphone() {
        settingConvertMessage();
        this.messages = message();
    }

    public Message[] message() {
        this.messages = new Message[3];

        String[] sender = {"James", "July", "Tom"};
        String[] senderNumber = {"010-1234-5678", "010-5432-11234", "010-3546-9434"};
        String[] messageText = {"OMG, what are you doing?", "I'm genius", "Hello"};

        for (int i = 0; i < 3; i++) {
            this.messages[i] = new Message(sender[i], senderNumber[i], autoComplete(messageText[i]));
        }
        return messages;
    }

    //자동완성 기본값 세팅
    public void settingConvertMessage() {
        this.convert = new ConvertMessage();
        this.convert.setInitial("r u", "are you");
        this.convert.setInitial("OMG", "Oh my god");
        this.convert.setInitial("WTH", "What the hell");
    }

    //축약어 -> 실제 문장 자동완성
    public String autoComplete(String messageText) {
        String result = messageText;



        return result;
    }
}
