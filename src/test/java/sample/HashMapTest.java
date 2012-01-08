package sample;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class HashMapTest {
	private HashMap<String, String> hash_obj;
	
	@Before
	public void setUp() throws Exception {
		hash_obj = new HashMap();
	}

	@Test
	public void initialied_hashmap_is_size_zero() {
		assertEquals(0, hash_obj.size());
	}

	@Test
	public void add_element_increase_the_size() {
		hash_obj.clear();
		hash_obj.put("add", "element");
		assertEquals(1, hash_obj.size());
	}

	@Test
	public void cleared_hash_isEmpty() {
		hash_obj.put("add", "element");
		hash_obj.clear();
		assertTrue(hash_obj.isEmpty());
	}
	
	@Test
	public void hash_object_which_has_an_element_isnt_empty() {
		hash_obj.put("ke", "value");
		assertFalse(hash_obj.isEmpty());
	}

}
