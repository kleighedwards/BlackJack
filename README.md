# Skill Distillery Week 3 Project

## BlackJack - Getting More Familiar with Object Oriented Programming

Navigate to the "Game" class to run the game. Upon starting a new game, the 
Player and the Dealer are dealt two cards and are shown which cards they were dealt
and their corresponding values. Afterwards, the program will check for a winner 
(see if either party managed to score 21 points).

If both parties are under the 21 point threshold, the Player 
will be shown a menu prompting them to select 1 to "Hit" (add another card 
to their hand) or to select 2 to "Stay" (stop adding cards to their hand).

Once the Player chooses to Stay, the Dealer will then Hit until they've reached
17 points (at which point they will Stay and a winner will be calculated) or
they "Bust" and go over the 21 point threshold resulting in a Player win.

A tie is also possible if both the Dealer and Player manage to have the 
same score.

There is an additional win condition for the player. If they have 5 cards
in their hand (and have yet to Bust), they will win by default.

I have numerous classes in this program.

The "Card" class, holds all the necessary values a card should have, including
the "Rank" (face value) and the "Suit" of the card. I have also included a 
HashMap linking the Rank of the cards to the numeric values the cards would
have in a game of BlackJack.

The "Deck" class holds an ArrayList of Cards. Once a deck is created, a method
is called to populate the deck (loop through the Card Array) and another method
is called to shuffle the deck.

The "Hand" class also holds an ArrayList of Cards, but only the cards the Player
and the Dealer have been dealt. There are methods within this class which will
add cards to either party's hand and other methods to calculate their scores.
One method checks to see if a hand has an Ace in it (as Aces can either have a 
value of 1 or 11 in a game of BlackJack). If the Player or the Dealer would bust
with an Ace value of 11, the Ace value will be altered to 1. 

The "Game Logic" class holds the majority of the logic for the game. It also
has a method to calculate a winner based on the numerous win/loss conditions
possible in the game.

