package problems.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

	public String getShortestWord(String[] strs) {
		String shortestWord = strs[0];
		for (String word : strs) {
			if (word.length() < shortestWord.length()) {
				shortestWord = word;
			}
		}
		return shortestWord;
	}

	public String compareItems(String str) {
		char firstItem = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != firstItem) {
				return "false- ";
			}
		}
		return "true-" + String.valueOf(firstItem);
	}

	public String longestCommonPrefix(String[] strs) {

		String shortestWord = getShortestWord(strs);
		List<String> listStrs = new ArrayList<>();
		String listLetter = "";
		String prefix = "";
		String[] answer = new String[2];
		
		for (int i = 0; i < shortestWord.length(); i++) {
			for (String word : strs) {
				listLetter += String.valueOf(word.charAt(i));
			}
			listStrs.add(listLetter);
			listLetter = "";
		}

		for (String word : listStrs) {
			answer = compareItems(word).split("-");
			if (Boolean.parseBoolean(answer[0])) {
				prefix += answer[1];
			}else {
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
