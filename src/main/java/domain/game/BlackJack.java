package domain.game;

import domain.card.Card;
import domain.user.Dealer;
import domain.user.Player;
import sources.BlackJackPlayingSource;

import java.util.List;

public class BlackJack {
	private List<Card> cardDeck;
	private List<Player> players;
	private Dealer dealer;

	public BlackJack(List<Card> cardDeck, List<Player> players) {
		this.cardDeck = cardDeck;
		this.players = players;
		this.dealer = new Dealer();
	}

	private void drawFromCardDeck() {
		for ( Player player : this.players ) {
			player.addCard(BlackJackPlayingSource.popRandomCard(this.cardDeck));
		}
		dealer.addCard(BlackJackPlayingSource.popRandomCard(this.cardDeck));
	}
}
