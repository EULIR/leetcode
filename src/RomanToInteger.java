import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public int romanToInt(String s) {
		Map<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		map.put("IV", 4);
		map.put("IX", 9);
		map.put("XL", 40);
		map.put("XC", 90);
		map.put("CD", 400);
		map.put("CM", 900);
		if (s.length() == 1) {
			return map.get(s);
		}
		int index = 0;
		int result = 0;
		while (index < s.length() - 1) {
			if (map.get(s.substring(index, index + 1)) < map.get(s.substring(index + 1, index + 2))) {
				result += map.get(s.substring(index, index + 2));
				index += 2;
			} else {
				result += map.get(s.substring(index, index + 1));
				index++;
			}
		}
		String fin = s.substring(s.length() - 2);
		if (fin.equals("IV") || fin.equals("IX") || fin.equals("XL") || fin.equals("XC") || fin.equals("CD") || fin.equals("CM"))
			return result;
		return result + map.get(s.substring(s.length() - 1));
	}
}