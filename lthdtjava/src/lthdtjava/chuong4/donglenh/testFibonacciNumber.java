/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong4.donglenh;
import lthdtjava.chuong4.logic.FibonacciNumber;
/**
 *
 * @author Lợii
 */
public class testFibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     FibonacciNumber fn =new FibonacciNumber();
     System.out.println("So Fibonacci tai vi n=15 la " +fn.calcFibo(15));
     for(int i=1;i<=20;i++){
         System.out.print(fn.calcFibo(i)+", ");
     }
    }
    
}
