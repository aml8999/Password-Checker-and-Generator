
package password.checker.and.generator;

import java.time.*;
import java.time.format.*;
public class SessionLogger {
    
      public static void logPasswordCheck(int score) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a"); // 12-hour format with AM/PM
        String formattedTime = time.format(formatter);

        System.out.println("[" + formattedTime + "] Checked password Score: " + score + "/10");
    }
    
    
}
