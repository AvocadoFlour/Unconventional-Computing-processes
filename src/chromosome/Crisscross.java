package chromosome;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.IChromosome;
import org.jgap.IGeneConstraintChecker;
import org.jgap.InvalidConfigurationException;

public class Crisscross implements IChromosome {
	
	private static final long serialVersionUID = -3218492461607060356L;
	
	public static enum ASCIIValue {
		
		A(65), B(66), C(67), D(68), E(69), F(70), G(71), H(72), I(73), J(74),
		K(75), L(76), M(77), N(78), O(79), P(80), Q(81), R(82), S(83), T(84),
		U(85), V(86), W(87), X(88), Y(89), Z(90);
		
		private final char character;
		
		ASCIIValue (int asciint) {
			this.character = (char)asciint;
		}
		
		public char character() {return character;}
		
	}
	
	public static void print4x4CharDoubleArrray(Crisscross crisscross) {
		char[][] charField = crisscross.getCharField();
		System.out.println(charField[0][0] + " | " + charField[0][1] + " | " + charField[0][2] + " | " + charField[0][3] + "\n"
				+ charField[1][0] + " | " + charField[1][1] + " | " + charField[1][2] + " | " + charField[1][3] + "\n"
				+ charField[2][0] + " | " + charField[2][1] + " | " + charField[2][2] + " | " + charField[2][3] + "\n"
				+ charField[3][0] + " | " + charField[3][1] + " | " + charField[3][2] + " | " + charField[3][3] + "\n");
	}
	
	
	
	private char[][] charField = new char[4][4];
	
	//Main constructor
	public Crisscross (String a, String b, String c, String d, String e, String f, String g, String h, 
			String i, String j, String k, String l, String m, String n, String o, String p) {
		this.charField[0][0] = a.charAt(0);
		this.charField[0][1] = b.charAt(0);
		this.charField[0][2] = c.charAt(0);
		this.charField[0][3] = d.charAt(0);
		this.charField[1][0] = e.charAt(0);
		this.charField[1][1] = f.charAt(0);
		this.charField[1][2] = g.charAt(0);
		this.charField[1][3] = h.charAt(0);
		this.charField[2][0] = i.charAt(0);
		this.charField[2][1] = j.charAt(0);
		this.charField[2][2] = k.charAt(0);
		this.charField[2][3] = l.charAt(0);
		this.charField[3][0] = m.charAt(0);
		this.charField[3][1] = n.charAt(0);
		this.charField[3][2] = o.charAt(0);
		this.charField[3][3] = p.charAt(0);
	}
	
	public static void print4x4CharDoubleArrrayFromChromosome(IChromosome chromosome) {
		Crisscross crisscross = new Crisscross(chromosome);
		print4x4CharDoubleArrray(crisscross);
	}
	
	//Overloaded constructor, evaluator chromosome to Crisscross converter
		public Crisscross (IChromosome chromosome) {
			List<Integer> asciiValues = new ArrayList<>();
			for (int i = 0; i < chromosome.size(); i++) {
				asciiValues.add(((Integer) chromosome.getGene(i).getAllele()).intValue());
			}
			
			int listCounter = 0;
			
			for (int i = 0; i< 4; i++) {
				for(int j = 0; j<4; j++) {
					this.charField[i][j] = (char) asciiValues.get(listCounter).intValue();
					listCounter+=1;
				}
			}
		}
	
	//Overloaded constructor, based on 2D char array
	public Crisscross (char[][] charField) {
		this.charField = charField;
	}
	
//	random sample
	public Crisscross() {
		for (int i = 0; i < this.charField.length; i++) {
			for (int j = 0; j < this.charField[i].length; j++) {
				charField[i][j] = (char)ThreadLocalRandom.current().nextInt(65, 90 + 1);
			}			
		}
	}

	public char[][] getCharField() {
		return this.charField;
	}

	public void setCharField(char[][] charField) {
		this.charField = charField;
	}

	// https://stackoverflow.com/questions/13344494/how-to-implement-interface-with-object-clone-conflicting-method
	public Object clone() { return null; }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getUniqueID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueIDTemplate(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUniqueIDTemplate(String arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cleanup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getApplicationData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Configuration getConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getFitnessValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getFitnessValueDirectly() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Gene getGene(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gene[] getGenes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void increaseAge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseOperatedOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSelectedForNextGeneration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int operatedOn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetAge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetOperatedOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAge(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApplicationData(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConstraintChecker(IGeneConstraintChecker arg0) throws InvalidConfigurationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFitnessValue(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFitnessValueDirectly(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGenes(Gene[] arg0) throws InvalidConfigurationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIsSelectedForNextGeneration(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
