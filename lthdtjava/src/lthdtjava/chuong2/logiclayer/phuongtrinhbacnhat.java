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
public class phuongtrinhbacnhat implements phuongtrinhInterface {
  private double a;
  private double b;
  private double nghiem_x;
  private String ketqua;
    public phuongtrinhbacnhat() {
    }

    public phuongtrinhbacnhat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void giaiphuongtrinh() {
        if(a!=0){
            nghiem_x=-b/a;
             ketqua = "Phuong trinh bac nhat co nghiem la " +nghiem_x;
        }else {
            if(b!=0){
                ketqua="Phuong trinh bac nhat vo nghiem";
            }
            else {
               ketqua="Phuong trinh bac nhat co vo nghiem";
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

    String getketqua() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}