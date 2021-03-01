/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong3.donglenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lợii
 */
public class testArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[]a;
//        //khoi tao
//        a=new int[4];
//        a[0]=12;
//        a[1]=9;
//        a[2]=1;
//        a[3]=15;
//        //xuat dl
//        System.out.print(a.toString());
//        System.out.println(Arrays.toString(a));
//       
//int[] b= new int[]{1, 3, -7, 8, 9, 20);
//System.out.println(Arrays.toString(b));
//System.out.println("So luong phan tu cua mang la = " +b.length);
Scanner sc=new Scanner(System.in);
System.out.print("So luong phan tu cua mang n = " );
String input=sc.nextLine();
int n= Integer.parseInt(input);
int[]c=new int[n];
//for(int i=0;i<n;i++){
//    System.out.print("c[" +i+"] = ");
//    input =sc.nextLine();
//    c[i]=Integer.parseInt(input);
//}
//    System.out.println("Gia tri cua mang vưa nhap la ");
////    System.out.println(Arrays.toString(c));
//{//for(int i=0;i<c.length;i++)

//    System.out.print(c[i] + "");
//    }
 
Random rnd=new Random();
for(int i=0;i<n;i++){
    c[i]=rnd.nextInt(1000);
    }
    System.out.println(Arrays.toString(c));
//    Arrays.sort(c);
//    System.out.println(Arrays.toString(c));
//tim kiem vet can
System.out.print("nhap gia tri can tim kiem x=");
input=sc.nextLine();
int x=Integer.parseInt(input);
//sap xep mang theo chieu tang dan
Arrays.sort(c);
System.out.println("Mang sau khi sap xep tang dan la");
//tim kiem nhi phan
int index=Arrays.binarySearch(c, x);
if(index<0){
    System.out.println("khong tim thay");
    
}
else {
    System.out.println("Tim thay tai vi tri thu"+index);
}
//int x=Integer.parseInt(input);
//boolean flag =false;
//for(int i=0;i<c.length;i++){
//    if(c[i]==x){
//        System.out.println("Gia tri can tim gia tri tim kiem co trong mang tai vi tri"+i);
//        flag=true;
//        break;
//    }
//    if(!flag){
//        System.out.println("Gia tri can tim khong co trong mang");
//    }
//}
    }

}
