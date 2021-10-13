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
public class Main {
    public static void main(String[] args) {
        MyList ml = new MyList();
        ml.addLast(10);
        ml.addLast(30);
        ml.addFirst(60);
        ml.addFirst(40);
        ml.addFirst(50);
        ml.removeAfter(50);
        ml.traversal();
    }
}
