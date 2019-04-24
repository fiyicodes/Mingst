package converter;

import java.util.Scanner;

/**
 * @author(s) CALEB DANJUMA TAFAWA-BALEWA
 *             FIYIFOLUWA SHEDRACH ONAFESO
 *              UMAR AKIMAT
 */
public class Hexadecimal {
        int n, a;
        String x = "", x1 ="", x2="";
        Scanner sc = new Scanner (System.in);
    
    public void hexadecimalToDecimal(){
        System.out.println("Enter any hexadecimal number you want to convert to decimal");
        //Taking in the hexadecimal String
        String hex=sc.nextLine();  
        int dec = Integer.parseInt(hex,16);  
        System.out.println(dec);  

        }
        
        public void hexadecimalToBinary(){
        System.out.println("Enter any Hexadecimal number you want to convert to decimal");
         //Taking in the hexadecimal String
        String hex=sc.nextLine();  
        int dec = Integer.parseInt(hex,16);  
        System.out.println("the result of the first stage of the conversion is: " + dec);  

        while(dec > 0){
            a = dec % 2;
         x = a + "" + x;
          dec = dec/2; 
        }
        System.out.println("the dec number in binary is: " + x);
    }
}
