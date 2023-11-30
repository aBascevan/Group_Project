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

/**
 * The Player class represents a player in the War card game.
 * It includes the player's name and the number of wins they have achieved.
 */
public class Player {

    private String playerName;// The players name
    private int playerWins;// The players total wins

    /**
     * Constructs a new player with the specified name and initializes their win count to zero.
     *
     * @param playerName The name of the player.
     */
    public Player(String playerName) {
        this.playerName = playerName;
        this.playerWins = 0;
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Gets the number of wins achieved by the player.
     *
     * @return The number of wins.
     */
    public int getPlayerWins() {
        return playerWins;
    }

    /**
     * Increments the player's win count by one.
     */
    public void incrementPlayerWins() {
        playerWins++;
    }

    /**
     * Resets the player's win count to zero.
     */
    public void resetPlayerWins() {
        playerWins = 0;
    }

} // end of Player class
