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
class SLL<T extends Comparable<T>> {

    Node<T> head, tail;

    public SLL() {
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(T el) {
        Node<T> p = new Node(el);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    void removeAll() {
        head = tail = null;
    }

    void printAll() {
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.infor + " ");
            tmp = tmp.next;
        }
    }

    int size() {
        Node<T> tmp = head;
        int result = 0;
        while (tmp != null) {
            result++;
            tmp = tmp.next;
        }
        return result;
    }

    void addMany(T[] a) {
        for (int i = 0; i < a.length; i++) {
            addFirst(a[i]);
        }
    }

    void addLast(T el) {
        Node p = new Node(el);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    void addPos(int pos, T x) {
        int size = size();
        if (pos < 0 || pos > size) {
            System.out.println("False");
        } else {
            if (pos == size) {
                addLast(x);
            } else if (pos == 0) {
                addFirst(x);
            } else {
                int length = 0;
                Node<T> p = head;
                while (p != null) {
                    length++;
                    if (length - 1 == pos - 1) {
                        Node<T> tmp = new Node(x);
                        tmp.next = p.next;
                        p.next = tmp;
                        break;
                    }
                    p = p.next;
                }
            }
        }
    }

    int indexOf(T val) {
        int index = -1;
        Node<T> tmpNode = head;
        while (tmpNode != null) {
            index++;
            if (val.compareTo(tmpNode.infor) == 0) {
                break;
            }
            tmpNode = tmpNode.next;
        }
        return index;
    }

    T get(int pos) {
        if (pos >= size() || pos < 0) {
            return null;
        }
        Node<T> tmp = head;
        while (pos > 0) {
            tmp = tmp.next;
            pos--;
        }
        return tmp.infor;
    }

    void removeLast() {
        Node<T> tmp = head;
        while (tmp.next.next != null) {
            tmp = tmp.next;
        }
        tail = tmp;
        tail.next = null;
    }
}
