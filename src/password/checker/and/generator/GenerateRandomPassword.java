
package password.checker.and.generator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class GenerateRandomPassword {
    
      private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String  NUMBERS   = "0123456789";
    private static final String  SYMBOLS   = "!@#$%^&*()_-+=<>?/{}~";

    private static SecureRandom random = new SecureRandom();

    public static String generatePassword() {

        //

        ArrayList<Character> passwordChars = new ArrayList<>();

       
        String allAllowed = UPPERCASE + LOWERCASE + NUMBERS + SYMBOLS;

        for (int i = 0; i < 8; i++) {
            passwordChars.add(allAllowed.charAt(random.nextInt(allAllowed.length())));
        }

       
        Collections.shuffle(passwordChars);

       
        StringBuilder generatedPassword = new StringBuilder();
        for (char c : passwordChars) {
            generatedPassword.append(c);
        }

        return generatedPassword.toString();
    }
}

    
    
    
    
    

