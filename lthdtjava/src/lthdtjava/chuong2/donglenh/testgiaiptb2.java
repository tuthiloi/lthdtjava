/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong2.donglenh;

import lthdtjava.chuong2.logiclayer.phuongtrinhbachai;

/**
 *
 * @author Lợii
 */
public class testgiaiptb2 {
     public static void main(String [] args){
         System.out.println("Giai phuong trinh bac hai");
         phuongtrinhbachai obj =new phuongtrinhbachai(-2, -4, 2);
         obj.giaiphuongtrinh();
         System.out.println(obj.toString());
         
     }
}
