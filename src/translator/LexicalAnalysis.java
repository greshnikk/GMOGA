/**
 * 
 */
package translator;

import java.util.Hashtable;
import core.Main;

/**
 * @author Greshnikk
 *
 */
public class LexicalAnalysis {
	private Hashtable<Integer, Character> operationTable = new Hashtable<Integer, Character>();
	private Hashtable<Integer, Character> separatorTable = new Hashtable<Integer, Character>();
	private Hashtable<Integer, Integer> constantTable = new Hashtable<Integer, Integer>();
	
	public void LexicalAnalysis() {
	}
	
	public String convert (String input) {
		String result = "";
		int tmp = 0;
		int digit = 0;
		
		for (int i = 0; i < input.length(); ++i) {
			if (Character.isDigit(input.charAt(i))) {
				tmp = tmp * 10 + Character.getNumericValue(input.charAt(i));				
				if (i + 1 != input.length()) {
					continue;
				}
			}
			if (tmp != 0 || digit != 0) {
				result += "N" + constantTable.size();
				constantTable.put(constantTable.size(), tmp);
				tmp = 0;
				digit = 0;
			}				
		}
		Main.log("Converted string is");
		Main.log(result);
		return result;
	}
	
	public void printTables () {
		Main.log("\nPrinting operation table");
		for (int i = 0; i < operationTable.size(); ++i) {
			Main.log(constantTable.get(i));
		}
		
		Main.log("\nPrinting separator table");
		for (int i = 0; i < separatorTable.size(); ++i) {
			Main.log(constantTable.get(i));
		}
			
		Main.log("\nPrinting constant table");
		for (int i = 0; i < constantTable.size(); ++i) {
			Main.log(constantTable.get(i));
		}
	}
}
