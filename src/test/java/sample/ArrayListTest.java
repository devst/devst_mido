package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

	private ArrayList<Object> sut;

	@Before
	public void setUp() {
		sut = new ArrayList<Object>();
	}

	@Test
	public void testInstance() {
		assertThat(sut, is(notNullValue()));
		assertThat(0, is(sut.size()));
	}

	@Test
	public void testAdd() throws Exception {
		sut.add(new Object());

		assertThat(1, is(sut.size()));
	}

	@Test
	public void testIndexRemove() throws Exception {
		sut.add(new Object());
		sut.remove(0);

		assertThat(0, is(sut.size()));
	}
}
