package test;

import org.junit.Test;

import src.HttpStringProvider;

import static org.junit.Assert.*;

public class TestStringProvider {

	@Test
	public void testStringContent() {
		String expected = "<html><head><title>Page under construction</title></head><body><center><b>Page under construction</b></body></html>";
		HttpStringProvider provider = new HttpStringProvider();	
		assertEquals(expected, provider.getStringForAddress(HelperClass.getUrlForPage("TestPage.html")));
	}
}
