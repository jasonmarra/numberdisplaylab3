
/**
 * The NumberDisplay class represents a digital number display that can hold
 * values from zero to a given limit. The limit can be specified when creating
 * the display. The values range from zero (inclusive) to limit-1. If used,
 * for example, for the seconds on a digital clock, the limit would be 60, 
 * resulting in display values from 0 to 59. When incremented, the display 
 * automatically rolls over to zero when reaching the limit.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class NumberDisplay
{
    private int limit;
    private int hourValue;
    private int minuteValue;

    /**
     * Constructor for objects of class NumberDisplay.
     * Set the limit at which the display rolls over.
     */
    public NumberDisplay(int rollOverLimit)
    {
        limit = rollOverLimit;
        hourValue = 1;
        minuteValue=0;
    }

    /**
     * Return the current value.
     */
    public int getHourValue()
    {
        return hourValue;
    }
    public int getMinuteValue()
    { 
        return minuteValue;
    }

    /**
     * Return the display value (that is, the current value as a two-digit
     * String. If the value is less than ten, it will be padded with a leading
     * zero).
     */
    public String getHourDisplayValue()
    {
        if(hourValue < 10) {
            return "0" + hourValue;
        }
        else {
            return "" + hourValue;
        }
    }
    public String getMinuteDisplayValue()
    {
        if(minuteValue<10) {
            return"0" + minuteValue;
        }
        else{
            return"" + minuteValue;
        }  
    }
    
    /**
     * Set the value of the display to the new specified value. If the new
     * value is less than zero or over the limit, do nothing.
     */
    public void setValue(int replacementValue)
    {
        if((replacementValue >= 0) && (replacementValue < limit)) {
            hourValue= replacementValue;
            minuteValue = replacementValue;
        }
        
    }

    /**
     * Increment the display value by one, rolling over to zero if the
     * limit is reached.
     */
    public void minuteIncrement()
    {
        minuteValue=(minuteValue+ 1);
    }
    
    public void hourIncrement()
    {
        hourValue = hourValue + 1;
        if(hourValue >12) {
            hourValue = 1;
        }
    }
}
