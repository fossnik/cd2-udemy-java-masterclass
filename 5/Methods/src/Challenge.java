public class Challenge {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		calculateScore(gameOver, score, levelCompleted, bonus);

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		calculateScore(gameOver, score, levelCompleted, bonus);

		displayHighScorePosition("Jake", calculateHighScorePosition(1500));

		System.out.printf("Score of 1500 is Position %s\n", calculateHighScorePosition(900));
		System.out.printf("Score of 400 is Positoin %s\n", calculateHighScorePosition(400));
		System.out.printf("Score of 50 is Position %s\n", calculateHighScorePosition(50));


	}

	private static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		}

		return -1;

	}

	private static void displayHighScorePosition(String pname, int position) {
		System.out.format("Player %s managed to get into position %s on the high score table\n", pname, position);
	}

	private static int calculateHighScorePosition(int score) {
		if (score > 1000)
			return 1;
		if (score > 500)
			return 2;
		if (score > 100)
			return 3;

		return 4;
	}

}
