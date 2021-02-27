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
public class Worker extends person{
    private String conty;

    public Worker() {
    }

    public Worker(String conty, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.conty = conty;
    }

    public String getConty() {
        return conty;
    }

    public void setConty(String conty) {
        this.conty = conty;
    }

    void getGioitinh(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNgaysinh(Date parse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
