package f17sept8;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author jwright
 */
public class InvestmentCalculator {
    

    public static void main(String[] args)        
    {
        //initial principal before interest
        BigDecimal principal = BigDecimal.valueOf(1200, 0);
        BigDecimal rate = BigDecimal.valueOf(0.1);

        //create a header
        System.out.printf("Put away $100 per month the first year you work.%n");
        System.out.printf("%4s%20s%n","Year","Amount on deposit");

        for (int year = 0; year <= 10; year++)
        {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%4d%20s%n", year, 
                    NumberFormat.getCurrencyInstance(Locale.JAPAN).format(amount));
        }
        
        System.out.printf("%n%nContributing $100 per month for the first 10 years%n");
        System.out.printf("%4s%20s%n","Year","Amount on deposit");

        for (int year = 0; year <= 40; year++)
        {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%4d%20s%n", year, 
                    NumberFormat.getCurrencyInstance(Locale.CANADA).format(amount));
            
            principal = principal.add(BigDecimal.valueOf(1200));
        }

    }
    
    
    
}
