public class CountAndSay {
	public static String countAndSay(int n) {
		String str = "1";
		for (int i = 2; i <= n; i++) {
			str = next(str);
		}
		return str;
	}

	public static String next(String str) {
		StringBuilder sb = new StringBuilder();
		str = str + "E";
		int count = 0;
		char c = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != c) {
				sb.append(count);
				sb.append(c);
				c = str.charAt(i);
				count = 1;
			} else {
				count++;
			}
		}
		return sb.toString();
	}
}