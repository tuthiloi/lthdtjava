/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong3.coffeelogic;

/**
 *
 * @author Lợii
 */
public class Bill implements Cloneable {
    private int billID;
    private Product[]products;

    public Bill() {
    }

    public Bill(int i, Product[] product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
       String ketqua= "Bill" +this.billID+ "\n";
       for(int i=0;i<products.length;i++){
           ketqua+="\t"+products[i].toString()+"\n";
           
       }
       return ketqua;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Bill temp=(Bill)super.clone();
        temp.setBillID(this.billID);
        temp.products=new Product[this.products.length];
        for(int i=0;i<this.products.length;i++){
            temp.products[i]=new Product(this.products[i].getName(),this.products[i].getPrice());
            
        }
        return temp;
    }
    
}
