class Linked_List {
    Node head; // head pointer
    Node last;

    // static - so that we can call inside main
    static class Node {
        int val;
        Node next;

        // constructor, it will create memory for us and return the refernce pointer
        Node(int val) {
            this.val = val;
            next = null;

        }

    }

    public static Linked_List insert(Linked_List list, int val) {
        Node new_node = new Node(val); // create a new node
        // This is going to create a new Node and the new_Node will point to that
        new_node.next = null;

        // if linked list is empty
        if (list.head == null) {
            // why list.head and not head? suppose we want to create two linked list from
            // the same class then we need to say that this head belongs to list1 and the
            // other one to list 2
            list.head = new_node;
            list.last = list.head;

        }
        {

            list.last.next = new_node;
            list.last = new_node;
        }

        return list;

    }

    public static void printList(Linked_List list) {
        Node curr = list.head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println("");
    }

    public Linked_List addTwoNumbers(Linked_List l1, Linked_List l2) {
        Linked_List list3 = new Linked_List();
        Node curr1 = l1.head;
        Node curr2 = l2.head;
        int carry = 0;
        while (curr1 != null || curr2 != null) {
            int x = (curr1 != null) ? curr1.val : 0;
            int y = (curr2 != null) ? curr2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            int digit = sum % 10;
            list3 = insert(list3, digit);
            if (curr1 != null)
                curr1 = curr1.next;
            if (curr2 != null)
                curr2 = curr2.next;
        }

        if (carry == 1)

        {
            list3 = insert(list3, 1);
        }

        return list3;

    }

}

class AddTwoNumber extends Linked_List {

    public static void main(String[] args) {
        Linked_List list1 = new Linked_List();
        Linked_List list2 = new Linked_List();
        // Insert the values
        list1 = insert(list1, 9);
        list1 = insert(list1, 9);
        list1 = insert(list1, 9);

        list2 = insert(list2, 9);
        list2 = insert(list2, 9);
        list2 = insert(list2, 9);

        Linked_List list3 = list1.addTwoNumbers(list1, list2);

        // Print the LinkedList
        printList(list1);
        printList(list2);
        printList(list3);

    }

}
