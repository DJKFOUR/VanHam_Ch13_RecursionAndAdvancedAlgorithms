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
public class RecursiveFactorial {
//    Create a RecursiveFactorial application that returns the factorial of an integer. The factorial of a number is
//the product of all positive integers from 1 to the number. For example, 5! = 5*4*3*2*1. Computing 5! could be
//thought of as 5*4! or more generally, n*(n–1)!. By definition, 0! is equal to 1. Compare your recursive solution
//to the nonrecursive solution created in the Factorial Review completed in Chapter 6.
    
    public static int factorial(int num) {
        int result;
        
        if (num > 0) {
            result = num * factorial(num-1);
        } else {
            return 1;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5)); //Doesnt work after 12 due to the fact that ints can't hold a number that large?
    }
}
