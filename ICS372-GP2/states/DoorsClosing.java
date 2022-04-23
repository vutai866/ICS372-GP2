package states;

import timer.Notifiable;
import timer.Timer;

/**
 * Represents the door closing state
 *
 */
public class DoorsClosing extends TrainState implements Notifiable{
	private static DoorsClosing instance;
	private Timer timer;
	/**
	 * Private constructor for the singleton pattern
	 */
	private DoorsClosing() {
		instance = this;
	}

	public static DoorsClosing getInstance() {
		if (instance == null) {
			instance = new DoorsClosing();
		}
		return instance;
	}

	@Override
	public void enter() {
//		some code

	}

	@Override
	public void exit() {
		//some code

	}
	
	/**
	   * Process clock tick event
	   */
	  @Override
	public void onTimerTick(int timerValue) {
	    TrainStateContext.getInstance().showTimeLeft(timerValue);
	}

	/**
	 * Process the timer runs out event
	 */
	 @Override
	public void onTimerRunsOut() {
	  TrainStateContext.getInstance().showTimeLeft(0);
	  TrainStateContext.getInstance().changeState(DoorsClosed.getInstance());
	}

}
