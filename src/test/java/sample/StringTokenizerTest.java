package sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.StringTokenizer;

import org.junit.Test;

public class StringTokenizerTest {

	@Test
	public void testHasMoreTokens() {
		StringTokenizer st = new StringTokenizer("あ,い,う,え,お", ",");
	
		assertTrue(st.hasMoreTokens());
	}
	
	@Test
	public void testNextToken() {
		StringTokenizer st = new StringTokenizer("あ,い,う,え,お", ",");
		
		assertEquals("あ", st.nextToken());
	}
	
	@Test
	public void testCountTokens() {
		StringTokenizer st = new StringTokenizer("あ,い,う,え,お", ",");
		
		assertEquals(5, st.countTokens());
	}
}
