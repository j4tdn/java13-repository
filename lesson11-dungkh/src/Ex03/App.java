package Ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Card> cards = create();

        distributeCard(cards);
    }

    private static List<Card> create() {
        List<Card> cards = new ArrayList<>();
        String[] types = { "co", "ro", "chuon", "bich" };
        String[] orders = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

        for (String order : orders) {
            for (String type : types) {
                cards.add(new Card(type, order));
            }
        }
        Collections.shuffle(cards);
        return cards;
    }

    private static void distributeCard(List<Card> cards) {
        List<Card> cardsOfPlayer1 = new ArrayList<>();
        List<Card> cardsOfPlayer2 = new ArrayList<>();
        List<Card> cardsOfPlayer3 = new ArrayList<>();
        List<Card> cardsOfPlayer4 = new ArrayList<>();

        for (int i = 0; i < cards.size(); i++) {
            if (i % 4 == 0) {
                cardsOfPlayer1.add(cards.get(i));
            }
            if (i % 4 == 1) {
                cardsOfPlayer2.add(cards.get(i));
            }
            if (i % 4 == 2) {
                cardsOfPlayer3.add(cards.get(i));
            }
            if (i % 4 == 3) {
                cardsOfPlayer4.add(cards.get(i));
            }
        }
        System.out.println("=======PLAYER1==========");
        show(cardsOfPlayer1);
        System.out.println("=======PLAYER2==========");
        show(cardsOfPlayer2);
        System.out.println("=======PLAYER3==========");
        show(cardsOfPlayer3);
        System.out.println("=======PLAYER4==========");
        show(cardsOfPlayer4);
    }

    private static void show(List<Card> cards) {
        cards.forEach(System.out::println);
    }
}
