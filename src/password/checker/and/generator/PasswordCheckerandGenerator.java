
package password.checker.and.generator;
import java.time.*;
import java.util.*;


 class PasswordAnalyzing {

    public int uppercase;
    public int lowercase;
    public int numbers;
    public int symbols;
    public int length;
    public boolean lengthValid;

    public static PasswordAnalyzing analyzePassword(String password) {


        PasswordAnalyzing userPassword = new PasswordAnalyzing();

        userPassword.uppercase = 0;
        userPassword.lowercase = 0;
        userPassword.numbers = 0;
        userPassword.symbols = 0;
        userPassword.length = password.length();
        userPassword.lengthValid = (password.length() >= 8);

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

        if (userPassword.uppercase < 1) {
            System.out.println("Weak: Must include at least ONE uppercase letter.");
            weak = true;
        } else score+=2;

        if (userPassword.lowercase < 1) {
            System.out.println("Weak: Must include at least ONE lowercase letter.");
            weak = true;
        } else score++;

        if (userPassword.numbers < 1) {
            System.out.println("Weak: Must include at least ONE number.");
            weak = true;
        } else score++;

        if (userPassword.symbols < 1) {
            System.out.println("Weak: Must include at least ONE symbol.");
            weak = true;
        } else score+=2;

        if (!userPassword.lengthValid) {
            System.out.println("Weak: Password must be at least 8 characters long!");
            weak = true;
        } else score += 4;

        if (!weak) {
            System.out.println("Password is STRONG ✔");
        } else {
            System.out.println("Password needs improvement. Check warnings above.");
        }

        System.out.println("Password Strength Score: " + score + "/10");
        return score;
    }
}


public class PasswordCheckerandGenerator{

    public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);

         while (true) { 
            System.out.println("\n1) Enter password manually");
            System.out.println("2) Generate random password");
            System.out.println("3) Exit");
            System.out.print("Choose option: ");
            
            int choice = input.nextInt();
            input.nextLine();  

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            String password = "";

            if (choice == 1) {
                System.out.print("Enter your password: ");
                password = input.nextLine();
            } 
            else if (choice == 2) {
                password = GenerateRandomPassword.generatePassword();
                System.out.println("Generated Password: " + password);
            }

            PasswordAnalyzing result = PasswordAnalyzing.analyzePassword(password);
            int score = PasswordAnalyzing.evaluatePassword(result);

            SessionLogger.logPasswordCheck(score);

            if (score == 10) {
                System.out.println(" Password is strong! Done.");
                break;  
            } else {
                System.out.println("❗Please try again.\n");
            }
        }
        
    }
    
}
