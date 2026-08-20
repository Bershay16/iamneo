class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class SLL {
    Node head, tail;

    void insertAtBeginning(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

class OddEvenLinkedList {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        SLL list = new SLL();

        for (int num : nums) {
            if (num % 2 == 1)
                list.insertAtBeginning(num);
        }

        for (int num : nums) {
            if (num % 2 == 0)
                list.insertAtEnd(num);
        }

        list.print();
    }
}