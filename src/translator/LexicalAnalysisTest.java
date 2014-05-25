/**
 * 
 */
package translator;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Greshnikk
 * @version 0.01
 * @since 2014-05-24
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
