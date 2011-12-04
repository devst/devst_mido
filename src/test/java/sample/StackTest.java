package sample;

import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class StackTest {

	@Test
	public void testEmpty() {
		
		Stack<Object> stack = new Stack<Object>();
		
		assertTrue(stack.empty());
		
	}
}
