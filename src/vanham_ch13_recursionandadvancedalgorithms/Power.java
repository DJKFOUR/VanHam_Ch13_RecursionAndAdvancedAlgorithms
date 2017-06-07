/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vanham_ch13_recursionandadvancedalgorithms;

/**
 *
 * @author vanhk5054
 */
public class Power {
    public static int intPower(int num, int power) {
        int result;
        
        if (power > 0) {
            result = intPower(num, power-1) * num;
        } else {
            return 1;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(intPower(2,3));
    }
}
