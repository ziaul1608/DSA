package linkedList;

import java.util.LinkedList;

public class implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if(head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                size++;
            }

            tail = temp;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);

            if(head == null) {
                head = temp;
                tail = temp;
//                insertAtEnd(val);
            } else {
                temp.next = head;
                size++;
            }

            head = temp;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            if(idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("wrong index");
                return;
            }

            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void deleteAt(int idx) {
            if(idx == 0 ) {
                head = head.next;
                size--;
                return;
            }

            Node temp = head;

            if (idx < 0 || idx > size) {
                System.out.println("wrong index");
                return;
            }

            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
        int getElementAt(int idx) {
            Node temp = head;

            if (idx < 0 || idx > size) {
                System.out.println("wrong index");
                return -1;
            }

            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp =  head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(7);
        ll.display();
        System.out.println();

//        System.out.println("size of linked list: " + ll.size());
//        ll.insertAtEnd(9);
//        ll.display();
//        System.out.println();

//        ll.insertAtHead(5);
//        ll.display();
//        System.out.println();

//        ll.insertAt(6, 10);
//        ll.display();
//        System.out.println();

//        ll.insertAt(0, 14);
//        ll.display();
//        System.out.println();

//        System.out.println(ll.getElementAt(1));
//        System.out.println("size of linked list: " + ll.size);

        ll.deleteAt(0);
        ll.display();
    }
}
