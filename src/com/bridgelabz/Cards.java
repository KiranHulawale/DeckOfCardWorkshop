package com.bridgelabz;

public class Cards {
    String [] deck = new String[52];
    //int count = 0;
    private int distributed_cards = 52;
    String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack"
            , "Queen", "King", "Ace"};

    String [] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};


    public void display() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = suit[i / 13] + " " +rank[i % 13];
            System.out.println(deck[i]);
            System.out.println("Distributed cards: " + distributed_cards);
        }
        }
    }


