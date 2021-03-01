/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong3.donglenh;

/**
 *
 * @author Lợii
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  content="Thuc khuya lam bai met qua";
        System.out.println(content);
        System.out.println("Vi tri ki tu a trong chuoi la:"+content.indexOf('a'));
        System.out.println("Vi tri cua tu met trong chuoi la:"+content.indexOf("met"));
        //
        System.out.println("chuoi mo dau bang cum tu Thuc : "+content.startsWith("Thuc"));
        System.out.println("chuoi ket thuc bang cum tu qua : "+content.endsWith("qua"));
        String temp=content.substring(25,29);
        System.out.println("Chuoi con lai :"+temp);
        //thao tac phan tach chuoi
        String[]result=content.split("\n");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        for(int i=0;i<result.length;i++){
            System.out.println(result[i].trim());
        }
        temp=content.replace('a','z');
        System.out.println(temp);
        //chuyen kieu
        temp=content.toUpperCase();
        System.out.println(temp);
        temp=content.toLowerCase();
        System.out.println(temp);
        //so sanh chuoi
        temp="Thuc";
        if(temp.compareToIgnoreCase("thuc")==0){
            System.out.println("2 chuoi bang nhau");
        }else{
            System.out.println("2 chuoi khong bang nhau");
        }
        //thao tac 9 noi chuoi
        temp=temp.concat("Van A");
        System.out.println(temp);
        //Truy xuat bang chi so
        for(int i=0;i<temp.length();i++){
            System.out.print(temp.charAt(i));
                    
        } 
        System.out.println();
        //chuyen kieu
        temp="155";
        int n=Integer.parseInt(temp);
        System.out.println("n = " +n);
        //Stringbuilder
        StringBuilder ab=new StringBuilder();
        ab.append("Thuc khuya lam bai met qua\n");
        temp=ab.toString();
        System.out.println(ab);
        
    }
    
}
