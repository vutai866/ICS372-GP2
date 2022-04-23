package states;

import timer.Notifiable;
import timer.Timer;

/**
 * Represents the door closed state
 *
 */
public class DoorsClosed extends TrainState implements Notifiable{
	private static DoorsClosed instance;
	private Timer timer;

	/**
	 * Private constructor for the singleton pattern
	 */
	private DoorsClosed() {
		instance = this;
	}

	public static DoorsClosed getInstance() {
		if (instance == null) {
			instance = new DoorsClosed();
		}
		return instance;
	}

	@Override
	public void enter() {
		//TrainStateContext.getInstance().showDoorsClosed();

	}

	@Override
	public void exit() {
		//TrainStateContext.getInstance().showDoorsOpened();

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
	  TrainStateContext.getInstance().changeState(Accelerating.getInstance());
	}

}
