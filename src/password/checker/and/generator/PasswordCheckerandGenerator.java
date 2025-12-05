
package password.checker.and.generator;
import java.time.*;

 class PasswordAnalyzing{
     private static int uppercase;
     private static int lowercase;
     private static int numbers;
     private static int symbols;
     private static int length;
     private static boolean lengthValid;
     
    
     public static PasswordAnalyzing analyzePassword(String password){
         
         PasswordAnalyzing userPassword = new PasswordAnalyzing();
        userPassword.uppercase = 0;
        userPassword.lowercase = 0;
        userPassword.numbers   = 0;
        userPassword.symbols   = 0;
        userPassword.length    = password.length();

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) userPassword.uppercase++;
            else if (Character.isLowerCase(c)) userPassword.lowercase++;
            else if (Character.isDigit(c)) userPassword.numbers++;
            else userPassword.symbols++;
        }
         
         
         
         return userPassword;
         
         
     }
     
       public static int evaluatePassword(PasswordAnalyzing userPassword) {
        boolean weak = false;
          
         int score = 0;
        if (userPassword.uppercase <1){
            System.out.println(" Weak Password. Password must contain at least one uppercase letter.");
            weak = true;
        }else{
            score += 1;
        }
        
        if (userPassword.lowercase < 1){
            System.out.println(" Weak Password. Password must contain at least one lowercase letter!!");
            weak = true;
        }else{
            score += 1;
        }
        
       if (userPassword.numbers <1){
            System.out.println("Weak Password. Password must contain at least one number!!");
            weak = true;
       }else{
            score += 1;
        }
       
        if (userPassword.symbols <1){
            System.out.println("Weak Password. Password must contain at least one symbol!!");
            weak = true;
        }else{
            score += 1;
        }
        
        if (userPassword.lengthValid){
            System.out.println("Weak Password. Password length must be at least 8 characters!");
            weak = true;
        }else{
            score += 4;
        }

        if (!weak){
            System.out.println("Strong Password ");
        } else {
            
            System.out.println("Password needs improvement. See messages above.");
        }
        
         System.out.println("Password Strength Score: " + score + "/10");

    return score;
    }
}







     
     
     
     
     



public class PasswordCheckerandGenerator{

    public static void main(String[] args) {
       
        
        
        
        
        
        
        
        
    }
    
}
