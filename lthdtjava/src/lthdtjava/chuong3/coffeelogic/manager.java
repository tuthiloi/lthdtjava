/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong3.coffeelogic;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Lợii
 */
public class manager  extends person{
    private coffeeshop[] shops;
    private double income;

    public manager() {
        super();
    }

    public manager(coffeeshop[] shops, double income, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.shops = shops;
        this.income = income;
    }

    public coffeeshop[] getShops() {
        return shops;
    }

    public void setShops(coffeeshop[] shops) {
        this.shops = shops;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        String ketqua=super.toString();
        ketqua += "manager{" + "shops=" + Arrays.deepToString(shops)+ ", income=" + income + '}';
        return ketqua;
    }
    
    
    
}
