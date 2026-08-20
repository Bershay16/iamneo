class Node {
    int val;
    Node next;

    Node() {}

    Node(int val) {
        this.val = val;
    }
}

class SLL {
    Node head = null;
    Node tail = null;

    SLL() {}

    SLL(int val) {
        head = new Node(val);
        tail = head;
    }

    // 1. Insert at beginning
    void insertAtBeginning(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at end
    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // 3. Insert at position (0-based index)
    void insertAt(int pos, int val) {
        if (pos < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(val);

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // 4. Delete from beginning
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head == null) {
            tail = null;
        }
    }

    // 5. Delete from end
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    // 6. Delete from position (0-based index)
    void deleteAt(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
    }

    // Display
    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

// Meaningful main class name
class SinglyLinkedListDemo {
    public static void main(String[] args) {

        SLL list = new SLL();

        // Insert
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        // List: 5 10 20 30
        list.print();

        // Insert 15 at index 2
        list.insertAt(2, 15);

        // List: 5 10 15 20 30
        list.print();

        // Delete first
        list.deleteAtBeginning();

        // List: 10 15 20 30
        list.print();

        // Delete last
        list.deleteAtEnd();

        // List: 10 15 20
        list.print();

        // Delete index 1
        list.deleteAt(1);

        // List: 10 20
        list.print();
    }
}