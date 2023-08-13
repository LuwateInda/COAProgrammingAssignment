/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalconvertion;

/**
 *
 * @author luwat
 */
public class DecimalConvertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Decimal\t\tBinary\t\tHexadecimal");
        for (int i = 0; i<19; i++){
            System.out.println(i + "\t\t" + decToBin(i) + "\t\t" + decToHex(i));
        }
        System.out.println("31" + "\t\t" + decToBin(31) + "\t\t" + decToHex(31));
        System.out.println("100" + "\t\t" + decToBin(100) + "\t\t" + decToHex(100));
        System.out.println("255" + "\t\t" + decToBin(255) + "\t\t" + decToHex(255));
        System.out.println("256" + "\t\t" + decToBin(256) + "\t\t" + decToHex(256));
    }
    
    //This function is used to convert a decimal number to binary
    public static String decToBin (int x){
        int y = x;
        String binary = "";
        int counter = 0;
        
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
            
            counter++;
            y = y/2;
        } while(y >= 1); 
        
        switch(counter){
            case 1:
                binary = "000" + binary;
                break;
            case 2:
                binary = "00" + binary;
                break;
            case 3: 
                binary = "0" + binary;
                break;
        }   
        
        return binary;
    }
    
    //This function is used to convert a decimal number to hexadecimal
    public static String decToHex(int x){
        int y = x;
        String binary = "";
        int z;
        do{
            z = y%16;
            switch(z){
                case 0:
                    binary = "0" + binary; 
                    break;
                case 1:
                    binary = "1" + binary;
                    break;
                case 2:
                    binary = "2" + binary;
                    break;
                case 3:
                    binary = "3" + binary;
                    break;
                case 4:
                    binary = "4" + binary; 
                    break;
                case 5:
                    binary = "5" + binary;
                    break;
                case 6:
                    binary = "6" + binary; 
                    break;
                case 7:
                    binary = "7" + binary;
                    break;
                case 8:
                    binary = "8" + binary;
                    break;
                case 9:
                    binary = "9" + binary; 
                    break;
                case 10:
                    binary = "A" + binary;
                    break;
                case 11:
                    binary = "B" + binary; 
                    break;
                case 12:
                    binary = "C" + binary;
                    break;
                case 13:
                    binary = "D" + binary; 
                    break;
                case 14:
                    binary = "E" + binary;
                    break;
                case 15:
                    binary = "F" + binary;
                    break;
            }
            y = y/16;
        }while (y>=1);
        
        return  binary;
    }
}
