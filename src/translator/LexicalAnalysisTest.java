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
		assertTrue(tester.convert("123;321q1").equals("N0N1N2"));
		tester.clearConstantTable();
		assertTrue(tester.convert("12;294<1233=28+987^1").equals("N0N1O6N2O5N3O0N4O4N5"));
	}

}
