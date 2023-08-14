/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatconvertion;

/**
 *
 * @author luwat
 */
public class FloatConvertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Decimal Number\t" + "Binary Conversion\t" + "Remarks");
        
        for (int i = 0; i<50; i++){
            double random = 0 + Math.random() * (100 - 0);
            random = (double) (Math.round(random*1000.0)/1000.0);
            System.out.println(random + "\t\t" + floatToBin(random));
        }
    }
    
    public static String floatToBin(double x){
        int wholeNumber = (int) Math.floor(x);
        double decimal = x - wholeNumber;
        int flag = 0;
        String remarks = "";
        
        String binary = "";
        int counter = 0;
        int y = wholeNumber;
        do{
            if (y == 0){
                binary = "0000";
                break;
            }
            
            if (counter == 4){
                binary = " " + binary;
                counter = 0;
            }
                        
            if(y%2 == 1){
                binary = "1" + binary;
            }
            else{
                binary = "0" + binary;
            }
            
          //  counter++;
            y = y/2;
        } while(y >= 1); 
        
        /*switch(counter){
            case 1:
                binary = "000" + binary;
                break;
            case 2:
                binary = "00" + binary;
                break;
            case 3: 
                binary = "0" + binary;
                break;
        }*/
        
        //Fraction Side
        
        double z = decimal;
        String fractionBinary = "";
        
        for(int counter2 = 0; counter2<5; counter2++){
            z = z*2;
            if (z == 1){
                fractionBinary = fractionBinary + "1";
                flag = 1;
                break;
            } else if(z > 1){
                z = z-1;
                fractionBinary = fractionBinary + "1";
            }else{
                fractionBinary = fractionBinary + "0";
            }
        }
        if(flag == 1){
            remarks = "Exactly";
        } else {
            remarks = "Approximate";
        }
        
        return binary + "." +fractionBinary + "\t\t" + remarks;
    }
    
}
