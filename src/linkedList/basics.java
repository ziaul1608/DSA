package linkedList;

public class basics {
//    public static void displayRecursively(Node head) {
//        if(head == null) return;
//        System.out.print(head.data + " ");
//        displayRecursively(head.next);
//    }
//
//    public static void display(Node head) {
//        Node temp = head;
//        while(temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }

    public static int length(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static class Node {
        int data; //value
        Node next; //address of next node

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        //System.out.println(a.next); //null
        Node b = new Node(6);
        Node c = new Node(2);
        Node d = new Node(7);
        Node e = new Node(5);
        Node f = new Node(8);

        // goal => 4 -> 6 -> 2 -> 7 -> 5   8
        a.next = b; // 4 -> 6   2   7   5   8
        b.next = c; // 4 -> 6 -> 2   7   5   8
        c.next = d; // 4 -> 6 -> 2 -> 7   5   8
        d.next = e; // 4 -> 6 -> 2 -> 7 -> 5   8
        e.next = f; // 4 -> 6 -> 2 -> 7 -> 5 -> 8

//        System.out.println(b.data);
//        System.out.println(a.next.data);
//

//        System.out.println(a); //$Node@8efb846
//        System.out.println(a.next); //$Node@2a84aee7
//        System.out.println(b); //$Node@2a84aee7
//        System.out.println(c); //$Node@a09ee92

        //displaying linked list
//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//        System.out.println(e.data);

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

//        Node temp = a;
//       for (int i = 1; i <= 5; i++) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//
//        while(temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

//        display(a);
//        System.out.println();
//        displayRecursively(a);

        System.out.println(length(a));
    }
}
