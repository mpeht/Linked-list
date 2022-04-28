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
public class Node {
    
    private Node next;
    private Client obj;

    public Node() {
    }
    
    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Client getObj() {
        return obj;
    }

    public void setObj(Client obj) {
        this.obj = obj;
    }
    public void nodeDisplay() {
        
        String name = obj.getName();
        String adress = obj.getAdress();
        String tel = obj.getTel();

        System.out.print("Name: " + name + " \n"
                + "Adress: " + adress + "\n"
                        + "Tel: " + tel + "\n");
    }
    
    
}
