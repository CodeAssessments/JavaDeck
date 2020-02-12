import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    //private final String[] SUITS = {"Hearts", "Spades", "Clubs", "Diamonds"};
    //private final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    @org.junit.jupiter.api.Test
    void addCardsToDeck() {
        Deck testDeck = new Deck();
        assertEquals(52, testDeck.getNrOfCardsInDeck());
        testDeck.addCardsToDeck();
        assertEquals(104, testDeck.getNrOfCardsInDeck());
    }

    @org.junit.jupiter.api.Test
    void pullCard() {
        Deck testDeck = new Deck();
        testDeck.pullCard();
        assertEquals(52-1, testDeck.getNrOfCardsInDeck());
        for(int i = 0; i< 50; i++){
            testDeck.pullCard();
        }
        assertEquals(1, testDeck.getNrOfCardsInDeck());
        testDeck.pullCard();
        assertEquals(0, testDeck.getNrOfCardsInDeck());
        testDeck.pullCard();
        assertEquals(0, testDeck.getNrOfCardsInDeck());
    }

    @org.junit.jupiter.api.Test
    void pullCards() {
        Deck testDeck = new Deck();
        testDeck.pullCards(14);
        assertEquals(52-14, testDeck.getNrOfCardsInDeck());
        testDeck.pullCards(52);
        assertEquals(52-14, testDeck.getNrOfCardsInDeck());
        testDeck.pullCards(52-14);
        assertEquals(0, testDeck.getNrOfCardsInDeck());
        testDeck.pullCards(1);
        assertEquals(0, testDeck.getNrOfCardsInDeck());
    }


    @org.junit.jupiter.api.Test
    void mixDeck() {
        Deck testDeck = new Deck();
        Deck compareDeck = new Deck();
        assertTrue(testDeck.equals(compareDeck));
        testDeck.mixDeck();
        assertFalse(testDeck.equals(compareDeck));
    }

    @org.junit.jupiter.api.Test
    void sortDeck() {
        Deck testDeck = new Deck();
        Deck compareDeck = new Deck();
        assertTrue(testDeck.equals(compareDeck));
        testDeck.sortDeck();
        assertFalse(testDeck.equals(compareDeck));
    }
}