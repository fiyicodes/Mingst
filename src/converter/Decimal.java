package converter;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author(s) CALEB DANJUMA TAFAWA-BALEWA
 *             FIYIFOLUWA SHEDRACH ONAFESO
 *              UMAR AKIMAT
 */
public class Decimal extends Hexadecimal{
        int n, a;
        String x = "", x1 ="", x2="";
        Scanner sc = new Scanner (System.in);
        
        public void decimalToBinary(){
        System.out.println("Enter any dcimal number you want to convert to binary");
        //Taking in the decimal String
        n = sc.nextInt();
        while(n> 0){
            a = n % 2;
          
         x = a + "" + x;
          n = n/2; 
        }
        System.out.println("the dec number in binary is: " + x);
        }
        
        public void decimalToHexadecimal(){
        System.out.println("Enter any dcimal number you want to convert to hexadecimal");
        //Taking in the decimal String
        n = sc.nextInt();
        if( n < 10 && n >0){
            System.out.println("The conversion is: " +n);
        }if(n >= 10 && n<=15){
        switch( n ){
              case 10:
                  if(n == 10){
                  System.out.println("The conversion is: A");
                  break;
          }  
                  case 11:
                  if(n == 11){
                  System.out.println("The conversion is: B");
                  break;
          }  
                  case 12:
                  if(n == 12){
                  System.out.println("The conversion is: C");
                  break;
          }  
                  case 13:
                  if(n == 13){
                  System.out.println("The conversion is: D");
                  break;
          }  
                  case 14:
                  if(n == 14){
                  System.out.println("The conversion is: E");
                  break;
          }  
                  case 15:
                  if(n == 15){
                  System.out.println("The conversion is: F");
                  break;
          }  
                  default:
                      break;
          }
        }
      System.out.println(Integer.toHexString(n));
    }
        
            
}
