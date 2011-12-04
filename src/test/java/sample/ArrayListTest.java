package sample;

import static org.hamcrest.CoreMatchers.is;
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
	public void testInitialSize() {
		assertThat(sut.size(), is(0));
	}

	@Test
	public void testAdd() throws Exception {
		sut.add(new Object());

		assertThat(sut.size(), is(1));
	}

	@Test
	public void testIndexRemove() throws Exception {
		sut.add(new Object());

		sut.remove(0);

		assertThat(sut.size(), is(0));
	}
}
