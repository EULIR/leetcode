public class ReverseInteger {
	public int reverse(int x) {
		boolean negative = x < 0;
		long xx = x < 0 ? -x : x;
		long result = 0;
		while (xx > 0) {
			result = result * 10 + xx % 10;
			xx /= 10;
		}
		if (negative) result = -result;
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			return 0;
		return (int) result;
	}
}
