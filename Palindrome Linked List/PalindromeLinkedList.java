import java.util.List;
import java.util.ArrayList;

class PalinRoamList {

    public static void main(String[] args) {

        ArrayList<String> ArrList = new ArrayList<>(List.of("A", "B", "C", "C", "A"));
        LinkedList list = new LinkedList();
        int size = ArrList.size();
        System.out.println("ArrayList Size: " + size);
        for (int i = 0; i < size; i++) {
            list.insertAtStart(ArrList.get(i));
        }
        list.show();
        int count = list.count();
        System.out.println("LinkedList Size: " + count);
        System.out.println("Is Palindrome: " + list.checkPalinRoam(count));

    }
}

class LinkedList {

    Node head;
    int nodeCount;

    public boolean checkPalinRoam(int count) {

        boolean isPalinRoam = true;
        Node m = head;
        int module = count % 2;
        int upto = 0;
        if (module == 0) {
            upto = count / 2;
        } else {
            upto = (count + 1) / 2;
        }

        for (int a = count; a > upto; a--) {
            Node n = head;
            for (int b = 0; b < a - 1; b++) {
                n = n.next;
            }
            System.out.println(n.data);
            System.out.println(m.data);
            if (n.data != m.data) {
                isPalinRoam = false;
            }
            m = m.next;
        }
        return isPalinRoam;

    }

    // count number of nodes
    public int count() {

        if (head == null) {
            nodeCount = 0;
        } else {
            Node node = head;
            while (node.next != null) {
                nodeCount++;
                node = node.next;
            }
            nodeCount++;
        }
        return nodeCount;

    }

    // print data from head
    public void show() {

        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    // use to add node at head
    public void insertAtStart(String data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }
}

class Node {
    String data;
    Node next;

}
