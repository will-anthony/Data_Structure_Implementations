package uk.co.willanthony;

import uk.co.willanthony.linked_list.SinglyLinkedList;
import uk.co.willanthony.test_classes.Employee;

public class Main {

    public static void main(String[] args) {

        Employee anneBirleson = new Employee("Anne", "Birleson", 1);
        Employee willJones = new Employee("Will", "Jones", 2);
        Employee mattJones = new Employee("Matt", "Jones", 3);
        Employee louisHamber = new Employee("Louis", "Hamber", 4);

        SinglyLinkedList list = new SinglyLinkedList();
        list.addToFront(anneBirleson);
        list.addToFront(willJones);
        list.addToFront(mattJones);
        list.addToFront(louisHamber);

        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.removeFromFront());

        list.printList();

    }
}
