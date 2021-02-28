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

/**
 *
 * @author Lợii
 */
public class Bai6 {
   public static void main (String[]args) throws ParseException{
       SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
       String input ="11-03-2001";
       Date ngaysinh=df.parse(input);
   person person=new person("Nguyen Van A",1,ngaysinh);
   System.out.print("Hoten: "+person.getHoten() +"; gioitinh: "+person.getGioitinh() +"; ngaysinh: " +df.format(person.getNgaysinh()));
   Student sinhvien=new Student();
   sinhvien.setHoten("Nguyen Van B");
   sinhvien.setGioitinh(1);
   sinhvien.setNgaysinh(df.parse("12-12-2002"));
   sinhvien.setTruonghoc("Dai hoc hue");
   System.out.print(sinhvien.getHoten()+ ";gioitinh "+sinhvien.getGioitinh() + ";ngaysinh: "+df.format(sinhvien.getNgaysinh()) +";"+sinhvien.getTruonghoc());
 System.out.print(sinhvien.calcTax(1200));
   Worker congnhan =new Worker();
   congnhan.setHoten("Nguyen van C");
   congnhan.setGioitinh(0);
   congnhan.setNgaysinh(df.parse("02-09-2003"));
   congnhan.setConty("IBM");
   System.out.print(congnhan.getHoten()+ ";gioitinh "
           +congnhan.getGioitinh() + ";ngaysinh : " +df.format(congnhan.getNgaysinh()) + "; cong ty"+congnhan.getConty());
  System.out.print(congnhan.calcTax(2000));
   } 
}
