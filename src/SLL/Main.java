/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLL;

import java.util.LinkedList;

/**
 *
 * @author GMT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SLL<Integer> sll = new SLL();
        Integer[] a = {4, 6, 7, 9, 10, 12};
        sll.addMany(a);
        sll.addFirst(20);
        sll.addFirst(25);
        sll.printAll();
        System.out.println();
        System.out.println("Vi tri cua gia tri 20 la " + sll.indexOf(20));
        SLL<String> sll1 = new SLL();
        sll1.addFirst("abc");
        sll1.addFirst("6");
        sll1.addFirst("def");
        sll1.printAll();
        System.out.println();
        //import java.util.LinkedList;
        LinkedList<Integer> sl = new LinkedList<>();
        sl.add(5);
        sl.add(7);
        sl.add(9);
        sl.add(2, 11);
        System.out.println(sl.toString());
        System.out.println(sl.size());
        System.out.println(sl.get(3));
        System.out.println(sl.indexOf(11));
    }

}
