package f17sept8;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class F17Sept8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time1 javaTime = new Time1();
        System.out.printf("The current javaTime = %s%n", javaTime.toMilitaryTime());
        
        javaTime.setTime(14, 30, 0);
        System.out.printf("The new javaTime = %s%n", javaTime.toMilitaryTime());
        
        /**
         * Create code that will continously ask the user for the time
         * until a valid time is entered.  If the user provides invalid input
         * print a message to the screen explaining why the time was invalid 
         */
        boolean invalidInput = true;
        do
        {
            Scanner keyboard = new Scanner(System.in);
            
            System.out.print("Please enter the hours: ");
            int hours = keyboard.nextInt();
            
            System.out.print("Please enter the minutes: ");
            int minutes = keyboard.nextInt();
            
            System.out.print("Please enter the seconds: ");
            int seconds = keyboard.nextInt();
            
            try{
                javaTime.setTime(hours,minutes,seconds);
                invalidInput = false;
            }
            catch (IllegalArgumentException e)
            {
                System.out.printf("The exception caught was %s%n", e.getMessage());
            }
        } while (invalidInput);
        
        System.out.printf("%nThe valid time entered was %s %n", javaTime.toMilitaryTime());
        
        System.out.printf("%nIn stadard time that is %s %n", javaTime.toStandardTime());
    }
    
}
