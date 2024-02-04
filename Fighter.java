// Change the class name to Solution
public class Fighter {
    // Add the main method
    public static void main(String[] args) {
        // Create an object of the class
        Solution sol = new Solution();
        // Create some sample input
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));
        // Call the mergeKLists method and print the result
        ListNode result = sol.mergeKLists(lists);
        sol.printList(result);
    }

    // The rest of the code remains the same
    public ListNode mergeKLists(ListNode[] lists) {
        // Check if the input array is null or empty
        if (lists == null || lists.length == 0) {
            return null;
        }
        // Create a priority queue with a custom comparator that compares the values of the nodes
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });
        // Create a dummy node to point to the head of the output list
        ListNode dummy = new ListNode(0);
        // Create a pointer to the current node of the output list
        ListNode curr = dummy;
        // Loop through the input array and insert the first element of each list into the priority queue
        for (ListNode list : lists) {
            if (list != null) {
                queue.offer(list);
            }
        }
        // Loop until the priority queue is empty
        while (!queue.isEmpty()) {
            // Remove the root element of the priority queue and add it to the output list
            ListNode node = queue.poll();
            curr.next = node;
            curr = curr.next;
            // If the removed node has a next node, insert it into the priority queue
            if (node.next != null) {
                queue.offer(node.next);
            }
        }
        // Return the head of the output list
        return dummy.next;
    }

    // A helper method to print a linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
