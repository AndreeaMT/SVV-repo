package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.TagsParser;


public class TestTagsParser {
	@Test
	public void testCounter() {
		TagsParser parser = new TagsParser(HelperClass.getUrlForPage("TestPage.html"));
		assertEquals(6, parser.getTagsCount());
	}
	
	@Test
	public void testGetTagsCount(){
		TagsParser parser = new TagsParser(HelperClass.getUrlForPage("TestPage.html")) ;
		assertEquals("head", parser.getTagAt(2));
	}
}
