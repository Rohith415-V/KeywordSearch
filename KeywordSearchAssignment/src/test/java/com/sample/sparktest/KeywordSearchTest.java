
package com.sample.sparktest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class KeywordSearchTest {

	@Test
	public void testKeywordExists() {
		assertTrue(new KeywordSearch().findKeyword("src/test/resources/input/inputFile", "Christmas"));
	}
	
	@Test
	public void testKeywordNotExists() {
		assertFalse(new KeywordSearch().findKeyword("src/test/resources/input/inputFile", "rbc"));
	}
}
