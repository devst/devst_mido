package sample;

import static org.hamcrest.CoreMatchers.*;
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

}
