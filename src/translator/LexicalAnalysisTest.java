/**
 * 
 */
package translator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Greshnikk
 *
 */
public class LexicalAnalysisTest {

	/**
	 * Test method for {@link translator.LexicalAnalysis#convert(java.lang.String)}.
	 */
	@Test
	public void testConvert() {
		LexicalAnalysis tester = new LexicalAnalysis();
		assertFalse("Wrong output string", tester.convert("123;321q1") == "N0N1N2");
	}

}
