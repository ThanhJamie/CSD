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
public class BST<T extends Comparable<T>> {

    Node root = null;

    public BST() {
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(T el) {
        Node<T> tmp = root;
        Node<T> pre = null;
        Node<T> p = new Node(el);
        if (isEmpty()) {
            root = p;
        }
        while (tmp != null) {
            if (el.compareTo(tmp.infor) == 1) {
                tmp = tmp.right;
            } else {
                tmp = tmp.left;
            }
        }
        if (el.compareTo(pre.infor) == 1) {
            pre.right = p;
        } else {
            pre.left = p;
        }

    }
    Node<T> search(T el) {
        Node<T> r = root;
        while (r != null) {
            if (el.compareTo(r.infor) == 0) {
                return r;
            } else if (el.compareTo(r.infor) > 0) {
                r = r.right;
            } else {
                r = r.left;
            }
        }
        return null;
    }
    
    void NLR(Node tmp){
        if(tmp!=null){
            System.out.println(tmp.infor);
            NLR(tmp.left);
            NLR(tmp.right);
        }
    }
    
    void postOder(Node tmp){
        if(tmp!= null){
            postOder(tmp.left);
            postOder(tmp.right);
            System.out.println(tmp.infor);
        }
    }
    
    void inOder(Node tmp){
        if(tmp!= null){
            inOder(tmp.left);
            System.out.println(tmp.infor);
            inOder(tmp.right);
        }
    }
    
   void preOder(T el){
       Node<T> p = new Node(el);
       if(isEmpty()){
           return;
       }
       if(el==null){
           return;
       }
       System.out.println(p.infor+ " ");
   }
}
