/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vanham_ch13_recursionandadvancedalgorithms;

/**
 *
 * @author vanhk5054
 */
public class numLength {
    public static int numLength(int num) {
        int length;
        
        if (num / 10 > 0) {
            length = numLength(num/10);
        } else {
            return 1;
        }
        
        System.out.println("Returned");
        length+=1;
        
        return length;
    }
    
    public static void main(String[] args) {
        int number = 18490357;
        
        System.out.println(numLength(number));
    }
}
