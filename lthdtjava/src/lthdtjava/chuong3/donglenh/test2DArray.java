/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong3.donglenh;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lợii
 */
public class test2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[][]matran=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//      matran=new int[5][7];
//      Random rnd =new Random();
//      Scanner sc=new Scanner(System.in);
//      for(int i=0;i<matran.length;i++)
//          for(int j=i+1;j<matran[i].length;j++){
//              matran[i][j]=rnd.nextInt(1000);
//              System.out.print("a[" +i+","+j+"]=");
//              String input=sc.nextLine();
//              int n=Integer.parseInt(input);
//              matran[i][j]=n;
//          }
      for(int i=0;i<matran.length;i++)
          for(int j=i+1;j<matran[i].length;j++){
              System.out.print(matran[i][j]+" ");
              System.out.println();
          }
      
    }
    
}
