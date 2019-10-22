import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		HashSet<Character> set = new HashSet<>();
		int i = 0;
		int j = 0;
		int result = 0;
		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				result = Math.max(result, j - i);
			} else {
				set.remove(s.charAt(i));
				i++;
			}

		}
		return result;
	}
}