/**
 * SYST 17796 Group 6 Project Base code.
 * @author Varvara Lyakisheva
 * @author Ahmed Raza Hanif
 * @author Ryan Abela-Nijjar
 * @author Jeffrey Logue
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * 
 * Chosen game for the project: UNO
 * Game Description
 * The game chosen for our project is Uno. 
 * The number of players that can play the game is 2 – 10. 
 * The objective of the game is to be the first player to score 500 points, making that player the winner for the game. 
 * To start the game a dealer must be chosen between the players, the dealer then deals each player 7 cards, the leftover cards will be put face down forming a draw pile. 
 * Use the top card of the draw pile to begin a discard pile, this card will be used to start the game.
 * 
 * Draw 2 Card
 * When this is played, the next player must draw two cards and forfeit their turn. 
 * If used to start the game the first player will draw two cards. This card can only be played on a matching color, or another draw 2 card.
 * 
 * Reverse Card
 * This card switches the direction of play. Play to the left is now switched to the right, and vice versa.
 * If used to start the game, the direction of play is switched to the right, this will continue until another reverse card is played. 
 * This card can only be played on a matching color, or another reverse card.
 * 
 * Skip Card
 * The next player to play after this card is skipped, losing their turn. If used to start the game, the first player is skipped. 
 * This card can only be played on a matching color, or another skip card.
 * 
 * Wild Card
 * This card can be played at anytime, even if you have another playable card in hand. This card changes the color that continues play, any color can be chosen. 
 * If used to start the game, the player to the left of the dealer chooses the color to start with and plays the first card.
 * 
 * Wild Draw 4 Card
 * When this card is played, it allows you to choose the next color played (Same as the wild card), and the next player must take 4 cards from the draw pile and forfeit their turn. 
 * However, this card can only be played if the player does not have a card matching the color of the previously played card. 
 * If used to start the game, return this card to the draw pile, and pick another card from the draw pile.
 * 
 * How to Play
 * The player to the left of the dealer will play first. The direction of play will be to the left to start. 
 * When playing a card it must match the top card on the discard pile, whether it be the color, number, or word. 
 * If you do not have any card that can be played, you must draw a card from the draw card, if you can play the card that is drawn then you can play it. 
 * Otherwise, the turn moves to the next player. Before your next to last card is played you must say “UNO”, 
 * if you do not say it and another player catches you with only a single card in your hand before the next player has begun their turn, four cards must be picked from the draw pile. 
 * If you are not caught before the next player has either played a card or drawn a card from the draw pile, the player does not have to draw 4 cards. 
 * The hand ends once a player plays their last card, after which points are tallied. Until a player reaches 500 points, the game starts over again.
 * 
 * How to Score
 * The first player with no cards left in their hand, will get points based off the cards left in the other player's hands. 
 * Each card is worth the following:
 *  Number Cards (0 - 9): Face Value
 *  Draw 2: 20 Points
 *  Reverse: 20 Points
 *  Skip: 20 Points
 *  Wild: 50 Points
 *  Wild Draw 4: 50 Points
 * 
 * Design Choices
 * 
 * The following should be implemented into the base code:
 *  Ability for the program to calculate and keep track of the score for each player
 *  Ability for the program to determine the winner of the game
 *  Ability for the program to determine the end of each hand
 *  Ability for the player to which card to play
 *  Ability for the program to stop each player from playing a card or performing an action that would be against the rules of the game (ex. The player trying to play a card that does not match the color, number or word of the previous card played)
 *  Ability for the player to take cards from the draw pile (depending on the situation)
 *
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

}
