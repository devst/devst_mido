package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
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

	@Test
	public void testIndexRemove() throws Exception {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new Object());

		list.remove(0);

		assertThat(0, is(list.size()));
	}
}
