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
		tester.clearConstantTable();
		assertTrue(tester.convert("2X1^2 - X2^2 - 3X1X2").equals("N0S1N1O4N2S6O1S6S1N3O4N4S6O1S6N5S1N6S1N7"));
		tester.clearConstantTable();
		assertTrue(tester.convert("2X1^2 - (3 + 2)X2^2 - 3.1415X1X2e^2X1 + 0.17E-27*PI").equals("N0S1N1O4N2S6O1S6S3N3S6O0S6N4S4S1N5O4N6S6O1S6N7S2N8S1N9S1N10K1O4N11S1N12S6O0S6N13S2N14S0O1N15O2K0"));
		tester.clearConstantTable();
	}

}
