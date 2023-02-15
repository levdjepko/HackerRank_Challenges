public static void reversePrint(SinglyLinkedListNode llist) {
        // Write your code here
        Stack<Integer> stack = new Stack<>();
        
        while (llist != null) {
            stack.add(llist.data);
            llist = llist.next;
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    
    }
