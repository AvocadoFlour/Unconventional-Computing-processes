package fitness;

import org.jgap.IChromosome;
import chromosome.Crisscross;
import main.Main;

import org.jgap.*;

public class FitnessFunctionNRP extends FitnessFunction {

	public static final int CORRECT = 500;
	
	private static final long serialVersionUID = 7267221017234489909L;

	public FitnessFunctionNRP() {
		
	}

	@Override
	protected double evaluate(IChromosome potentialSolution) {
		Crisscross ccobject = new Crisscross(potentialSolution);
		Crisscross workObject = Main.workObject;
		
		double asciiDifference = 0;
		
		for (int i = 0; i<4; i++) {
			for (int j = 0; j<4; j++) {
				int one = ccobject.getCharField()[i][j];
				int two = workObject.getCharField()[i][j];
				asciiDifference += Math.abs(one-two);
			}
		}
		
		double fitness = CORRECT - asciiDifference;
		if (fitness < 0) {
			fitness = 0;
		}
		
		return fitness;
	}
	
}
