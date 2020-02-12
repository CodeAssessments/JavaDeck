//for testing purposes
public class Main {

    public static void main(String[] args) {
        Deck theDeck = new Deck();
        theDeck.printDeck();
        Deck compareDeck = new Deck();
        Card c1 = theDeck.getCard(0);
        Card c2 = theDeck.getCard(0);
        System.out.println(c1.equals(c2));
        theDeck.mixDeck();
        c1 = theDeck.getCard(0);
        System.out.println(c1.equals(c2));
        //assertEquals(c1, c2);
        /*theDeck.addCardsToDeck();
        theDeck.printDeck();
        theDeck.printDeck();

        theDeck.mixDeck();
        theDeck.printDeck();

        theDeck.pullCard();
        theDeck.printDeck();
        theDeck.pullCards(3);
        theDeck.printDeck();

        theDeck.sortDeck();
        theDeck.printDeck();

        theDeck.pullCards(101);
        theDeck.printDeck();
        theDeck.pullCards(100);
        theDeck.printDeck();
        theDeck.pullCard();
        theDeck.printDeck();

        theDeck.sortDeck();*/
    }

}
