package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * 게임 참여자를h 의미하는 객체
 */
public class Player {
	private final String name;
	private final double bettingMoney;
	private final List<Card> cards = new ArrayList<>();

	public Player(String name, double bettingMoney) {
		this.name = name;
		this.bettingMoney = bettingMoney;
	}

	public String getName() {
		return name;
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public void showHand() {
		String showHand = this.name;
		for (Card card : this.cards) {
			showHand += card.toString() + ",";
		}
		System.out.println(showHand);
	}

	public Boolean isBusted() {
		final int BUSTED = 21;
		int score = 0;

		for (Card card : this.cards) {
			score += card.getSymbolScore();
		}
		if (score > BUSTED) {
			return true;
		}
		return false;
	}
}
