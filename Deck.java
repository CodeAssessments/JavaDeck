import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Deck {

    private final String[] SUITS = {"Hearts", "Spades", "Clubs", "Diamonds"};
    //private enum SUITS {Hearts, Spades, Clubs, Diamonds};
    //private int suitLength = SUITS.values().length;
    private final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private ArrayList<Card> cardsInDeck;

    public Deck() {
        this.cardsInDeck = new ArrayList<>();
        addCardsToDeck();
    }

    public void addCardsToDeck(){
        for(int i = 0; i < SUITS.length; i++){
            for(int j = 0; j < RANKS.length; j++){
                cardsInDeck.add(new Card(RANKS[j], SUITS[i]));
            }
        }
    }

    public void mixDeck(){
        Collections.shuffle(cardsInDeck);
        System.out.println("\nCards in the deck have now been shuffled.");
    }

    public void sortDeck(){
        Collections.sort(cardsInDeck, DECK_ORDER);
        System.out.println("\nCards in the deck have now been sorted.");
    }

    private final Comparator<Card> DECK_ORDER = new Comparator<Card>() {
        @Override
        public int compare(Card card1, Card card2) {
            if (card1.getRank().equals(card2.getRank()))
                return Arrays.asList(SUITS).indexOf(card1.getSuit()) - Arrays.asList(SUITS).indexOf(card2.getSuit());
            return Arrays.asList(RANKS).indexOf(card1.getRank()) - Arrays.asList(RANKS).indexOf(card2.getRank());
        }
    };

    public void pullCard(){
        if(!cardsInDeck.isEmpty()) {
            Card pulledCard = cardsInDeck.remove(0);
            System.out.println(pulledCard + " has been pulled from the deck");
        }else{
            System.out.println("\nThere are no more cards in the deck.");
        }
    }

    public void pullCards(int nrOfCards){
        if(nrOfCards <= cardsInDeck.size()){
            for(int i = 0; i<nrOfCards;i++)
                pullCard();
        }else{
            System.out.println("\nThere are only "+cardsInDeck.size()+" cards in the deck and you are trying to pull "+nrOfCards);
        }
    }

    public void printDeck(){
        System.out.println("\nThere is currently "+cardsInDeck.size()+" cards in the deck");
        if(cardsInDeck.size() > 0)
            System.out.println(cardsInDeck);
    }

    public int getNrOfCardsInDeck(){
        return cardsInDeck.size();
    }

    public Card getCard(int i){
        return cardsInDeck.get(i);
    }

    @Override
    public boolean equals(Object compareDeck){
        for(int i = 0; i < ((Deck)compareDeck).getNrOfCardsInDeck(); i++){
            if(!this.getCard(i).equals(((Deck)compareDeck).getCard(i)))
                return false;
        }
        return true;
    }
}

