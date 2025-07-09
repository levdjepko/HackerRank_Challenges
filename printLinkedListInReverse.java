public static void reversePrint(SinglyLinkedListNode llist) {
        // Use Stack to print the linked list in reverse order
        Stack<Integer> stack = new Stack<>();
        
        while (llist != null) {
            stack.add(llist.data);
            llist = llist.next;
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    
    }
