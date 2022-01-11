package labAssignment_6;

public class InvalidTestScore {
	public static void main(String[] args) {
		/*list of different Score arrays to test every scenario*/
        double[] Scores = {97.5, 66.7, 88.0, 100.0, 99.0};
		//double[] Scores = {97.5, 66.7, 88.0, 101.0, 99.0};
		//double[] Scores = {97.5, 99.7};
		//double[] Scores = {97.5, -10};	

		//TestScores object initialized with Scores.
		try {
			TestScores i = new TestScores(Scores);
			System.out.println("The average of the scores is " + i.getAverage());
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid score found.\n" + e.getMessage());
		}

	}

}
