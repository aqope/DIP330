package labdarbs1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Artur Paklin
 * @id 151RDB212
 */
public final class PerfectNumber {
    public static enum STATE {
        PERFECT,
        DEFICIENT,
        ABUNDANT      
    }
    
    public static STATE detect(int number) {
        return process(number);
    }
    
    public static STATE process(int number) {
        int i = 1;
        int sum = 0;
        
        while (i <= number) {
           if ((number % i) == 0) {
               sum += i;
           }
           
           i++;
        }
        
        sum = sum / 2;
        
        if (sum > number) {
            return STATE.ABUNDANT;
        } else if (sum == number) {
            return STATE.PERFECT;
        } else {
            return STATE.DEFICIENT;
        }
    }
    
    public static Set<Integer> divisors(int number) {
        Set divisors = new HashSet();
        
        int i = 1;
        int sum = 0;
        
        while (i <= number) {
           if ((number % i) == 0) {
               divisors.add(i);
           }
           
           i++;
        }
        
        return divisors;
    }
}
