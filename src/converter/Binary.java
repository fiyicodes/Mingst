package converter;

import java.util.Scanner;

/**
 * @author(s) CALEB DANJUMA TAFAWA-BALEWA
 *            FIYIFOLUWA SHEDRACH ONAFESO
 *            UMAR AKIMAT
 */
public class Binary extends Decimal {
    //We created an object to collect input from our user
    Scanner sc = new Scanner(System.in);
    
    
    //this method converts any binary to decimal
    public void binaryToDecimal(){  
    System.out.println("Enter a binary number you want to convert to decimal");
    //Taking in the binary String
    String binaryString= sc.nextLine();  
    int decimal=Integer.parseInt(binaryString,2);  
    System.out.println("The result of the conversion is: " + decimal);
    }
    
    
    //this method converts any binary to Hexadecimal
    public void binaryToHexadecimal(){
    
    //Here we first convereted to to decimal
    System.out.println("Enter a binary number you want to convert to Hexadecimal");
    //Taking in the binary String
    String binaryString= sc.nextLine();  
    int decimal=Integer.parseInt(binaryString,2);  
    System.out.println("The reslt of the first stage of conversion is: " + decimal + " in decimal");
    //then we converted the decimal to hexadecimal here
    System.out.println("The result of the conversion is: " + Integer.toHexString(decimal) + " in Hexadecimal");
    }

}
