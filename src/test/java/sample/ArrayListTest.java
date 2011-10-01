package sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void testInstance() {
		ArrayList<Object> list = new ArrayList<Object>();

		assertThat(list, is(notNullValue()));
		assertThat(0, is(list.size()));
	}

	@Test
	public void testAdd() throws Exception {
		ArrayList<Object> list = new ArrayList<Object>();

		list.add(new Object());

		assertThat(1, is(list.size()));
	}
}
