package timer;

public interface Notifiable {

	/**
	 * Process timer ticks
	 */
	public void onTimerTick(int timerValue);

	/**
	 * Process timer runs out event
	 */
	public void onTimerRunsOut();

}// end Notifiable
