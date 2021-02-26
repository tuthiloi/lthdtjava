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
public class personn {
    private String hoten;
    private int gioitinh;
    private Date ngaysinh;

    public personn(String hoten, int gioitinh, Date ngaysinh) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
}

