public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		ListNode start = new ListNode(0);
		ListNode process = new ListNode(0);
		if (l1.val < l2.val) {
			process.val = l1.val;
			l1 = l1.next;
		} else {
			process.val = l2.val;
			l2 = l2.next;
		}
		start.next = process;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				process.next = new ListNode(l1.val);
				process = process.next;
				l1 = l1.next;
			} else {
				process.next = new ListNode(l2.val);
				process = process.next;
				l2 = l2.next;
			}
		}
		if (l1 == null) {
			while (l2 != null) {
				process.next = new ListNode(l2.val);
				process = process.next;
				l2 = l2.next;
			}
		}
		while (l1 != null) {
			process.next = new ListNode(l1.val);
			process = process.next;
			l1 = l1.next;
		}
		return start.next;
	}
}
