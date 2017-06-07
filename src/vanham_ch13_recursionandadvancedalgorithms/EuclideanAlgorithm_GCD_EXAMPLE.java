/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vanham_ch13_recursionandadvancedalgorithms;

/**
 *
 * @author vanhk5054
 */
public class EuclideanAlgorithm_GCD_EXAMPLE {

    public static void main(String[] args) {
        int num1 = 2322;
        int num2 = 654;
        int temp;

        while (num2 > 0) {
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1);
    }
}
