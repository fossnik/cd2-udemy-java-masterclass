public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tin", 500);
        System.out.printf("New score is %s\n", newScore);
        calculateScore(275);
        calculateScore();
    }

    private static int calculateScore(String playerName, int score) {
        System.out.printf("Player %s scored %s points\n", playerName, score);
        return score * 1000;
    }

    private static void calculateScore(int score) {
        System.out.printf("Unnamed scored %s points\n", score);
	}

    public static void calculateScore() {
        System.out.println("No player name, no player score.");
    }
}
