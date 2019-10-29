package methods;

import java.util.ArrayList;
import java.util.List;

import chromosome.Crisscross;
import chromosome.CrisscrossCRO;

public final class Methods {

	public static void print4x4CharDoubleArrray(char[][] charField) {
		System.out.println(charField[0][0] + " | " + charField[0][1] + " | " + charField[0][2] + " | " + charField[0][3] + "\n"
				+ charField[1][0] + " | " + charField[1][1] + " | " + charField[1][2] + " | " + charField[1][3] + "\n"
				+ charField[2][0] + " | " + charField[2][1] + " | " + charField[2][2] + " | " + charField[2][3] + "\n"
				+ charField[3][0] + " | " + charField[3][1] + " | " + charField[3][2] + " | " + charField[3][3] + "\n");
	}
	
	public static Crisscross feed4x4DoubleCharArray() {
		char[][] charField = new char[4][4];
		charField[0][0] = "K".charAt(0);
		charField[0][1] = "L".charAt(0);
		charField[0][2] = "U".charAt(0);
		charField[0][3] = "B".charAt(0);
		charField[1][0] = "R".charAt(0);
		charField[1][1] = "A".charAt(0);
		charField[1][2] = "D".charAt(0);
		charField[1][3] = "A".charAt(0);
		charField[2][0] = "A".charAt(0);
		charField[2][1] = "R".charAt(0);
		charField[2][2] = "A".charAt(0);
		charField[2][3] = "K".charAt(0);
		charField[3][0] = "J".charAt(0);
		charField[3][1] = "A".charAt(0);
		charField[3][2] = "V".charAt(0);
		charField[3][3] = "A".charAt(0);
		return new Crisscross(charField);
	}
	
	public static CrisscrossCRO feed6x6DoubleCROCharArray() {
		String[][] charField = new String[6][6];
		charField[0][0] = "Ž";
		charField[0][1] = "L";
		charField[0][2] = "È";
		charField[0][3] = "B";
		charField[0][4] = "A";
		charField[0][5] = "H";
		charField[1][0] = "NJ";
		charField[1][1] = "A";
		charField[1][2] = "D";
		charField[1][3] = "Æ";
		charField[1][4] = "Ž";
		charField[1][5] = "Ð";
		charField[2][0] = "A";
		charField[2][1] = "R";
		charField[2][2] = "A";
		charField[2][3] = "DŽ";
		charField[2][4] = "DŽ";
		charField[2][5] = "DŽ";
		charField[3][0] = "J";
		charField[3][1] = "A";
		charField[3][2] = "V";
		charField[3][3] = "A";
		charField[3][4] = "U";
		charField[3][5] = "H";
		charField[4][0] = "A";
		charField[4][1] = "A";
		charField[4][2] = "A";
		charField[4][3] = "A";
		charField[4][4] = "A";
		charField[4][5] = "A";
		charField[5][0] = "A";
		charField[5][1] = "A";
		charField[5][2] = "A";
		charField[5][3] = "A";
		charField[5][4] = "A";
		charField[5][5] = "A";
		return new CrisscrossCRO(charField);
	}
	
	public static void fillCharDoubleArrray(char[][] charField) {
		charField[0][0] = "K".charAt(0);
		charField[0][1] = "L".charAt(0);
		charField[0][2] = "U".charAt(0);
		charField[0][3] = "B".charAt(0);
		charField[1][0] = "R".charAt(0);
		charField[1][1] = "A".charAt(0);
		charField[1][2] = "D".charAt(0);
		charField[1][3] = "A".charAt(0);
		charField[2][0] = "A".charAt(0);
		charField[2][1] = "R".charAt(0);
		charField[2][2] = "A".charAt(0);
		charField[2][3] = "K".charAt(0);
		charField[3][0] = "J".charAt(0);
		charField[3][1] = "A".charAt(0);
		charField[3][2] = "V".charAt(0);
		charField[3][3] = "A".charAt(0);
	}

	public static List<String> allowedLettersListAmericanAlphabet() {
		List<String> allowedLetters = new ArrayList<String>();
		allowedLetters.add("A");
		allowedLetters.add("B");
		allowedLetters.add("C");
		allowedLetters.add("D");
		allowedLetters.add("E");
		allowedLetters.add("F");
		allowedLetters.add("G");
		allowedLetters.add("H");
		allowedLetters.add("I");
		allowedLetters.add("J");
		allowedLetters.add("K");
		allowedLetters.add("L");
		allowedLetters.add("M");
		allowedLetters.add("N");
		allowedLetters.add("O");
		allowedLetters.add("P");
		allowedLetters.add("Q");
		allowedLetters.add("R");
		allowedLetters.add("S");
		allowedLetters.add("T");
		allowedLetters.add("U");
		allowedLetters.add("V");
		allowedLetters.add("W");
		allowedLetters.add("X");
		allowedLetters.add("Y");
		allowedLetters.add("Z");
		return allowedLetters;
	}
	
}
