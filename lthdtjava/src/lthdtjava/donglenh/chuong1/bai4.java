/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.donglenh.chuong1;

import javafx.scene.shape.Rectangle;

/**
 *
 * @author Lợii
 */
public class bai4 {
    public static void main(String []args){
    circle htron=new circle(5, 1, 2);
    System.out.println("Chu vi cua hinh tron la " +htron.calcPerimeter());
    System.out.println("Dien tich cua hinh tron la " +htron.calcArea());
    
    rectangle hcn =new rectangle(3, 15, 8, 5);
    System.out.println("Chu vi cua hinh chu nhat la " +hcn.calcPerimeter());
    System.out.println("Dien tich cua hinh chu nhat la " +hcn. calcArea());
    
    
    }
}
