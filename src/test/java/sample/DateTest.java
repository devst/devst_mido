package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void testInstance() {
		Date date = new Date();
		
		assertThat(date, is(notNullValue()));
	}
	
}
