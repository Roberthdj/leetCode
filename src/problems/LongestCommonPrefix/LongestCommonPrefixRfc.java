package problems.LongestCommonPrefix;

public class LongestCommonPrefixRfc {

	public String getShortestWord(String[] strs) {
		String shortestWord = strs[0];
		for (String word : strs) {
			if (word.length() < shortestWord.length()) {
				shortestWord = word;
			}
		}
		return shortestWord;
	}

	public String longestCommonPrefix(String[] strs) {

		String prefix = "";
		String shortestWord = getShortestWord(strs);
		Boolean flag = true;

		for (int i = 0; i < shortestWord.length(); i++) {
			for (int j = 0; j < strs.length; j++) {
				if (strs[j].charAt(i) != shortestWord.charAt(i)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				prefix += shortestWord.charAt(i);
			} else {
				break;
			}
		}

		return prefix;
	}

	public static void main(String[] args) {

		String[] listOne = new String[] { "flower", "flow", "flight" };
		String[] listTwo = new String[] { "dog", "racecar", "car" };
		String[] listThree = new String[] { "cir", "car" };

		LongestCommonPrefixRfc lcp = new LongestCommonPrefixRfc();

		System.out.println(lcp.longestCommonPrefix(listOne));

		System.out.println(lcp.longestCommonPrefix(listTwo));
		System.out.println(lcp.longestCommonPrefix(listThree));

	}

}
