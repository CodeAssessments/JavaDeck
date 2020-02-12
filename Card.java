public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString(){
        return this.rank +" of "+this.suit;
    }

    @Override
    public boolean equals(Object compareCard) {
        String rank = ((Card)compareCard).getRank();
        String suit = ((Card)compareCard).getSuit();

        return(this.rank.equals(rank) && this.suit.equals(suit));
    }
}
