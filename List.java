/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist02;

/**
 *
 * @author mpeht
 */
public class List {

    private Node first;
    private Node last;
    private Node currPosition;

    public List() {
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getCurrPosition() {
        return currPosition;
    }

    public void setCurrPosition(Node currPosition) {
        this.currPosition = currPosition;
    }

    public void add(Client obj) {
        Node node = new Node();
        node.setObj(obj);
        if (first == null & last == null) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public void remove() {
        if (first.getNext() != null) {
            Node node = this.recoverLast(this.first);
            last = node;
            node.setNext(null);
        }
    }

    private Node recoverLast(Node node) {
        if (node.getNext().equals(last)) {
            return node;
        }
        return recoverLast(node.getNext());
    }

    public boolean hasNext() {
        if (first == null) {
            return false;
        } else if (currPosition == null) {
            currPosition = first;
            return true;
        } else {
            boolean hasNext = currPosition.getNext() != null ? true : false;
            currPosition = currPosition.getNext();
            return hasNext;
        }
    }

    public void Display() {

        if (last == first) {
            System.out.print("Empty List.");
        } else {
            Node actual = this.first;
            while (actual != last) {
                actual.nodeDisplay();
                actual = actual.getNext();
            }

        }
    }
}
