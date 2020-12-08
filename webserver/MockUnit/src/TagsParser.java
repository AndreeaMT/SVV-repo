package src;


public class TagsParser {
	private String address = null;
	private HttpStringProvider provider = null;

	public TagsParser(String addr) {
		address = addr;
		provider = new HttpStringProvider();
	}

	public int getTagsCount() {
		int result = 0;
		String html = provider.getStringForAddress(address);
		for (int i = 0; i < html.length() - 1; i++) {
			char letter = html.charAt(i);
			char nextLetter = html.charAt(i + 1);
			if (letter == '<' && !(nextLetter == '!' || nextLetter == '/')) {
				result++;
			}
		}
		return result;
	}

	/**
	 * Searches the tag at the specified index.
	 * 
	 * @param index
	 *            The index of the tag
	 * @return The name of the tag
	 */
	public String getTagAt(int index) {
		int currentIndex = 0;
		String result = "";
		String html = provider.getStringForAddress(address);
		for (int i = 0; i < html.length() - 1; i++) {
			char letter = html.charAt(i);
			char nextLetter = html.charAt(i + 1);
			if (letter == '<' && !(nextLetter == '!' || nextLetter == '/')) {
				currentIndex++;				
			}			
			if (currentIndex == index) {
				if (nextLetter == '>') break;
				result += nextLetter;
			}
		}
		return result;
	}
	
	public void setProvider(HttpStringProvider p) {
        this.provider = p;
}
}
