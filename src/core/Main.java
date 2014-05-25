/**
 * 
 */
package core;

import translator.LexicalAnalysis;

/**
 * @author Greshnikk
 * @version 0.01
 * @since 2014-05-24
 */
public class Main {
	private static boolean debug = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LexicalAnalysis test = new LexicalAnalysis();
		String a = test.convert("123;221;11^31<>qwe<=");
		test.printTables();
	}
	
	public static void log (Object input) {
		if (debug) {
		System.out.println(input);
		}
	}

}
