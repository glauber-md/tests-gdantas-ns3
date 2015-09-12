package com.gdantas.provas.find_on_stream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.gdantas.provas.exception.CharNotFoundException;
import com.gdantas.provas.run.FindNoRepeatingCharOnStream;
import com.gdantas.provas.stream.impl.TestInputStream;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class FindNoRepeatingCharOnStreamTest {

	private static final String STRING_1 = "aAbBABac";
	private static final String STRING_2 = "Glauber Dantas";
	private static final String STRING_3 = "anticonstitucionalissimamente";
	
	@Test
	public void testEncontra() throws CharNotFoundException {
		char c1 = FindNoRepeatingCharOnStream.firstChar(new TestInputStream(STRING_1));
		assertEquals(c1, 'b');
		char c2 = FindNoRepeatingCharOnStream.firstChar(new TestInputStream(STRING_2));
		assertEquals(c2, 'G');
		char c3 = FindNoRepeatingCharOnStream.firstChar(new TestInputStream(STRING_3));
		assertEquals(c3, 'u');
	}
	
	private static final String STRING_4 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	private static final String STRING_5 = "ababababababababababababaabababa";
	
	@Test(expected=CharNotFoundException.class)
	public void testNaoEncontra() throws CharNotFoundException {
		FindNoRepeatingCharOnStream.firstChar(new TestInputStream(STRING_4));
		FindNoRepeatingCharOnStream.firstChar(new TestInputStream(STRING_5));
	}
}
