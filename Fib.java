/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

import java.lang.Math;

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n == 1 || n == 2) {
          return 1;
        } else if (n > 2) {
          return fib_recurrence(n - 1) + fib_recurrence(n - 2);
        } else {
          return -2;
        }
    }
     /* These are class / instance methods because...
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int fib = 0;
        int oneBefore = 1;
        int twoBefore = 1;
        if (n == 1 || n == 2) {
          return 1;
        } else if (n == 0) {
          return 0;
        } else if (n < 0) {
          return -1;
        } else {
          for (int i = 0; i < n; i++) {
            int tempInt = fib;
            fib = fib + oneBefore;
            twoBefore = oneBefore;
            oneBefore = tempInt;
          }
          return fib;
        }
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows ?? 
       as the size of the problem increases,
       because ??
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        if (n >= 1) {
          double phi = (1 + Math.sqrt(5)) / 2;
          double psi = (1 - Math.sqrt(5)) / 2;
          return (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);
        } else if (n == 0){
          return 0;
        } else {
          return -1;
        }
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows ?? 
       as the size of the problem increases,
       because ??
     */
}
