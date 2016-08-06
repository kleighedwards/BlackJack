package blackjack;


public class Game 
{
	public static void main(String[] args) 
	{
		Deck deck = new Deck();
		GameLogic newGame = new GameLogic(deck);
		newGame.doGame();
	}
}
