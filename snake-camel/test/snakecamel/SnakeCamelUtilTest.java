package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void capitalize��A��啶���ɂł���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "A";
		String actual = scu.capitalize("a");
		assertThat(actual,is(expected));
	}
	@Test
	public void capitalize��yokohama�̍ŏ��̕�����啶���ɂł���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Yokohama";
		String actual = scu.capitalize("yokohama");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalize��A�̍ŏ��̕������������ɂł���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "a";
		String actual = scu.uncapitalize("A");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalize��Yokohama�̍ŏ��̕������������ɂł���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "yokohama";
		String actual = scu.uncapitalize("Yokohama");
		assertThat(actual,is(expected));
	}
}
