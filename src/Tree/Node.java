/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author GMT
 */
class Node<T> {
    T infor;
    Node<T> left;
    Node<T> right;

    public Node() {
    }
    
    public Node(T infor) {
        this.infor = infor;
    }
    
    public Node(T infor, Node<T> left, Node<T> right) {
        this.infor = infor;
        this.left = left;
        this.right = right;
    }
        
    
    
}
