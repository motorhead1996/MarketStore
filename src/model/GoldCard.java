package model;

public class GoldCard extends Card {

	public GoldCard(String ownerName, double turnover) {
		super(ownerName, turnover);
	}

	@Override
	public double getDiscount() {
		double initial = 2.0;
		int reminder = (int) turnover / 100;

		while (reminder > 0) {

			if (initial == 10) {
				return initial;
			}

			initial += 1.0;
			reminder--;
		}

		return initial;
	}
}
