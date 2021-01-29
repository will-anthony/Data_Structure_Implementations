package uk.co.willanthony.linked_list;

import uk.co.willanthony.test_classes.Employee;

public class DoublyEmployeeNode {

    // == fields ==
    private Employee employee;
    private DoublyEmployeeNode next;
    private DoublyEmployeeNode previous;

    // == constructor ==
    public DoublyEmployeeNode(Employee employee) {
        this.employee = employee;
    }

    // == getters and setters ==
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DoublyEmployeeNode getNext() {
        return next;
    }

    public void setNext(DoublyEmployeeNode next) {
        this.next = next;
    }

    public DoublyEmployeeNode getPrevious() { return previous; }

    public void setPrevious(DoublyEmployeeNode previous) { this.previous = previous; }

    // == overridden methods ==
    @Override
    public String toString() {
        return employee.toString();
    }

}
