import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private ArrayList<Card> drawnCards;

    public Deck() {
        cards = new ArrayList<>();
        drawnCards = new ArrayList<>();
        String[] suits = {"tréboles", "corazones", "picas", "diamantes"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String suit : suits) {
            for (String value : values) {
                String color = (suit.equals("corazones") || suit.equals("diamantes")) ? "rojo" : "negro";
                cards.add(new Card(suit, color, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("a. shuffle:");
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            drawnCards.add(card);
            System.out.println("b. head:");
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void pick() {
        if (!cards.isEmpty()) {
            Random rand = new Random();
            int index = rand.nextInt(cards.size());
            Card card = cards.remove(index);
            drawnCards.add(card);
            System.out.println("c. pick:");
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void hand() {
        System.out.println("d. hand:");
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                drawnCards.add(card);
                System.out.println(card);
            }
            System.out.println("Quedan " + cards.size());
        } else {
            System.out.println("No hay suficientes cartas en el deck.");
        }
    }
}