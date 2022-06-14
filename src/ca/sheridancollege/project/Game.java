/**
 * SYST 17796 Group 6 Project Base code.
 * @author Varvara Lyakisheva
 * @author Ahmed Raza Hanif
 * @author Ryan Abela-Nijjar
 * @author Jeffrey Logue
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * FOR BASE GAME
 * 
 * Card class
 * Description: 
 * It is a base class for the project. Uses the default modifier for the children classes and method toString(), 
 * which returns the String representation of the card  
 * 
 * Game class
 * Description:
 * Class that models the game and starts it. 
 * Firstly, it declares the name of the game, that cannot be changed, used with the constructor getName. 
 * The class imports and uses the Array List to create a list of players. 
 * To declare it, method SetPlayers must be used.
 * To launch the game method, play() is used. 
 * When the winner is determined and the game is finished, constructor declareWinner() is used to define the winning player.
 * 
 * GroupOfCard class
 * Description: 
 * Class that is responsible for the grouping of the cards for the game, by creating an ArrayList named “cards”.  
 * With the method GroupOfCards, that takes an integer “Size” as a parameter, it declares the size of the group of the cards. 
 * Cards get shuffled(randomized) with the method Shuffle(). Method getSize() returns an integer as size of the cards. 
 * This variable is later used in the method setSize() to declare the maximum size of the hand of the cards.
 * 
 * Player class
 * Description: 
 * The class that creates the player for the game. Each player must have a unique identifier.
 * Constructor Player with the string parameter name, that was declared earlier is used to identify Player’s name. 
 * Method getName returns string with the name of the player. Constructor setName is ensures that the name of the player is unique.
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class
