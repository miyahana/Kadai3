package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void capitalize‚ÅA‚ğ‘å•¶š‚É‚Å‚«‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "A";
		String actual = scu.capitalize("a");
		assertThat(actual,is(expected));
	}
	@Test
	public void capitalize‚Åyokohama‚ÌÅ‰‚Ì•¶š‚ğ‘å•¶š‚É‚Å‚«‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Yokohama";
		String actual = scu.capitalize("yokohama");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalize‚ÅA‚ÌÅ‰‚Ì•¶š‚ğ¬•¶š‚É‚Å‚«‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "a";
		String actual = scu.uncapitalize("A");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalize‚ÅYokohama‚ÌÅ‰‚Ì•¶š‚ğ¬•¶š‚É‚Å‚«‚é() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "yokohama";
		String actual = scu.uncapitalize("Yokohama");
		assertThat(actual,is(expected));
	}
}
