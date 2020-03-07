

public class ShuffleCards{
     int Sp = 0; // spades
     int Di = 0; // diamonds
    int He = 0; // hearts
    int Cl = 0; // clubs

     public static void main(String []args){
       
        int numberOfCardsDrawn = 12;
       
        int[] deckOfCards =  cardShuffle(); // shuffle cards
        int[] drawCardsFromDeck = drawCards(deckOfCards, numberOfCardsDrawn); // draw cards
       
        for (int i = 0; i <drawCardsFromDeck.length ; i++) {
            System.out.print(drawCardsFromDeck[i] + " ");
        }
       
     }
     
   
    public static int[] drawCards(int[] deckOfCards,int numberOfCardsDrawn) {
        int[] drawnCards = new int[numberOfCardsDrawn];
        for (int l = 0; l < numberOfCardsDrawn; l++)
        drawnCards[l] = deckOfCards[l];
        return drawnCards;
           
    }

    public static int[] cardShuffle() {

            // create a deck of 52 cards
        int[] suit = {0, 1, 2, 3};
        int[] rank = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12
        };
        int SUITS = suit.length;
        int RANKS = rank.length;

        int N = 52;
        int M = 12;

        int[] deck = new int[N];
        // initialize deck
        for (int j = 0; j < SUITS; j++)

            for (int i = 0; i < RANKS; i++)
              deck[SUITS * i + j] = rank[i] + suit[j] * 13;

        // create random 5 cards
        for (int i = 0; i < M; i++) {
            int r = i + (int) (Math.random() * (N - i));
            //String t = deck[r];
            int t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;

        }
       

        return deck;

    }
}