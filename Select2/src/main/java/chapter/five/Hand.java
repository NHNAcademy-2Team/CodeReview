package chapter.five;

public class Hand {

    private int cardCount;

    public Hand() {
        cardCount = 0;
    }

    public Card getCard(int index) {
        return new Card();
    }

    public int getCardCount() {
        return this.cardCount;
    }
}
