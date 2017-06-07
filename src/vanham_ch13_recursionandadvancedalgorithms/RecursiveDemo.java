/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vanham_ch13_recursionandadvancedalgorithms;

/**
 *
 * @author Kyle
 */
public class RecursiveDemo {

    public static void showRecursion(int num) {
        System.out.println("Entering method. num = " + num);
        if (num > 1) {
            showRecursion(num - 1);
        }
        System.out.println("Leaving method. num = " + num);
    }

    public static void main(String[] args) {
        showRecursion(2);
    }
}
