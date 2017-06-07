/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vanham_ch13_recursionandadvancedalgorithms;

/**
 *
 * @author vanhk5054
 */
public class SieveOfEratosthenes_FindPrimes_EXAMPLE {

    public static void main(String[] args) {
        int n = 100;
        boolean[] isPrime = new boolean[n + 1];
        
        // initially assume all integers are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int factor = 2; factor * factor <= n; factor++) {

            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                for (int j = factor; factor * j <= n; j++) {
                    isPrime[factor * j] = false;
                }
            }
        }

        // print primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
