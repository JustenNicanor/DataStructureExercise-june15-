import java.util.*;   
     
public class balance_parenthesis {   
        
    @SuppressWarnings({ "rawtypes", "unchecked" })   
    public static boolean balancedParenthesis(String inputStr) {   
            
        Stack stack = new Stack();   
             
        char[] Array = inputStr.toCharArray();   
            
        for (int i = 0; i < Array.length; i++) {   
              
            char current = Array[i];   
              
            //checker if it is '(', '[' or '{'   
            if (current == '{' || current == '[' || current == '(') {     
                stack.push(current);   
                continue;   
            }   
            if (stack.isEmpty()) {    
                return false;   
            }   
            char popChar;   
            switch (current) {   
                case ')':   
                popChar = (char) stack.pop();   
                if (popChar == '{' || popChar == '[')   
                    return false;   
                break;   
                case '}':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '[')   
                    return false;   
                break;   
                case ']':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '{')   
                    return false;   
                break;   
            }   
        }   
        return (stack.isEmpty());   
    }    
    public static void main(String[] args) {   
    
        String inputStr;   
           
        Scanner sc = new Scanner(System.in);   
          
        System.out.println("ENTER YOUR PARENTHESIS:");     
        inputStr = sc.nextLine();   
           
        if (balancedParenthesis(inputStr))   
            System.out.println("BALANCE");   
        else   
            System.out.println("NOT BALANCE");
            
        sc.close();
    }   
}  

