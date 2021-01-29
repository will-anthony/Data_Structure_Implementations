package uk.co.willanthony.linked_list;

import uk.co.willanthony.test_classes.Employee;

public class SinglyLinkedList {

    // == fields ==
    private SinglyEmployeeNode head;
    private int size;


    // == public methods ==
    public void addToFront(Employee employee) {
        SinglyEmployeeNode node = new SinglyEmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public SinglyEmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        SinglyEmployeeNode temp = head;
        head = head.getNext();
        return temp;
    }

    public SinglyEmployeeNode getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {

        SinglyEmployeeNode current = head;

        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
