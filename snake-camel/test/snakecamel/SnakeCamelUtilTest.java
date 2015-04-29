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
	@Test
	public void camelToSnakecase��HanaeMiyachi���X�l�[�N�P�[�X�ɒ���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "hanae_miyachi";
		String actual = scu.camelToSnakecase("HanaeMiyachi");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecase��HaNaeMIyachi���X�l�[�N�P�[�X�ɒ���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "ha_nae_m_iyachi";
		String actual = scu.camelToSnakecase("HaNaeMIyachi");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcase��hanae_miyachi���X�l�[�N�P�[�X�ɒ���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "HanaeMiyachi";
		String actual = scu.snakeToCamelcase("hanae_miyachi");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcase��ha_nae_m_iyachi���X�l�[�N�P�[�X�ɒ���() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "HaNaeMIyachi";
		String actual = scu.snakeToCamelcase("ha_nae_m_iyachi");
		assertThat(actual,is(expected));
	}
}
