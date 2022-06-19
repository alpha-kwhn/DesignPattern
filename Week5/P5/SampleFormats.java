//2017112071 김응

package Week5.P5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.MessageFormat;
public class SampleFormats {
    public static void main(String[] args) {

        /* Tests */
        System.out.println("Date: " +
                BasicFormat.formatDate
                        ( new GregorianCalendar(2005, 7,4).getTime()));
        // dateFormat.format() expects a Date object. Use
        // GregorianCalendar to construct a Calendar object and the
        // getTime() method to convert it to a Date.
        System.out.println("Integer: " +  BasicFormat.formatLong(1234567) );
        System.out.println("Integer: " +  BasicFormat.formatLong(67.7) );
        System.out.println("Money: " +  BasicFormat.formatMoney(9812345.678) );
        System.out.println("Money: " +  BasicFormat.formatMoney(9812345) );
        System.out.println("Money: " +  BasicFormat.formatMoney(.78) );
        System.out.println("Person: " + BasicFormat.formatPerson
                ("Weinman","Jerod","weinman"));
        // We can create and initialize an Object array on the fly, as
        // shown above.
    }
}


