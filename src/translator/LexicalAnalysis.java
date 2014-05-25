/**
 * 
 */
package translator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import core.Main;

/**
 * @author Greshnikk
 * @version 0.01
 * @since 2014-05-24
 */
public class LexicalAnalysis {
	private HashTableExt<Integer, String> operationTable = new HashTableExt<Integer, String>();
	private HashTableExt<Integer, Character> separatorTable = new HashTableExt<Integer, Character>();
	private HashTableExt<Integer, Integer> constantTable = new HashTableExt<Integer, Integer>();
	
	public LexicalAnalysis() {
		initTables();
	}
	
	public String convert (String input) {
		String result = "";
		String temp = "";
		int tmp = 0;
		
		for (int i = 0; i < input.length(); ++i) {
			//TODO: Add float recognition
			char inputChar = input.charAt(i);
			if (Character.isDigit(inputChar)) {
				tmp = tmp * 10 + Character.getNumericValue(inputChar);
				if (i + 1 == input.length() || !Character.isDigit(input.charAt(i + 1))) {
					result += "N" + constantTable.size();
					constantTable.put(constantTable.size(), tmp);
					tmp = 0;
				}
				continue;
			}
			if (isOperation(inputChar)) {
				temp += inputChar;
				if (i + 1 == input.length() || !isOperation(input.charAt(i + 1))) {
					Main.log(temp);
					result += "O" + operationTable.searchKey(temp);
					temp = "";
				}
				continue;
			}
		}
		
		Main.log("Converted string is");
		Main.log(result);
		return result;
	}
	
	public void printTables () {
		Main.log("\nPrinting operation table");
		for (int i = 0; i < operationTable.size(); ++i) {
			Main.log(operationTable.get(i));
		}
		
		Main.log("\nPrinting separator table");
		for (int i = 0; i < separatorTable.size(); ++i) {
			Main.log(separatorTable.get(i));
		}
			
		Main.log("\nPrinting constant table");
		for (int i = 0; i < constantTable.size(); ++i) {
			Main.log(constantTable.get(i));
		}
	}
	
	private boolean isOperation (char input) {
		return (input == '+' || input == '-' || input == '*' || input == '/' || input == '^'
				 || input == '<' || input == '>' || input == '=');				 
	}
	
	private void initTables () {
		//Init operation table
		operationTable.put(0, "+");
		operationTable.put(1, "-");
		operationTable.put(2, "*");
		operationTable.put(3, "/");
		operationTable.put(4, "^");
		operationTable.put(5, "=");
		operationTable.put(6, "<");
		operationTable.put(7, ">");
		operationTable.put(8, "<>");
		operationTable.put(9, "<=");
		operationTable.put(10, ">=");
		
		//Init separator table
	}
}
