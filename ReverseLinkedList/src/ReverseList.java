public class ReverseList {

    static class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "" + val;
        }
    }

    public static void main(String[] args) {
        Node n = new Node(1, new Node(2, new Node(3, new Node(20, null))));
        display(n);
        n = reverse(n);
        display(n);
    }

    static Node reverse(Node n) {
        Node tail = n;
        while (tail.next != null) {
            tail = tail.next;
        }
        reverseHelper(n);
        return (tail);
    }

    static Node reverseHelper(Node n) {
        if (n.next != null) {
            Node reverse = reverseHelper(n.next);
            reverse.next = n;
            n.next = null;
            return (n);
        }
        return (n);
    }

    static void display(Node n) {
        for (; n != null; n = n.next) {
            System.out.println(n);
        }
    }
}