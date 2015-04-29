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
	@Test
	public void camelToSnakecaseでHanaeMiyachiをスネークケースに直す() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "hanae_miyachi";
		String actual = scu.camelToSnakecase("HanaeMiyachi");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecaseでHaNaeMIyachiをスネークケースに直す() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "ha_nae_m_iyachi";
		String actual = scu.camelToSnakecase("HaNaeMIyachi");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseでhanae_miyachiをスネークケースに直す() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "HanaeMiyachi";
		String actual = scu.snakeToCamelcase("hanae_miyachi");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseでha_nae_m_iyachiをスネークケースに直す() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "HaNaeMIyachi";
		String actual = scu.snakeToCamelcase("ha_nae_m_iyachi");
		assertThat(actual,is(expected));
	}
}
