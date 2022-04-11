package timer;

public class Notifiable {

    /**
     * Process timer ticks
     */
    public void OnTimerTick(int timerValue);

    /**
     * Process timer runs out event
     */
    public void OnTimerRunsOut();

}// end Notifiable
