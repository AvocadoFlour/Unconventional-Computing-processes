package chromosome;

import java.util.HashMap;
import java.util.Map;

public class CroatianAlphabet {
	
	private static Map<Integer, String> croatianAlphabet = new HashMap<Integer, String>() {

	/**
		 * 
		 */
		private static final long serialVersionUID = -9214346077232716264L;

		{
				put(1,"A");
				put(2,"B");
				put(3,"C");
				put(4,"�");
				put(5,"�");
				put(6,"D");
				put(7,"D�");
				put(8,"�");
				put(9,"E");
				put(10,"F");
				put(11,"G");
				put(12,"H");
				put(13,"I");
				put(14,"J");
				put(15,"K");
				put(16,"L");
				put(17,"LJ");
				put(18,"M");
				put(19,"N");
				put(20,"NJ");
				put(21,"O");
				put(22,"P");
				put(23,"R");
				put(24,"S");
				put(25,"�");
				put(26,"T");
				put(27,"U");
				put(28,"V");
				put(29,"U");
				put(30,"�");
		}
	};
	
	private static Map<String, Integer> croatianAlphabetASCII = new HashMap<String, Integer>() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1743371820865313690L;

		{
				put("A",1);
				put("B",2);
				put("C",3);
				put("�",4);
				put("�",5);
				put("D",6);
				put("D�",7);
				put("�",8);
				put("E",9);
				put("F",10);
				put("G",11);
				put("H",12);
				put("I",13);
				put("J",14);
				put("K",15);
				put("L",16);
				put("LJ",17);
				put("M",18);
				put("N",19);
				put("NJ",20);
				put("O",21);
				put("P",22);
				put("R",23);
				put("S",24);
				put("�",25);
				put("T",26);
				put("U",27);
				put("V",28);
				put("U",29);
				put("�",30);
		}
	};
	
	public static int getCROASCII(String string) {
		return croatianAlphabetASCII.get(string);
	}
	
	public static String getCroLetter(int croAscii) {
		return croatianAlphabet.get(croAscii);
	}
	
}
