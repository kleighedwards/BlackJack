package blackjack;

import java.util.Scanner;

public class GameLogic {
	Scanner keyboard = new Scanner(System.in);
	int choice;

	Deck deck;
	Hand playerHand;
	Hand dealerHand;
	
	boolean winner;

	public GameLogic(Deck deck) 
	{
		this.deck = deck;
		playerHand = new Hand(deck);
		dealerHand = new Hand(deck);
	}
	
	public void doGame() {
		
		System.out.println("**************************");
		System.out.println("*                        *");
		System.out.println("*       BLACKJACK        *");
		System.out.println("*                        *");
		System.out.println("*     *INITIAL DEAL*     *");
		System.out.println("*                        *");
		System.out.println("**************************");
		
		playerHand.add(deck.dealCard());
		playerHand.add(deck.dealCard());
		System.out.println("Player Hand:");
		playerHand.getCardsInHand();
		System.out.println("\nPlayer Hand Value:\n" + playerHand.getValueOfHand());

		dealerHand.add(deck.dealCard());
		dealerHand.add(deck.dealCard());
		System.out.println("\nDealer Hand:");
		dealerHand.getCardsInHand();
		System.out.println("\nDealer Hand Value:\n" + dealerHand.getValueOfHand());
		
		calcWinner();
		
		if (winner == true)
		{
			System.exit(0);
		}
		
		do {

			System.out.println("**************************");
			System.out.println("*                        *");
			System.out.println("*       BLACKJACK        *");
			System.out.println("*                        *");
			System.out.println("*    1) HIT              *");
			System.out.println("*                        *");
			System.out.println("*    2) STAY             *");
			System.out.println("*                        *");
			System.out.println("**************************");

			choice = keyboard.nextInt();
			
			
			if (choice == 1)
			{
				playerHand.add(deck.dealCard());
				System.out.println("Player Hand:");
				playerHand.getCardsInHand();
				System.out.println("\nPlayer Hand Value:\n" + playerHand.getValueOfHand());
				
				calcWinner();
			}
			
			if (choice == 2)
			{
				while (dealerHand.getValueOfHand() < 17)
				{
					dealerHand.add(deck.dealCard());
					System.out.println("\nDealer Hand:");
					dealerHand.getCardsInHand();
					System.out.println("\nDealer Hand Value:\n" + dealerHand.getValueOfHand());
				}
				calcWinner();
				
				if (dealerHand.getValueOfHand() >= 17 && winner == false)
				{
					calcWinner();
				}
			}
			

		} while (winner == false);
	}
	
	void calcWinner()
	{
		if (dealerHand.getValueOfHand() > 21)
		{
			System.out.println("Dealer Busts! Player Wins!");
			winner = true;
		}
		
		else if (playerHand.getValueOfHand() > 21)
		{
			System.out.println("Player Busts! Dealer Wins!");
			winner = true;
		}
		
		else if (dealerHand.getValueOfHand() == 21)
		{
			System.out.println("BlackJack! Dealer Wins!");
			winner = true;
		}
		
		else if (playerHand.getValueOfHand() == 21)
		{
			System.out.println("BlackJack! Player Wins!");
			winner = true;
		}
		
		else if (playerHand.size() == 5)
		{
			System.out.println("Player Wins! (Five Card Rule)");
			winner = true;
		}
		
		else if (playerHand.getValueOfHand() < dealerHand.getValueOfHand() && choice == 2)
		{
			System.out.println("Dealer Wins!");
			winner = true;
		}
		
		else if (playerHand.getValueOfHand() > dealerHand.getValueOfHand() && choice == 2)
		{
			System.out.println("Player Wins!");
			winner = true;
		}
		
		else if (playerHand.getValueOfHand() == dealerHand.getValueOfHand() && choice == 2)
		{
			System.out.println("It's a Draw!");
			winner = true;
		}
	}
}
