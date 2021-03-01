/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong3.donglenh;
import java.util.Arrays;
import lthdtjava.chuong3.coffeelogic.Product;
import lthdtjava.chuong3.coffeelogic.productCompByPrice;
import lthdtjava.chuong3.coffeelogic.ProductCompByname;
/**
 *
 * @author Lợii
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tao mang cac san pham
        Product[]sp =new Product[]{new Product("sunsik", 12),new Product("Lifeboy",5),new Product("Espresso",2),new Product ("Thien long",1)};
        System.out.println("mang bat dau la");
        System.out.println(Arrays.toString(sp));
//        Product temp;
//        for(int i=0;i<sp.length-1;i++)
//            for(int j=i+1;j<sp.length;j++)
//                if(sp[i].getPrice()>sp[j].getPrice()){
//                    temp=sp[i];
//                    sp[j]=temp;
//                }
//sap xep mang theo gia ca tang dan
    Arrays.sort(sp,new productCompByPrice());
    System.out.println("Mang sap xep tang dan theo gia ca");
    System.out.println(Arrays.toString(sp));
    System.out.println("Sap xep san pham theo ten san pham");
    Arrays.sort(sp,new  ProductCompByname());
    System.out.println(Arrays.toString(sp));
            }
}
