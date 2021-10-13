/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkerList;

/**
 *
 * @author GMT
 */
public class MyList {

    Node head, tail;

    public MyList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int el) {
        Node p = new Node(el);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    public void addFirst(int el) {
        Node p = new Node(el);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            head = p;
        }
    }

    public void traversal() {
        Node p = head;
        while (p != null) {
            System.out.println(p.info + " ");
            p = p.next;
        }
        System.out.println("");
    }

    public int size() {
        Node p = head;
        int c = 0;
        while (p != null) {
            c++;
            p = p.next;
        }
        return c;
    }

    public Node get(int k) {
        Node p = head;
        int c = 0;
        while (p != null && c < k) {
            c++;
            p = p.next;
        }
        return p;
    }

    public void sort() {
        int n = size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Node pi = get(i), pj = get(j);
                if (pi.info > pj.info) {
                    int t = pi.info;
                    pi.info = pj.info;
                    pj.info = t;
                }
            }
        }
    }

    public Node search(int x) {
        Node p = head;
        while (p != null && p.info != x) {
            p = p.next;
        }
        return p;
    }

    void dele(Node q) {
        Node f, p;
        f = null;
        p = head;
        while (p != null) {
            if (p == q) {
                break;
            }
            f = p;
            p = p.next;
        }
        if (p == null) {
            return;
        }
        if (f == null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        f.next = p.next;
        if (f.next == null) {
            tail = f;
        }
    }

    public void remove(Node p) {
        if (p == null) {
            return;
        }
        //find q where q.next = p
        Node f = head, q = null;
        while (f != null && f != p) {
            q = f;
            f = f.next;
        }
        //remove head
        if (q == null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            q.next = p.next;
            if (p == tail) {
                tail = q;
            }
        }
        p.next = null;
    }

    public void reverse() {
        int n = size();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            Node pi = get(i), pj = get(j);
            int t = pi.info;
            pi.info = pj.info;
            pj.info = t;
        }
    }

    //remove second node which have info < x
    public void removeAfter(int x) {
        int c = 0;
        Node p = head;
        while (p != null) {
            if (p.info < x) {
                c++;
            }
            if (c >= 2) {
                break;
            }
            p = p.next;
        }
        remove(p);
    }

}
