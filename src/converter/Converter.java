
package converter;
import  converter.Binary;
import  converter.Decimal;
import  converter.Hexadecimal;
import  java.util.Scanner;
/**
 *
 * @author(s) CALEB DANJUMA TAFAWA-BALEWA
 *            FIYIFOLUWA SHEDRACH ONAFESO
 *            UMAR AKIMAT
 */
public class Converter extends Binary {
  
       Scanner sc = new Scanner (System.in);
    
       
       public void Main() {
       Converter obj = new Converter();
       Decimal obj1 = new Converter();
       Hexadecimal obj2 = new Converter();
       
        System.out.println("what kind of operation would you like to perform ?");
        System.out.println("1. convert Binary to decinal");
        System.out.println("2. convert Decimal to Binary");
        System.out.println("3. convert decimal to hexadecimal");
        System.out.println("4. convert convert hexadecimal to decimal");
        System.out.println("5. convert binary to hexadecimal");
        System.out.println("6. convert hexadecimal to binary");       
        System.out.println("please input the coresponding number of the action you want to perform");
        int action = sc.nextInt();
       if(action <=6 && action >0 ){
           switch(action){
               case 1:
                   if(action == 1){
                   obj.binaryToDecimal();
                   break;
                   }
                   
               case 2:
                   if(action == 2){
                   obj1.decimalToBinary();
                   break;
                   }
               case 3:
                   if(action == 3){
                   obj1.decimalToHexadecimal();
                   break;
                   }
                   
               case 4:
                   if(action == 4){
                   obj2.hexadecimalToDecimal();
                   break;
                   }
               case 5:
                   if(action == 5){
                   obj.binaryToHexadecimal();
                   break;
                   }
               case 6:
                   if(action == 6){
                   obj2.hexadecimalToBinary();
                   break;
                   }
           }
       }
       
       
   }
       
       public static void main(String[] args) {
           
       Scanner sc = new Scanner (System.in);
       Converter obj = new Converter();  

        obj.Main();
          System.out.println("To start again yes or no to exit ");
           String input = sc.nextLine();
           
           do{
               obj.Main();
           }while(input == "Yes");
               System.out.println("Ended successfully!");
    }
    
}


  
