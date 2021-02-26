/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.donglenh.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Lợii
 */
public class bai4 {
    public static void main(String []args) throws ParseException{
    Shape htron=new circle(5, 1, 2);
//    System.out.println("Chu vi cua hinh tron la " +htron.calcPerimeter());
//    System.out.println("Dien tich cua hinh tron la " +htron.calcArea());
    System.out.println(htron.toString() );
    Shape hcn =new rectangle(3, 15, 8, 5);
//    System.out.println("Chu vi cua hinh chu nhat la " +hcn.calcPerimeter());
//    System.out.println("Dien tich cua hinh chu nhat la " +hcn. calcArea());
    System.out.println(hcn );
//    SimpleDateFormat df=new SimpleDateFormat("dd-MM-YYYY", Locale.ENGLISH);
//        Date ngay=new Date();
//        String s1 =df.format(ngay);
//        System.out.println(s1);
//        String s2="21-12-2005";
//    ngay =df.parse(s2);
//        System.out.println(ngay);
    
    }
}
