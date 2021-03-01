/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjava.chuong3.donglenh;
import java.text.ParseException;
import lthdtjava.chuong3.coffeelogic.coffeeshop;
import java.text.SimpleDateFormat;
import java.util.Locale;
import lthdtjava.chuong3.coffeelogic.manager;
import java.util.Arrays;
/**
 *
 * @author Lợii
 */
public class testcoffee {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        
        coffeeshop[]a=new coffeeshop[]{new coffeeshop("Kha coffee","2 Nguyen Hue"),new coffeeshop ("White garden","4 Nguyen Hue"),new coffeeshop("Hoang truc Vien","1 Nguyen Hue")};
  
        manager[] managers = new manager[]{
            new manager(a,1000,"Le Thi A",0,df.parse("12-12-1999")),new manager(new coffeeshop[]{
                new coffeeshop("Hoang Hac","12 Ngyen Hue")},
                    2000,"Nguyen Van B",1,df.parse("12-12-2000"))
    };
System.out.println(Arrays.toString(managers));
        
    
    }
}

