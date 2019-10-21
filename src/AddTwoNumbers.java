import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		while (l1 != null) {
			sb1.append(l1.val);
			l1 = l1.next;
		}
		while (l2 != null) {
			sb2.append(l2.val);
			l2 = l2.next;
		}
		BigInteger big1 = new BigInteger(sb1.reverse().toString());
		BigInteger big2 = new BigInteger(sb2.reverse().toString());
		BigInteger result = big1.add(big2);
		ListNode node = new ListNode(result.mod(BigInteger.TEN).intValue());
		ListNode n = node;
		while (result.compareTo(BigInteger.TEN) >= 0) {
			result = result.divide(BigInteger.TEN);
			node.next = new ListNode(result.mod(BigInteger.TEN).intValue());
			node = node.next;
		}
		return n;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
