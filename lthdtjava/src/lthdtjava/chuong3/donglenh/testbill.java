/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong3.donglenh;

import lthdtjava.chuong3.coffeelogic.Bill;
import lthdtjava.chuong3.coffeelogic.Product;
/**
 *
 * @author Lợii
 */
public class testbill {
    public static void main(String[]args) throws CloneNotSupportedException{
        Bill a=new Bill(12,new Product[]{
            new Product("Shampoo",12),
            new Product("Closeup",21)});
        System.out.println("a = "+a);
        Bill temp=(Bill)a.clone();
        temp.setBillID(15);
        System.out.println("a = "+a);
        System.out.println("temp = "+temp);
    }

        
}
