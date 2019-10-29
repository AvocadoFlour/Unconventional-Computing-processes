package fitness;

import org.jgap.IChromosome;
import chromosome.CrisscrossCRO;
import chromosome.CroatianAlphabet;
import main.MainCRO;

import org.jgap.*;

public class FitnessFunctionNRPCRO extends FitnessFunction {

	public static final int CORRECT = 500;
	
	private static final long serialVersionUID = 7267221017234489909L;

	public FitnessFunctionNRPCRO() {
		
	}

	@Override
	protected double evaluate(IChromosome potentialSolution) {
		CrisscrossCRO ccobject = new CrisscrossCRO(potentialSolution);
		CrisscrossCRO workObject = MainCRO.workObject;
		
		double asciiDifference = 0;
		
		for (int i = 0; i<4; i++) {
			for (int j = 0; j<4; j++) {
				int one = CroatianAlphabet.getCROASCII(ccobject.getCharField()[i][j]);
				int two = CroatianAlphabet.getCROASCII(workObject.getCharField()[i][j]);
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
