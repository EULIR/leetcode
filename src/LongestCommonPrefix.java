import java.util.Arrays;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) return "";
		StringBuilder sb = new StringBuilder();
		Arrays.sort(strs);
		for (int i = 0; i < strs[0].length(); i++) {
			char cur = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != cur) return sb.toString();
			}
			sb.append(cur);
		}
		return sb.toString();
	}
}