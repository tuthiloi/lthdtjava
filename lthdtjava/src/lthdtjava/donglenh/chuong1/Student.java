/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author Lợii
 */
public class Student extends person implements TaxInterface{
    private String truonghoc;
    public int getHocluc;
    

//    public Student(String hoten, int gioitinh, Date ngaysinh) {
//        super(hoten, gioitinh, ngaysinh);
//    }
    
public Student(){
}
   
 public Student(String truonghoc,String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc=truonghoc;
 }

    public Student(String dai_hoc_hue, String xuat_sac, String nguyen_Van_A, int i, Date ngaysinh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public String getTruonghoc(){
     return truonghoc;
 }
 public void setTruonghoc(String truonghoc){
     this.truonghoc=truonghoc;
//    public Student(String hoten, int gioitinh, Date ngaysinh) {
//        super(hoten, gioitinh, ngaysinh);
 }

    @Override
    public double calcTax(double income) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    double tax;
    tax=0.01*income;
    return  tax;
  }

    public void sethocbong(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getHocluc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
 


