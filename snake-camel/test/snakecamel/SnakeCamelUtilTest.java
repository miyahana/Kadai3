package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void capitalizeでAを大文字にできる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "A";
		String actual = scu.capitalize("a");
		assertThat(actual,is(expected));
	}
	@Test
	public void capitalizeでyokohamaの最初の文字を大文字にできる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Yokohama";
		String actual = scu.capitalize("yokohama");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalizeでAの最初の文字を小文字にできる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "a";
		String actual = scu.uncapitalize("A");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalizeでYokohamaの最初の文字を小文字にできる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "yokohama";
		String actual = scu.uncapitalize("Yokohama");
		assertThat(actual,is(expected));
	}
}
