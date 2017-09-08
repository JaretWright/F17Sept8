package f17sept8;

/**
 *
 * @author jwright
 */
public class Time1 {
    private int hour, minutes, seconds;
    
    /**
     * No argument constructor, sets time at 0:00:01
     */
    public Time1()
    {
        setTime(0,0,1);
    }
    
    /**
     * 3 argument constructor
     * @param hour - 0-23
     * @param minutes - 0-59
     * @param seconds - 0-59
     */
    public Time1(int hour, int minutes, int seconds)
    {
        setTime(hour, minutes, seconds);
    }
    
    /**
     * This method validates the arguments and sets the time
     * @param hour - valid inputs 0-23
     * @param minutes - valid inputs 0-59
     * @param seconds - valid inputs 0-59
     */
    public void setTime(int hour, int minutes, int seconds)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0-23 inclusive");
        if (minutes < 0 || minutes >= 60)
            throw new IllegalArgumentException("Minutes must be 0-59 inclusive");
        if (seconds < 0 || seconds >= 60)
            throw new IllegalArgumentException("Seconds must be 0-59 inclusive");
        
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    
}
