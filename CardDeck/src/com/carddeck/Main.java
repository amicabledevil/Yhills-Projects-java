package com.carddeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        // Draw 20 random cards
        List<Card> drawnCards = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            drawnCards.add(deck.draw());
        }

        // Print unsorted cards
        System.out.println("Unsorted Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }

        // Sort cards
        Collections.sort(drawnCards, new CardComparator());

        // Print sorted cards
        System.out.println("\nSorted Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }
    }
}
