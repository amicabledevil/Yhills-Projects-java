package com.carddeck;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        // Define color ordering: HEART, DIAMOND (red) < SPADE, CLUB (black)
        int colorCompare = Integer.compare(
            (c1.getSuit() == Card.Suit.HEART || c1.getSuit() == Card.Suit.DIAMOND) ? 1 : 0,
            (c2.getSuit() == Card.Suit.HEART || c2.getSuit() == Card.Suit.DIAMOND) ? 1 : 0
        );
        if (colorCompare != 0) {
            return colorCompare;
        }

        // Compare by suit
        int suitCompare = c1.getSuit().compareTo(c2.getSuit());
        if (suitCompare != 0) {
            return suitCompare;
        }

        // Compare by rank
        return c1.getRank().compareTo(c2.getRank());
    }
}
