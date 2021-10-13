/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AI1504Recursion;

import java.util.Stack;

/**
 *
 * @author GMT
 */
public class Main {

    static int fractorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fractorialRecursion(n - 1);
        }
    }

    static int fractoriaLoop(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= i;
        }
        return result;
    }

    static int fractorialStack(int n) {
        int result = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        while (n >= 1) {
            stack.push(n);
        }
        while (!stack.isEmpty()) {
            n = stack.peek();
            result = result * n;
        }
        return result;
    }

    static void haNoi(int n, int a, int b, int c) {
        if (n > 0) {
            haNoi(n - 1, a, c, b);
            System.err.println("Move a from disk " + a + " to " + c);
            haNoi(-1, b, a, c);
        }
    }

    static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    static int USCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }

//    boolean isPalindrome(int[] array) {
//        int length = array.length;
//        for (int index = 0; index < array.length; index++) {
//            // get the element from the start
//            int start = array[index];
//            // get corresponding element from end
//            int end = array[--length];
//            // check if elements till the middle have been compared
//            if (length & lt;index) {
//		return true;
//            }
//
//            if (start != end) {
//                return false;
//            }
//        }
//        // if the control reaches here, means all the elements were same 
//        return true;
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(fractoriaLoop(5));
//        System.out.println(fractorialRecursion(5));
//        System.out.println(fractorialStack(5));
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}
