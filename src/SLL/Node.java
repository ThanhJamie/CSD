/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLL;

/**
 *
 * @author GMT
 */
class Node<T> {

    T infor;
    Node next;

    public Node() {
    }

    public Node(T el) {
        this.infor = el;
    }

    public Node(T el, Node nt) {
        this.infor = el;
        this.next = nt;
    }
}
