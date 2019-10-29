package chromosome;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.IChromosome;
import org.jgap.IGeneConstraintChecker;
import org.jgap.InvalidConfigurationException;

public class CrisscrossCRO implements IChromosome {
	
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
	
	public static void print4x4CharDoubleArrray(CrisscrossCRO crisscross) {
		String[][] charField = crisscross.getCharField();
		System.out.println(charField[0][0] + " | " + charField[0][1] + " | " + charField[0][2] + " | " + charField[0][3] + " | " + charField[0][4] + " | " + charField[0][5] + "\n"
				+ charField[1][0] + " | " + charField[1][1] + " | " + charField[1][2] + " | " + charField[1][3] +  " | " + charField[1][4] + " | " + charField[1][5] + "\n"
				+ charField[2][0] + " | " + charField[2][1] + " | " + charField[2][2] + " | " + charField[2][3] +  " | " + charField[2][4] + " | " + charField[2][5] + "\n"
				+ charField[3][0] + " | " + charField[3][1] + " | " + charField[3][2] + " | " + charField[3][3] +  " | " + charField[3][4] + " | " + charField[3][5] + "\n"
				+ charField[4][0] + " | " + charField[4][1] + " | " + charField[4][2] + " | " + charField[4][3] +  " | " + charField[4][4] + " | " + charField[4][5] + "\n"
				+ charField[5][0] + " | " + charField[5][1] + " | " + charField[5][2] + " | " + charField[5][3] +  " | " + charField[5][4] + " | " + charField[5][5] + "\n");
	}
	
	
	
	private String[][] charField = new String[6][6];
	
	//Main constructor
	public CrisscrossCRO (String a, String b, String c, String d, String e, String f, String g, String h, 
			String i, String j, String k, String l, String m, String n, String o, String p, String r, 
			String s, String t, String u, String v, String z, String y, String w, String q, String x, 
			String aa, String ab, String ac, String ad, String ae, String af, String ag, String ah, String aj, String ak) {
		this.charField[0][0] = a;
		this.charField[0][1] = b;
		this.charField[0][2] = c;
		this.charField[0][3] = d;
		this.charField[0][4] = e;
		this.charField[0][5] = f;
		this.charField[1][0] = g;
		this.charField[1][1] = h;
		this.charField[1][2] = i;
		this.charField[1][3] = j;
		this.charField[1][4] = k;
		this.charField[1][5] = l;
		this.charField[2][0] = m;
		this.charField[2][1] = n;
		this.charField[2][2] = o;
		this.charField[2][3] = p;
		this.charField[2][4] = r;
		this.charField[2][5] = s;
		this.charField[3][0] = t;
		this.charField[3][1] = u;
		this.charField[3][2] = v;
		this.charField[3][3] = z;
		this.charField[3][4] = y;
		this.charField[3][5] = w;
		this.charField[4][0] = q;
		this.charField[4][1] = x;
		this.charField[4][2] = aa;
		this.charField[4][3] = ab;
		this.charField[4][4] = ac;
		this.charField[4][5] = ad;
		this.charField[5][0] = ae;
		this.charField[5][1] = af;
		this.charField[5][2] = ag;
		this.charField[5][3] = ah;
		this.charField[5][4] = aj;
		this.charField[5][5] = ak;
	}
	
	public static void print6x6CharDoubleArrrayFromChromosome(IChromosome chromosome) {
		CrisscrossCRO crisscross = new CrisscrossCRO(chromosome);
		print4x4CharDoubleArrray(crisscross);
	}
	
	//Overloaded constructor, evaluator chromosome to Crisscross converter
		public CrisscrossCRO (IChromosome chromosome) {
			List<Integer> asciiValues = new ArrayList<>();
			for (int i = 0; i < chromosome.size(); i++) {
				asciiValues.add(((Integer) chromosome.getGene(i).getAllele()).intValue());
			}
			
			int listCounter = 0;
			
			for (int i = 0; i< 6; i++) {
				for(int j = 0; j<6; j++) {
					this.charField[i][j] = CroatianAlphabet.getCroLetter(asciiValues.get(listCounter));
					listCounter+=1;
				}
			}
		}
	
	//Overloaded constructor, based on 2D char array
	public CrisscrossCRO (String[][] charField) {
		this.charField = charField;
	}
	
//	random sample
	public CrisscrossCRO() {
		for (int i = 0; i < this.charField.length; i++) {
			for (int j = 0; j < this.charField[i].length; j++) {
				charField[i][j] = CroatianAlphabet.getCroLetter((ThreadLocalRandom.current().nextInt(0, 29 + 1)));
			}			
		}
	}

	public String[][] getCharField() {
		return this.charField;
	}

	public void setCharField(String[][] charField) {
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
