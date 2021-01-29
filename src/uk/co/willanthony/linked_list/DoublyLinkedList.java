package uk.co.willanthony.linked_list;

import uk.co.willanthony.test_classes.Employee;

public class DoublyLinkedList{

    // == fields ==
    private DoublyEmployeeNode head;
    private DoublyEmployeeNode tail;
    private int size;


    // == public methods ==
    public void addToFront(Employee employee) {
        DoublyEmployeeNode node = new DoublyEmployeeNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        DoublyEmployeeNode node = new DoublyEmployeeNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public DoublyEmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        DoublyEmployeeNode temp = head;

        if(head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        return temp;
    }

    public DoublyEmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        DoublyEmployeeNode removedNode = tail;

        if (tail.getNext() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        return removedNode;
    }

    public DoublyEmployeeNode getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {

        DoublyEmployeeNode current = head;

        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}