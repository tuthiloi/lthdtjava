/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong2.donglenh;

import java.util.Scanner;

/**
 *
 * @author Lợii
 */
public class testWhile {
    
    public static void main(String[]args){
        int n=0;
        int i;
        //cong don
//        double s1=0;
//        n=100;
//        i=1;
//        while(i<=n){
//            s1=s1+(double) 1/i;
//            i=i+1;
//        }
//        System.out.println("Tong thu nhat la s1 = " +s1);
        //thay doi buoc nhay
        Scanner sc = new Scanner(System.in);
        boolean flag=false;
    
        
        while(!flag){
        System.out.print("Nhap so nguyen dương le n = ");
        String input=sc.nextLine();
        n=Integer.parseInt(input);
        flag = (n>0)&&(n%2!=0);
    }
        int s2 =0;
        i=1;

        while(i<=n)
        {
            s2=s2+i;
            i=i+2;
        }
              System.out.println("Tong thu hai la s2 = " +s2);
    }

    private static void While(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
