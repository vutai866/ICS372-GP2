package timer;

// Import library
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Timer implements PropertyChangeListener{
    private int timeValue;
    private Notifiable client;

    public Timer(Notifiable client, int timeValue){
        this.client = client;
        this.timeValue = timeValue;
        Clock.getInstance().addPropertyChangeListener(this);
    }// end Timer

    /**
     * Change the time value by adding 
     * @param value
     */
    public void addTimeValue(int value){
        timeValue += value;
    }// end addTimeValue

    /**
     * Stop the timer by deleting itself from the list of observers
     * @param
     */
    public void stop(){
        Clock.getInstance().removePropertyChangeListener(this);
    }// end stop

    /**
     * Get the time value of the timer
     * @param timeValue
     */
    public int getTimeValue(){
        return timeValue;
    }// end getTimeValue

    /**
     * 
    */
    @Override
    public void propertyChange(PropertyChangeEvent arg0){
        if(--timeValue <= 0){
            client.onTimerRunsOut();
            Clock.getInstance().removePropertyChangeListener(this);
        } else{
            client.onTimerTick(timeValue);  
        }// end else
    }
}
