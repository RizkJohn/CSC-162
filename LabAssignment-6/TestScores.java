package labAssignment_6;
import java.util.*;
import java.util.ArrayList;

public class TestScores {
	
	public double[] testScores;
	
	public TestScores(double[] s) {
		testScores = s;
		/*checks if the test score is in the valid range*
		 if the score is invalid, it is put in IllegalArgumentException*/
		for (int i = 0; i < testScores.length; i++) {
			if (testScores[i] < 0 | testScores[i] > 100) {
				throw new IllegalArgumentException("Element: " + i + " Score: " + testScores[i]);
			}
		}
	}
	//calculates the average of the valid test scores
	public double getAverage() {
		double avg = 0;
		
		for (int i = 0; i < testScores.length; i++) {
			avg += testScores[i];
		}
		avg /= testScores.length;
		return avg;
	}

}
