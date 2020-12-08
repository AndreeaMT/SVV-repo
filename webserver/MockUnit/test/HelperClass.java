package test;

public class HelperClass {
	private static String testBaseURL = "http://www.loose.upt.ro/vvswiki/Lucrarea3?action=AttachFile&do=get&target=";
	
	// helper method that return the full URL for a test page 
	public static String getUrlForPage(String page_name) {
		String page_url = testBaseURL + page_name;
		return page_url;
	}
}
