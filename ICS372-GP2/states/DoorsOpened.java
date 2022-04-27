package states;

import timer.Notifiable;
import timer.Timer;

/**
 * Represents the door opened state
 *
 */
public class DoorsOpened extends TrainState implements Notifiable{
	private static DoorsOpened instance;
	private Timer timer;
	/**
	 * Private constructor for the singleton pattern
	 */
	private DoorsOpened() {
		instance = this;
	}

	public static DoorsOpened getInstance() {
		if (instance == null) {
			instance = new DoorsOpened();
		}
		return instance;
	}

	@Override
	public void enter() {
		TrainStateContext.getInstance().showDoorOpened();

	}

	@Override
	public void exit() {
		TrainStateContext.getInstance().showDoorClosed();

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
	  TrainStateContext.getInstance().changeState(DoorsClosing.getInstance());
	}

}
