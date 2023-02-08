static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data); 
        // new node to insert in the linked list
        if (head == null) {
            return newNode;
            // in case the provided linked list is empty
        }
        SinglyLinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            // iterate over the linked list until we hit the tail
        }
        temp.next = newNode; // add out node at the end of the linked list
        return head;        
    }
