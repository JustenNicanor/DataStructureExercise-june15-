public class binary_to_decimal {
    public class BinaryToDecimal{    
        public static int getDecimal(int binary){  
      
            int deci = 0;  
            int n = 0;  
            while(true){  
              if(binary == 0){  
                break;  
              }   else {  
                  int temp = binary%10;  
                  deci += temp*Math.pow(2, n);  
                  binary = binary/10;  
                  n++;  
              }    
            }  
            return deci;  
        }  
        public static void main(String args[]){    
               
          System.out.println(getDecimal(10010) + " is the decimal of 10010");  
          
        }
      }          
}
