/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong2.logiclayer;

/**
 *
 * @author Lợii
 */
public class phuongtrinhbachai implements phuongtrinhInterface {
  private double a;
  private double b;
  private double c;
  private double X1;
  private double X2;
  private String ketqua;

    public phuongtrinhbachai() {
    }

    public phuongtrinhbachai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void giaiphuongtrinh() {
     if(a==0){
         phuongtrinhbacnhat ptb1=new phuongtrinhbacnhat(b,c);
         ptb1.giaiphuongtrinh();
         ketqua=ptb1.getketqua();
     }
     else {
         double delta=b*b-4*a*c;
         if(delta<0){
             ketqua="Phuong trinh bac hai vo nghiem";
             
         }
         else {
             if(delta==0)
             {
                 X1=-b/(2*a);
                 ketqua="Phuong trinh bac hai  nghiem kep la " +X1;
             }
             else {
                 X1=(-b+Math.sqrt(delta))/(2*a);
                 X2=(-b-Math.sqrt(delta))/(2*a);
                 ketqua="Phuong trinh bac hai co 2  nghiem phan biet : X1 " +X1+"; va X2 = " +X2;
             }
         }
     }
    }

    @Override
    public String toString() {
        if(ketqua==null|| ketqua.isEmpty()){
            giaiphuongtrinh();
        }
        return ketqua;
        
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return X1;
    }

    public void setX1(double X1) {
        this.X1 = X1;
    }

    public double getX2() {
        return X2;
    }

    public void setX2(double X2) {
        this.X2 = X2;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
  
}
