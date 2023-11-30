/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

/**
 * SYST 17796 Group Project
 * 
 * Authors:
 * Student: Alexander Bascevan ID:991566471
 * Student: Joyce Sabrina Oliveira de Andrade ID:991698183
 * Student: Jon Paul Cortez    ID:991110970
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * The Deck class represents a deck of playing cards.
 * It contains methods for initializing and shuffling the deck.
 */
public class Deck {

    private ArrayList<Card> deck;

    /**
     * Constructs a new deck of cards, initializes it, and shuffles the cards.
     */
    public Deck() {
        initializeDeck();
        shuffleDeck();
    }

    /**
     * Initializes the deck by creating cards for each suit and rank.
     */
    private void initializeDeck() {
        deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }
    }

    /**
     * Shuffles the deck using the Collections.shuffle method.
     */
    private void shuffleDeck() {
        Collections.shuffle(deck);
    }

    /**
     * Gets a copy of the deck.
     *
     * @return A new ArrayList containing the cards in the deck.
     */
    public ArrayList<Card> getDeck() {
        return new ArrayList<>(deck);
    }

} // end of Deck class
