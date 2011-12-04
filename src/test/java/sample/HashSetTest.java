package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class HashSetTest {

	@Test
	public void testInstance() {
		HashSet<Object> set = new HashSet<Object>();

		assertThat(set, is(notNullValue()));
		assertThat(0, is(set.size()));
	}

	@Test
	public void testAdd() throws Exception {
		HashSet<Object> set = new HashSet<Object>();

		set.add(new Object());

		assertThat(1, is(set.size()));
	}

	@Test
	public void testIndexRemove() throws Exception {
		HashSet<Object> set = new HashSet<Object>();
		Object object = new Object();
		set.add(object);

		set.remove(object);

		assertThat(0, is(set.size()));
	}

}
