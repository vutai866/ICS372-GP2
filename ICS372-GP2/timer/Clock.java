package timer;

// Import libraries 
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Clock {
    /** 
     * Add a listener
     * @param listener the listener to be added
    */
    public void addPropertyChangeListener(PropertyChangeListener listener){
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }// end void addPropertyChangeListener()

    /**
     * Remove a listener
     * @param listener the listener to be removed
     */
    public void removePropertyChangeListener(ProtertyChangeListener listener){
        this.propertyCHangeSupport.removePropertyChangeListener(listener);
    }// end removePropertyChangeListener()

    /**
     * Start the thread
     * @param 
     */
    private Clock(){
        thread.start();
    }// end Clock

    /**
     * Get the instance and return the clock
     * @param 
     */
    public static Clock getInstance(){
        if (clock == null){
            clock = new Clock();
        }
        return clock;
    }// end getInstance()

    /**
     * Infinite loop to generate the clock ticks Notify all users when clock ticks
     * @param 
     */
    @Override
    public void run(){
        try{
            while (true){
                Thread.sleep(1000);
                this.propertyChangeSupport.firePropertyChange(null, null, null);
            }
        } catch (InterruptedException ie){
        } // end try catch

    }// end run()
    
} // end class Clock
