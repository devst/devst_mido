package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Iterator;
import java.util.TreeMap;

import org.junit.Test;

public class TreeMapTest {

	@Test
	public void testInstance() {
		TreeMap<String, Object> tmap = new TreeMap<String, Object>();

		assertThat(tmap, is(notNullValue()));
		assertThat(0, is(tmap.size()));
	}

	@Test
	public void testAdd() throws Exception {
		TreeMap<String, Object> tmap = new TreeMap<String, Object>();

		tmap.put(new String(), new Object());

		assertThat(1, is(tmap.size()));
	}

	@Test
	public void testAdd2() throws Exception {
		TreeMap<String, Object> tmap = new TreeMap<String, Object>();

		tmap.put(new String("1"), new Object());
		tmap.put(new String("2"), new Object());

		assertThat(2, is(tmap.size()));
	}

	@Test
	public void testKeyRemove() throws Exception {
		TreeMap<Object, Object> tmap = new TreeMap<Object, Object>();
		Comparable<String> key = new String();
		tmap.put(key, new Object());

		tmap.remove(key);

		assertThat(0, is(tmap.size()));
	}

	@Test
	public void testSort() throws Exception {
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();

		tmap.put("い", 2);
		tmap.put("あ", 1);
		tmap.put("え", 4);
		tmap.put("お", 5);
		tmap.put("う", 3);

		Iterator<Integer> valueIterator = tmap.values().iterator();
		for (int i=0; valueIterator.hasNext(); i++) {
			assertThat(i+1, is(valueIterator.next()));
		}
	}

}
